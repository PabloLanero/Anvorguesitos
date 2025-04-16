//To show the user name on the website
let userIntroduction = document.getElementById("user-introduction")


function showUser(div){
    //Aqui iria la logica para recoger el nombre del usuario
    div.innerHTML=`
<h1>Welcome, user!</h1>
`    
}

showUser(userIntroduction)


//To show the user's options 
let optionsUser = document.getElementById("optionsUser")

function seeOptions(div){
    //Aqui ira la logica para sacar las opciones que tenga el usuario
    //Lo dejo hardcodeado para que se vea como se aplica
    div.innerHTML = `
    <div class="option selected" onClick="beSelected(seeData), showOption(seeData)" id="seeData">
        <p>See your data</p>
    </div>
    <div class="option" onClick="beSelected(orders), showOption(orders)" id="orders">
        <p>Orders realized</p>
    </div>

    <div class="option" onClick="beSelected(employees), showOption(employees)" id="employees">
        <p>Employees</p>
    </div>

    <div class="option" onClick="beSelected(cvs), showOption(cvs)" id="cvs">
        <p>CVs</p>
    </div>

    `
}

seeOptions(optionsUser)

//To controll how each option is focused
function beSelected(option){
    let options = optionsUser.getElementsByTagName("div")
    //Se los quita a todos el atributo "selected"
    for (let index = 0; index < options.length; index++) {
        const element = options[index];
        element.classList.remove("selected")
    }
    //Se lo añade al div seleccionado
    option.classList.add("selected")
}



function showOption(optionContent){
    const id = optionContent.id
    let contentDiv = document.getElementById("contentDiv")

    switch (id) {
        case "seeData":
            contentDiv.innerHTML=`
            seeData
            `
            
            break;
            
        case "orders":
            contentDiv.innerHTML=`
                orders
            `
                
            break;
        case "employees":
            contentDiv.innerHTML=`
                employees
            `
                
            break;

        case "cvs":
            contentDiv.innerHTML=`
                 cvs   
            `
                    
            break;
    
        default:
            break;
    }

}