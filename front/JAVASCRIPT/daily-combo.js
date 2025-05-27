let products = []
let burguers = []
let sideDish = []
let drinks = []
let precioTotal = 0
async function callAPI(){
    let results = await fetch("http://localhost:8080/api/Product")

    products = await results.json()
    products.forEach(element => {
        if(element.category === "BURGER")burguers.push(element);
        if(element.category === "SIDEDISH")sideDish.push(element);
        if(element.category === "DRINK")drinks.push(element);
        
    });
    console.log(products)
    newOrder()
}

function getBurguer(){
    let div = document.getElementById("burguer")
    let id = 0//Math.random().toPrecision(3)
    do{
        id = Math.floor(Math.random().toPrecision(1) * burguers.length)
    
    }while(id>=burguers.length && id>=1)
    let product = burguers[id]
    
    
    console.log("id de la hamburguesa",id)
    div.innerHTML= `
    <div class="product general">
        <div class="product-image">
            <img src="${product.imagePath }" alt="${product.productTitle}"/>
        </div>
        <div class="product-details">
            <div class="product-name">
                <h3>${product.productTitle}</h3>
            </div>
            <div class="product-numbers">
                
                <div class="product-price">
                    <p>${product.price} €</p>
                </div>
            </div>
        </div>
    </div>
    `
    precioTotal += product.price 

} 

function getSideDish(){
    let div = document.getElementById("sidedish")
    let id = 0//Math.random().toPrecision(3)
    do{
        id = Math.floor(Math.random().toPrecision(1) * sideDish.length)
    }while(id>=sideDish.length && id>=1)

    let product = sideDish[id]
    
    
    console.log("id del sidedish",id)
    div.innerHTML= `
    <div class="product general">
        <div class="product-image">
            <img src="${product.imagePath }" alt="${product.productTitle}"/>
        </div>
        <div class="product-details">
            <div class="product-name">
                <h3>${product.productTitle}</h3>
            </div>
            <div class="product-numbers">
                
                <div class="product-price">
                    <p>${product.price} €</p>
                </div>
            </div>
        </div>
    </div>
    `
    precioTotal += product.price 
}

function getDrink(){
    let div = document.getElementById("drink")
    let id = 0//Math.random().toPrecision(3)
    do{
        id = Math.floor(Math.random().toPrecision(1) * drinks.length)
    }while(id>=drinks.length && id>=1)

    let product = drinks[id]
    
    
    console.log("id de la bebida",id)
    div.innerHTML= `
    <div class="product general">
        <div class="product-image">
            <img src="${product.imagePath }" alt="${product.productTitle}"/>
        </div>
        <div class="product-details">
            <div class="product-name">
                <h3>${product.productTitle}</h3>
            </div>
            <div class="product-numbers">
                
                <div class="product-price">
                    <p>${product.price} €</p>
                </div>
            </div>
        </div>
    </div>
    `
    precioTotal += product.price 
}


function showPrice(){
    let priceDiv = document.getElementById("totalAmount")
    priceDiv.innerHTML = precioTotal
}

function newOrder(){
    precioTotal = 0
    getBurguer()
    getSideDish()
    getDrink()
    showPrice()
}


//Aqui todo lo que se ejecuta despues de haber cargado todo
callAPI()
