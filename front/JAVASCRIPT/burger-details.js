//BASKET
let basket = JSON.parse(localStorage.getItem("data")) || [];
//before, basket was [] but we want to take the infomration from localStorge. an object with "data" key is added when we click on controllers.
//  if nothing exist, return an empty array  --> in order not to get an error


window.addEventListener('load', () => {
    calculation();  //calculate porducts in basket
})


//calculate items in basket
let calculation = () => {
    let cartIcon = document.getElementById("cartAmount");

    // data of basket from localstorage
    let basketData = JSON.parse(localStorage.getItem("data")) || [];

    cartIcon.innerHTML = basketData.reduce((total, x) => total + x.item, 0);
    /*The reduce() function in JavaScript accumulates values from an array into a single result.
         total starts at 0 (the second argument in reduce()).
        Each x represents an object in the basket array.
        In every iteration, total adds x.item, accumulating the total quantity.
        the first argument(total is always de accumulator. it is "implicitaly defined as 0)
    */
};








//PICKS THE ID OF SELECTED PRODUCT/////////////////////////
const urlParams = new URLSearchParams(window.location.search);
// new URLSearchParams();      ina tool for analysis. it splits it
//(window.location.search);   return all what is after ? in a url (window.location.search) --> it looks to the navigator bar

const idProduct = urlParams.get('id_product');
//console.log("idProduct = " + idProduct);



//GET THE PORDUCT FROM API IN JSON
async function getOneProductFromAPI() {
    try {
        const response = await fetch(`http://54.161.240.158:8080/Product?id_product=${idProduct}`);
        dataJSON = await response.json();
        console.log("producto seleccionado cargado,", dataJSON);
        return dataJSON;
    }
    catch (error) {
        console.error("Error al obtener el detalle de producto:", error.message);
        return null;
    }
}



//LOAD PRODUCT///////////////////////////////////////////////////////

let selectedProduct;
let allergensArray = [];


(async () => {
    let selectedProductArray = await getOneProductFromAPI();
    let selectedProduct = selectedProductArray[0];
    console.log(selectedProduct);
    if (selectedProduct) {


    let ingredientsFromSelectedProduct = selectedProduct.ingredients;
    console.log("los ingredinetes son")
    console.log(ingredientsFromSelectedProduct)

    



    //saco los alergenos
    ingredientsFromSelectedProduct.forEach(ingredient => {
    
        if (ingredient.allergen != "none") { 
            if(!allergensArray.includes(ingredient.allergen)) allergensArray.push(ingredient.allergen) ;
            console.log("alergeno: "+ ingredient.allergen)
        }
    
    });

    console.log("Alergenos dentro de createContent:", allergensArray);


        createContent(selectedProduct); //create content
    } else {
        console.error("no se pudo cargar el producto")
    }



})();





//AUX -->GENERATE CONTENT

//get container
let container = document.getElementById("dynamic-container");


//CREAR CONTENIDO DINAMMICAMENTE, TITULO, DESCRIPCIÓN Y ALÉRENOS DEL PRODUCTO
function createContent(selectedProduct) {
    const contentContainer = document.createElement('div');
    contentContainer.classList.add('container');

    contentContainer.innerHTML = `
        <div class="image-container">
            <img src="${selectedProduct.imagePath}" alt="${selectedProduct.productTitle}">
        </div>
        <div class="text-container">
            <div class="name">
                <h1>${selectedProduct.productTitle}</h1>
            </div>
            <div class="description">
                <p>${selectedProduct.description}</p>
            </div>
            <div class="inputs">
                <button class="button-add-cart button-increase" onclick="increment()"><p>+</p></button>
                <!--at this moment, we dont use it: <button class="button-add-cart button-decrease" onclick="decrement()">-</button>-->
            </div>
            <div class="allergens" id="listAllergens"></div>
        </div>
    `;

    //SEARCH IN CONTENT OCNTAINER THE ELEMENT THAT FITS IN #LISTALLERGENS
    let containerAllergens = contentContainer.querySelector("#listAllergens");
    console.log("Elemento listAllergens es ", containerAllergens);
    
   
    containerAllergens.innerHTML = "";

   
  
    // if there is allergens, insert allergens title
    if (allergensArray.length > 0) {
        console.log("entro aqui #1")
        const titleAllergen = document.createElement("div");
        titleAllergen.classList.add("titleAllergen");
        titleAllergen.innerHTML = "<h3>ALLERGENS</h3>";
        containerAllergens.appendChild(titleAllergen);
        console.log("titulo de alergenos cargado")
    }else{
        console.log("el allergensArray esa vacio");
    }

    // add allergen
    allergensArray.forEach(allergen => {
        console.log("entro aqui #2")
        const allergenDiv = document.createElement("div");
        allergenDiv.classList.add("oneAllergen");
        allergenDiv.innerHTML = `<div>${allergen}</div>`;
        containerAllergens.appendChild(allergenDiv);
        console.log("alergeno añadido al html")
    });

    //add to the main container
    container.appendChild(contentContainer);
}






















//QUANTITY OF PRODUCTS

function increment() {

    let search = basket.find((x) => x.id_product === selectedProduct.id_product);
    //it is searching for the object wich we have selected. i t returns  wether if it exist in the basket yet

    if (search === undefined) {



        //add to the basket
        basket.push({
            ...selectedProduct,   //Appends new elements to the end of an array, and returns the new length of the array.
            item: 1,    //amount bought

        });
    } else {
        search.item++;
    }

    localStorage.setItem("data", JSON.stringify(basket));
    calculation();

}



function decrement(id) {


    let search = basket.find((x) => x.id_product === selectedProduct.id_product);

    if (!search) {
        return;
    }
    //if quantity is more than 0 quit one
    if (search.item > 0) {
        search.item--;
    }


    // if is 0 remove item from basket
    if (search.item === 0) {
        basket = basket.filter(x => x.id_product !== selectedProduct.id_product); //filter return a new array with products wich quantity is not zero. it filters when id is different than selected item to include it in array

    }

    localStorage.setItem("data", JSON.stringify(basket));
    //keyvalue: data is the key, basket is the value that we keep
    //basket is an object. if we want to safe data (not only "object") we have to transform it into a json by json.stringify "into a string"
    //console.log(basket);
    // update(selectedItem.id);
    calculation();
}










