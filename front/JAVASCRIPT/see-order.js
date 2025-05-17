





//basket//////////////////////////////////////////////////////
let basket = JSON.parse(localStorage.getItem("data")) || [];



let calculation = () => {
    let cartIcon = document.getElementById("cartAmount");

     // data of basket from localstorage
     let basketData = JSON.parse(localStorage.getItem("data")) || [];
    
    cartIcon.innerHTML = basketData.reduce((total, x) => total + x.item, 0);
    
};




//CARD CREATOR//////////////////////////////////////////////////////////////
function cardCreator(basket){

    const container = document.getElementById("container-for-cards");
    container.innerHTML = ""
    basket.forEach(product => {

     const card = document.createElement("div");
    card.classList.add("card");

    card.innerHTML = `
     <div class="product general">
        <div class="product-image">
            <img src="${product.imagePath }" alt="${product.productTitle}"/>
        </div>
        <div class="product-details">
            <div class="product-name">
                <h3>${product.productTitle}</h3>
            </div>
            <div class="product-numbers">
                <div class="product-cuantity">
                    <p>Cantidad: ${product.item}</p>
                </div>
                <div class="product-price">
                    <p>${product.price*product.item} €</p>
                </div>
            </div>
        </div>
        <div class="product-button">
        <button onClick="increment(${product.idProduct})"><p>+</p></button>
            <button onClick="decrement(${product.idProduct})"><p>-</p></button>
        </div>
    </div>
    <hr>

    `;    
    container.appendChild(card)
    })

   
 ;

}


//function to increase the amount of products
function increment(id) {
    let selectedItem = id;

    let search = basket.find((x) => x.idProduct === selectedItem);
    //it is searching for the object wich we have selected. it returns wether if it exist in the basket yet

    if (search === undefined) {

        //we find the object from api and we save it in a variable
        const  productData = products.find((product) => product.idProduct === selectedItem);

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
    
    cardCreator(basket)
    calculation();
    calculatorTotalPrice()
    
}



//Function to decrease the amount of products
function decrement(id) {
    let selectedItem = id;

    let search = basket.find((x) => x.idProduct === selectedItem);
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
        basket = basket.filter(x => x.idProduct !== selectedItem); //filter return a new array with products wich quantity is not zero. it filters when id is different than selected item to include it in array

    }

    localStorage.setItem("data", JSON.stringify(basket));
    //keyvalue: data is the key, basket is the value that we keep
    //basket is an object. if we want to safe data (not only "object") we have to transform it into a json by json.stringify "into a string"
    //console.log(basket);
    // update(selectedItem.id);
    cardCreator(basket)
    calculation();
    calculatorTotalPrice()
}




//BASKET TOTAL PRICE///////////////////////

let calculatorTotalPrice = () => {
    
    const totalAmount = document.getElementById("totalAmount");

    let basketData = JSON.parse(localStorage.getItem("data")) || [];

    let totalPrice = basketData.reduce((sumatory, product) => {
        return sumatory + (product.price * product.item);
    }, 0);


    totalAmount.innerText = `${totalPrice} €`;
}




//charge  cart and products
window.addEventListener('load', () => {
    cardCreator(basket);
    calculation();
    calculatorTotalPrice();
});
















