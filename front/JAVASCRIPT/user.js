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
            <div class="user-data-container" >
                <div class="name">
                    <p><b>Nombre:</b> Pablo</p>
                </div>
                <div class="lastName">
                    <p><b>Apellido:</b> Lanero Pérez</p>
                </div>
                <div class="email">
                    <p><b>Email:</b> a28841@svalero.com</p>
                </div>
                <div class="phone-number">
                    <p><b>Phone Number:</b> 123456789</p>
                </div>
            </div>
            
            
            `
            
            break;
            
        case "orders":
            contentDiv.innerHTML=`
                <div class="orders-data-container">
                    <table>
                        <tr>
                            <th>Id Order</th>
                            <th>Order date</th>
                            <th>Shipping Address</th>
                            <th>Transsaction</th>
                            <th>Order Status</th>
                        </tr>
                        <tr>
                            <td><a href="#">1</a></td>
                            <td>20/01/2004</td>
                            <td>Calle Falsa 123</td>
                            <td>Pending</td>
                            <td>On going</td>
                        </tr>
                        <tr>
                            <td><a href="#">1</a></td>
                            <td>20/01/2004</td>
                            <td>Calle Falsa 123</td>
                            <td>Pending</td>
                            <td>On going</td>
                        </tr>
                        <tr>
                            <td><a href="#">1</a></td>
                            <td>20/01/2004</td>
                            <td>Calle Falsa 123</td>
                            <td>Pending</td>
                            <td>On going</td>
                        </tr>

                    </table>
                </div>
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

let objectInitial = {"id": "orders"}
showOption(objectInitial)