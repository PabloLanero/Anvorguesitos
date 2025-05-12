





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
    </div>
    <hr>

    `;    
    container.appendChild(card)
    })

   
 ;

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
















