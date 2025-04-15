//bar menu////////////////////////////////////////////////////////////////

const burgerButton = document.getElementById("burger-button");
const links = document.getElementById("nav-links")


burgerButton.addEventListener('click', () => {
    links.classList.toggle('show')      //each time we click in burger put and delete the class show, in order to display flex or none the burger menu
}
)





//cards//////////////////////////////////////////////////////////////

//burger cards
const burgersContainer = document.getElementById('burgers-container');

async function getBurgers(){   //get burger from api
    try {
        const response = await fetch('https://rickandmortyapi.com/api/character');
        const data = await response.json();

        data.results.forEach(burger => {
            createBurgerCard(burger);
        });
    } catch (error) {
        console.error("Error in getting burgers", error);
    }
}


function createBurgerCard(burger) {   
    //create void burger card
    const card = document.createElement('div');
    card.classList.add('card');

    //fill card                   //cambiar rutas de img
    card.innerHTML = `
    <img src="${burger.image}" alt="${burger.name}"/>
    <h3 class="product-name">${burger.name}</h3>
    `

    //addCart
    burgersContainer.appendChild(card);

}
window.addEventListener('load', getBurgers);





//side cards
const sidesContainer = document.getElementById('sides-container');

async function getSides(){   //get sides from api
    try {
        const response = await fetch('https://rickandmortyapi.com/api/character');
        const data = await response.json();

        data.results.forEach(side => {
            createSideCard(side);
        });
    } catch (error) {
        console.error("Error in getting sides", error);
    }
}


function createSideCard(side) {   
    //create void side card
    const card = document.createElement('div');
    card.classList.add('card');

    //fill card                   //cambiar rutas de img
    card.innerHTML = `
    <img src="${side.image}" alt="${side.name}"/>
    <h3 class="product-name">${side.name}</h3>
    `

    //addCart
    sidesContainer.appendChild(card);

}
window.addEventListener('load', getSides);






//drinks cards
const drinksContainer = document.getElementById('drinks-container');

async function getDrinks(){   //get drink from api
    try {
        const response = await fetch('https://rickandmortyapi.com/api/character');
        const data = await response.json();

        data.results.forEach(drink => {
            createDrinkCard(drink);
        });
    } catch (error) {
        console.error("Error in getting drinks", error);
    }
}


function createDrinkCard(drink) {   
    //create void drink card
    const card = document.createElement('div');
    card.classList.add('card');

    //fill card                   
    card.innerHTML = `
    <img src="${drink.image}" alt="${drink.name}"/>
    <h3 class="product-name">${drink.name}</h3>
    `

    //addCart
    drinksContainer.appendChild(card);

}
window.addEventListener('load', getDrinks);
