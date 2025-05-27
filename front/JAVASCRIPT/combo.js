
const URL_API = "http://54.161.240.158:8080/Product"//ndopoint con todos los productos


//getData Todos los productos
async function getProducts() {
    const response = await fetch(URL_API);
    const responseJSON = await response.json();
    return responseJSON
}

//función getrandomitem
function getRandomItem(arr) {
    return arr[Math.floor(Math.random() * arr.length)];
}


//load data Todos los productos
async function makeCombo() {
    const products = await getProducts();


    ///////////////////////////////////////////////////////////////////
    let burguerContainer = document.getElementById('burger-container');

    let burgers = (products.slice(0, 15));
    ////console.log("lista de hamburguesas")
    ////console.log(burgers);
    const randomBurger = getRandomItem(burgers);
    ////console.log("hamburguesa elegida: ")
    console.log(randomBurger)

    let nombreBurger = randomBurger.productTitle;
    console.log(nombreBurger);
    let elementNombreBurger = document.getElementById('burger-name')
    elementNombreBurger.textContent = nombreBurger

    let priceBurger = randomBurger.price;
    console.log(priceBurger);
    let elementPriceBurger = document.getElementById('burger-price')
    elementPriceBurger.textContent = `${priceBurger} $`


    //meto foto
    let photoBurger = document.createElement('img');
    photoBurger.src = randomBurger.imagePath;

    burguerContainer.appendChild(photoBurger);
    //////////////////////////////////////////////////////////////////
    let sideDisheContainer = document.getElementById('side-dishe-container');

    let sideDishes = (products.slice(15, 18));
    ////console.log("lista de guarniciones")
    ////console.log(sideDishes);
    const randomSideDishe = getRandomItem(sideDishes);
    ////console.log("guarnicion elegida: ")
    ////console.log(randomSideDishe)

    let nombreSideDishe = randomSideDishe.productTitle;
    console.log(nombreSideDishe);
    let elementNombreSideDishe = document.getElementById('side-dishe-name')
    elementNombreSideDishe.textContent = nombreSideDishe

    let priceSideDishe = randomSideDishe.price;
    console.log(priceSideDishe);
    let elementPriceSideDishe = document.getElementById('side-dishe-price')
    elementPriceSideDishe.textContent = `${priceSideDishe} $`

    //meto foto
    let photoSideDishe = document.createElement('img');
    photoSideDishe.src = randomSideDishe.imagePath;
    sideDisheContainer.appendChild(photoSideDishe);

    ///////////////////////////////////////////////////////
    let drinkContainer = document.getElementById('drink-container');

    let drinks = (products.slice(18, 25));
    ////console.log("lista de bebidas")
    ////console.log(drinks);
    const randomDrink = getRandomItem(drinks);
    ////console.log("bebida elegida: ")
    ////console.log(randomDrink)
    let nombreDrink = randomDrink.productTitle;
    console.log(nombreDrink);
    let elementNombreDrink = document.getElementById('drink-name')
    elementNombreDrink.textContent = nombreDrink

    let priceDrink = randomDrink.price;
    console.log(priceDrink);
    let elementPriceDrink = document.getElementById('drink-price')
    elementPriceDrink.textContent = `${priceDrink} $`

    //meto foto
    let photoDrink = document.createElement('img');
    photoDrink.src = randomDrink.imagePath;
    drinkContainer.appendChild(photoDrink);
}
makeCombo();


//que se genere al clicar boton

newComboButton = document.getElementById('new-combo-button')

newComboButton.addEventListener("click", () => {
    makeCombo();})


  


















































