



//PICKS THE ID OF SELECTED PRODUCT/////////////////////////
const urlParams = new URLSearchParams(window.location.search); 
        // new URLSearchParams();      ina tool for analysis. it splits it
        //(window.location.search);   return all what is after ? in a url (window.location.search) --> it looks to the navigator bar

const idProduct = urlParams.get('id_product');
//console.log("idProduct = " + idProduct);




//function to call api and pick a product. we use the value of idProduct from nav bar

async function getOneProductFromAPI(){
    try
    {
        const response = await fetch(`http://localhost:8080/api/Product?id_product=${idProduct}`);
        dataJSON = await response.json();
        console.log("producto seleccionado cargado,", dataJSON);
        return dataJSON;
    }
    catch(error){
        console.error("Error al obtener el detalle de producto:", error.message);
         return null;
    }
}


//ASYNC FUNCTION TO LOAD

(async () => {
let selectedProduct = await getOneProductFromAPI();
if(selectedProduct){
    console.log(selectedProduct);
createContent(selectedProduct[0]); //create content
}else{
console.error("no se pudo cargar el producto")
}
})();





//GENERATE CONTENT

//get container
let container = document.getElementById("dynamic-container");


//create content
function createContent(selectedProduct){


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
    <!--<div class="ingredients">
        
    </div>-->
    <div class="inputs">
                    <button  class="button-add-cart button-increase" onclick="increment()">+</button>
                    <button  class="button-add-cart button-decrease" onclick="decrement()">-</button>
    </div>
</div>
`;
container.appendChild(contentContainer);
}







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





//basket//////////////////////////////////////////////////////////////////////////////////////////////////////////////
let basket = JSON.parse(localStorage.getItem("data")) || [];
//before, basket was [] but we want to take the infomration from localStorge. an object with "data" key is added when we click on controllers.
//  if nothing exist, return an empty array  --> in order not to get an error



//QUANTITY OF PRODUCTS

function increment(){
    
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