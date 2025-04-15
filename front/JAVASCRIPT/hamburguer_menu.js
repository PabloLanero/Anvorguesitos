//bar menu////////////////////////////////////////////////////////////////

const burgerButton = document.getElementById("burger-button");
const links = document.getElementById("nav-links")


burgerButton.addEventListener('click', () => {
    links.classList.toggle('show')      //each time we click in burger put and delete the class show, in order to display flex or none the burger menu
}
)
