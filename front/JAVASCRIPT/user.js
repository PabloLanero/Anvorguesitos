//To show the user name on the website

let userDatas = JSON.parse(sessionStorage.getItem("user"))
console.log(userDatas)

/*Check if first it is logged
if not, redirected to the login page
if is logged, 
- change the section "login" to the username 
*/ 
if(!userDatas){
    window.location.href = "login.html"
}

/**
 * 
 * This function is to see the name at the top of the page
 *  
*/
function showUser(div){
    //Aqui iria la logica para recoger el nombre del usuario
    div.innerHTML=`
    <h1>Welcome, ${userDatas.name} ${userDatas.lastName}!</h1>
    `    
}

let userIntroduction = document.getElementById("user-introduction")
showUser(userIntroduction)


//To show the user's options 
let optionsUser = document.getElementById("optionsUser")

function seeOptions(div){
    //Aqui ira la logica para sacar las opciones que tenga el usuario
    let administrator = userDatas.admin

    if(administrator){
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
        
    }else{
        div.innerHTML = `
        <div class="option selected" onClick="beSelected(seeData), showOption(seeData)" id="seeData">
            <p>See your data</p>
        </div>
        <div class="option" onClick="beSelected(orders), showOption(orders)" id="orders">
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
function beSelected(option){
    let options = optionsUser.getElementsByTagName("div")
    //Se los quita a todos el atributo "selected"
    for (let index = 0; index < options.length; index++) {
        const element = options[index];
        if(element.id === option ) element.classList.add("selected")
        element.classList.remove("selected")
    }
    //Se lo añade al div seleccionado
    
}

beSelected("seeData")



let orders 
let employees = []
async function callAPI(URL){
    let results = await fetch(URL)
    orders = await results.json()
}

callAPI("http://localhost:8080/api/OrderHeader")


/*
 * This function is to show the information depending on 
 * what div has been selected
 */
function showOption(optionContent){
    //First, we get the id
    const id = optionContent.id
    let contentDiv = document.getElementById("contentDiv")
    //Now, in case of the div selected, we will show diferent kind of information
    switch (optionContent) {
        //To check your personal data
        case "seeData":
            contentDiv.innerHTML=`
            <div class="user-data-container" >
                <div class="name">
                    <p><b>Nombre:</b> ${userDatas.name}</p>
                </div>
                <div class="lastName">
                    <p><b>Apellido:</b> ${userDatas.lastName}</p>
                </div>
                <div class="email">
                    <p><b>Email:</b> ${userDatas.email}</p>
                </div>
                <div class="phone-number">
                    <p><b>Phone Number:</b> ${userDatas.mobilePhone}</p>
                </div>
            </div>
            `
            break;
            //To check the orders
        case "orders":
        contentDiv.innerHTML = "";
        let datos = ""
        datos +=`
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
                                <td><a href="./see-order.html"> ${element.idOrderHeader} </a></td>
                                <td> ${element.orderDate} </td>
                                <td> ${element.shippingAddress} </td>
                                <td> ${element.accepted} </td>
                                <td> ${element.orderStatus} </td>
                            </tr>
                `
            });
        datos +=`
                    </tbody>
                    </table>
                </div>
        `

        contentDiv.innerHTML = datos
            
        


            
                
            break;
            //To check the employees
        case "employees":
            contentDiv.innerHTML=`
                <div class="orders-data-container">
                    <table>
                        <tr>
                            <th>Id Employee</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th>
                            <th>Phone Number</th>
                            <th>Salary</th>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Pablo</td>
                            <td>Lanero Perez</td>
                            <td>example@gmail.com</td>
                            <td>123456789</td>
                            <td>1000,00€</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Pablo</td>
                            <td>Lanero Perez</td>
                            <td>example@gmail.com</td>
                            <td>123456789</td>
                            <td>1000,00€</td>
                        </tr>
                        
                    </table>
                </div>
            `
                
            break;
        //To see the cv
        case "cvs":
            contentDiv.innerHTML=`
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
            console.log("Algo a salido mal",id)
            break;
    }

}
//To load the project and have some information

showOption("seeData")



