let products = []; // we set the array that will envolve all products


//we define function to call api
async function callAPI() {
    try {
        const response = await fetch("http://localhost:8080/api/Product");
        data = await response.json(); // Guardamos los productos en la variable global
        console.log("Productos cargados:", data);
        return data
    } catch (error) {
        console.error("Error al obtener los productos:", error);
        return []
    }
}




// Immediately Invoked Async Function
(async () => {
    
     products = await callAPI();
     
    loadProducts() // Use the products here

    
})();



///to load products

function loadProducts(){

    const burgersContainer = document.getElementById("burgers-container");
    getProducts("BURGER", burgersContainer);
    
    const sidesContainer = document.getElementById("sides-container");
    getProducts("SIDEDISH", sidesContainer);
    
    const drinksContainer = document.getElementById("drinks-container");
    getProducts("DRINK", drinksContainer);
    
    calculation();  //calculate porducts in basket
    setUpProductClick();
    
    }
    ;
    



//CARD CREATOR//////////////////////////////////////////////////////////////
function createProductCard(product, container) {
    const card = document.createElement('div');
    card.classList.add('card');

    card.innerHTML = `
    <div id="product-id-${product.id_product}">
        <img src="${product.imagePath}" alt="${product.productTitle || 'Product Image'}"  class="product-photo" data-id="${product.id_product}">
        <div class="card-details">
            <h4 class="product-name">${product.productTitle}</h4>
            <div class="inputs">
                <div class="price-quantity">
                    <p class="price">${product.price}€</p>  
                </div>
                <div class="quantity-controllers">
                    <button onclick="increment(${product.id_product})"   class="button-add-cart button-increase">+</button>
                    <button onclick="decrement(${product.id_product})" class="button-add-cart button-decrease">-</button>
                </div>
            </div>
        </div>
    </div>
    `;
    container.appendChild(card);
}



/////////product by categories////////////////////

 async function getProducts(category, container){          //it must be async because we call api
    try {
       
        //group by category in a new array 
        const arrayProductsByCategory = products.filter(product => product.category === category);

console.log("hola");

        //create card
        arrayProductsByCategory.forEach(product => createProductCard(product, container)
    );


    }catch (error) {
        console.error(`Error in getting product`, error);
    }
}






// WHEN WE CLICK IN AN IMAGE WE ARE REDIRECTED TO THE DETAIL-PAGE/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


function setUpProductClick(){
    const allImages = document.querySelectorAll(".product-photo");


//we add and eventlistener onclick for images
    allImages.forEach((element) =>{
        element.addEventListener("click", ()=>{

            // we capture id
            let id = parseInt(element.getAttribute("data-id"));

            //find the product that has this id
            const selectedProduct =products.find(prod => prod.id_product === id);

            //we keep this productin localstorage
            localStorage.setItem("clickedProduct", JSON.stringify(selectedProduct));

            //redirect to detail-page with the searchArgument
            window.location.href =`burger-detail.html?idProduct=${id}`;
        });
    });
}




//basket//////////////////////////////////////////////////////////////////////////////////////////////////////////////
let basket = JSON.parse(localStorage.getItem("data")) || [];
//before, basket was [] but we want to take the infomration from localStorge. an object with "data" key is added when we click on controllers.
//  if nothing exist, return an empty array  --> in order not to get an error





// Functions to change  quantity  
function increment(id) {
    let selectedItem = id;

    let search = basket.find((x) => x.id_product === selectedItem);
    //it is searching for the object wich we have selected. it returns wether if it exist in the basket yet

    if (search === undefined) {

        //we find the object from api and we save it in a variable
        const  productData = products.find((product) => product.id_product === selectedItem);

        //add to the basket
        basket.push({
            ...productData,   //Appends new elements to the end of an array, and returns the new length of the array.
            item: 1,    //amount bought

        });
    } else {
        search.item++;
    }


    localStorage.setItem("data", JSON.stringify(basket));
    //keyvalue: data is the key, basket is the value that we keep
    //basket is an object. if we want to safe data (not only "object") we have to transform it into a json by json.stringify "into a string"
    console.log("actualizing basket")
    calculation();
    console.log("product added")
}

function decrement(id) {
    let selectedItem = id;

    let search = basket.find((x) => x.id_product === selectedItem);
    //it is searching for the object wich we have selected. i t returns  wether if it exist in the basket yet

    //if object doesn´t exist
    if (!search) {
        return;
    }
 //if quantity is more than 0 quit one
    if (search.item > 0) {
        search.item--;
    }


// if is 0 remove item from basket
    if (search.item === 0) {
        basket = basket.filter(x => x.id_product !== selectedItem); //filter return a new array with products wich quantity is not zero. it filters when id is different than selected item to include it in array

    }

    localStorage.setItem("data", JSON.stringify(basket));
    //keyvalue: data is the key, basket is the value that we keep
    //basket is an object. if we want to safe data (not only "object") we have to transform it into a json by json.stringify "into a string"
    //console.log(basket);
    // update(selectedItem.id);
    calculation();
}

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



