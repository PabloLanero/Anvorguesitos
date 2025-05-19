//To show the user name on the website

let objUser = sessionStorage.getItem("user");

if (objUser != null) {
    objUser = JSON.parse(objUser);
} else {
    window.location.href = "login.html";
}
console.log("this is the object that contains datas from user")
console.log(objUser)



//MOSTRAR ARRIBA EL NOMBRE DE SUARIO
function showUser(div) {
    //Aqui iria la logica para recoger el nombre del usuario
    div.innerHTML = `
    <h1>Welcome, ${objUser.name} ${objUser.lastName}!</h1>
    `
}
let userIntroduction = document.getElementById("user-introduction")
showUser(userIntroduction)





//To show the user's options 
let optionsUser = document.getElementById("optionsUser")

function seeOptions(div) {
    //Aqui ira la logica para sacar las opciones que tenga el usuario
    let administrator = objUser.admin

    if (administrator) {
        //Lo dejo hardcodeado para que se vea como se aplica

        div.innerHTML = `
        <div class="option selected" onClick="beSelected('seeData'), showOption('seeData')" id="seeData">
            <p>See your data</p>
        </div>
        <div class="option" onClick="beSelected('orders'), showOption('orders')" id="orders">
            <p>Orders realized</p>
        </div>

        <div class="option" onClick="beSelected('employees'), showOption('employees')" id="employees">
            <p>Employees</p>
        </div>

        <div class="option" onClick="beSelected('cvs'), showOption('cvs')" id="cvs">
            <p>CVs</p>
        </div>

        `

    } else {
        div.innerHTML = `
        <div class="option selected" onClick="beSelected('seeData'), showOption('seeData')" id="seeData">
            <p>See your data</p>
        </div>
        <div class="option" onClick="beSelected('orders'), showOption('orders')" id="orders">
            <p>My Orders</p>
        </div>   

        `
    }
}

seeOptions(optionsUser)

/**
 * 
 * To controll how each option is focused, it removes the CSS "selected" 
 * from every option and add to the selected one the CSS removed
 * 
 */
function beSelected(option) {

    let options = optionsUser.getElementsByTagName("div")
    //Se los quita a todos el atributo "selected"
    for (let index = 0; index < options.length; index++) {
        const element = options[index];
        if (element.id != option) {
            element.classList.remove("selected");
        } else {
            {
                element.classList.add("selected")
            }
        }

        console.log("opcion " + option + "lo lee bien");
    }
}

beSelected("seeData")



//ORDERS
let orders


async function callAPI(URL) {
    let results = await fetch(URL)
    orders = await results.json()

}

if(objUser.admin){
    callAPI("http://54.161.240.158:8080/OrderHeader")
}else{
    callAPI(`http://54.161.240.158:8080/OrderHeader?idUser=${objUser.id}`)
}









/*
 * This function is to show the information depending on 
 * what div has been selected
 */
async function showOption(optionContent) {
    //First, we get the id
    const id = optionContent
    let contentDiv = document.getElementById("contentDiv")
    //Now, in case of the div selected, we will show diferent kind of information
    switch (optionContent) {
        //To check your personal data
        case "seeData":
            contentDiv.innerHTML = `
            <div class="user-data-container" >
                <div class="name">
                    <p><b>Nombre:</b> ${objUser.name}</p>
                </div>
                <div class="lastName">
                    <p><b>Apellido:</b> ${objUser.lastName}</p>
                </div>
                <div class="email">
                    <p><b>Email:</b> ${objUser.email}</p>
                </div>
                <div class="phone-number">
                    <p><b>Phone Number:</b> ${objUser.mobilePhone}</p>
                </div>
                <div class="change-account">
                    <a href="./login.html">Change account?</a>
                </div>
            </div>
            `
            break;
        //To check the orders
        case "orders":
            contentDiv.innerHTML = "";
            let datos = ""
            datos += `
                <div class="orders-data-container">
                    <table>
                    <tbody>
                        <tr>
                            <th>Id Order</th>
                            <th>Order date</th>
                            <th>Shipping Address</th>
                            <th>Transsaction</th>
                            <th>Order Status</th>
                        </tr>
                        `
            orders.forEach(element => {
                console.log(element)
                datos += `
                            <tr>
                                <td><a href="./see-order-details.html?idOrder=${element.idOrderHeader}"> ${element.idOrderHeader} </a></td>
                                <td> ${element.orderDate} </td>
                                <td> ${element.shippingAddress} </td>
                                <td> ${element.accepted} </td>
                                <td> ${element.orderStatus} </td>
                            </tr>
                `
            });
            datos += `
                    </tbody>
                    </table>
                </div>
        `

            contentDiv.innerHTML = datos
            break;
        //To check the employees
        case "employees":
            contentDiv.innerHTML = `
                <div class="orders-data-container" id="orders-data-container"></div>`


                    arrayListEmployees = await getEmployeesFromAPI();
                    console.log(arrayListEmployees);

                    employeesCardCreator(arrayListEmployees); // 


                

            break;
        //To see the cv
        case "cvs":
            contentDiv.innerHTML = `
                <table>
                    <tr>
                        <th>Vacancy</th>
                        <th>CV</th>
                    </tr>
                    <tr>
                        <td>Web Developer</td>
                        <td><a href="../PDFolder/Tech.pdf" target="_blank">See CV</a></td>
                    </tr>
                    <tr>
                        <td>Web Developer</td>
                        <td><a href="../PDFolder/Tech.pdf" target="_blank">See CV</a></td>
                    </tr>
                    <tr>
                        <td>Web Developer</td>
                        <td><a href="../PDFolder/Tech.pdf" target="_blank">See CV</a></td>
                    </tr>
                    <tr>
                        <td>Web Developer</td>
                        <td><a href="../PDFolder/Tech.pdf" target="_blank">See CV</a></td>
                    </tr>
                    <tr>
                        <td>Web Developer</td>
                        <td><a href="../PDFolder/Tech.pdf" target="_blank">See CV</a></td>
                    </tr>
                    <tr>
                        <td>Cocinero</td>
                        <td><a href="../PDFolder/Tech.pdf" target="_blank">See CV</a></td>
                    </tr>
                </table>
            `

            break;

        default:
            console.log("error en la funcion showOption", id)
            break;
    }

}
//To load the project and have some information


showOption("seeData")






























//CREAR EMPLEADOS DINAMICAMENTE: RECPERARLOS DE LA API + CREAR TARJETAS + METERLO EN SHOWOPTION

let arrayListEmployees = [];

//we define function to call api
async function getEmployeesFromAPI() {
    try {
        const response = await fetch("http://54.161.240.158:8080/Employee");
        let data = await response.json(); // Guardamos los productos en la variable global
        console.log("employees cargados:", data);
        return data
    } catch (error) {
        console.error("Error al obtener los empleados:", error);
        return []
    }
}



(async () => {
    arrayListEmployees = await getEmployeesFromAPI();
    console.log("se ha almacenado en arraylist empolyees: ", arrayListEmployees);
    showOption("employees");
})




//function to create card for employees
function employeesCardCreator(arrayListEmployees) {
    const container = document.getElementById("orders-data-container");

if(!container){
    console.error("el contenedor orders-data-container no se ha encontrado")
    return
}

    container.innerHTML = "";
    let html = `<div class="orders-data-container">
                    <table>
                    <tbody>
                        <tr>
                            <th>Id Order</th>
                            <th>Order date</th>
                            <th>Shipping Address</th>
                            <th>Transsaction</th>
                            <th>Order Status</th>
                            <th>Salary</th>
                        </tr>`

    arrayListEmployees.forEach(employee => {

    

        html +=
            `
     <tr>
            <td> ${employee.idEmployee} </td>
            <td> ${employee.employeeFirstName} </td>
            <td> ${employee.employeeLastName} </td>
            <td>  ${employee.emailEmployee}</td>
            <td>  ${employee.phoneEmployee}</td>
            <td> ${employee.salary} </td>
     </tr>
    `
    
    })


    html += `</tbody></table></div>`
    container.innerHTML = html

    

}

