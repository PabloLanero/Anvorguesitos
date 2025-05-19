function autoFill(){
    let userSession = sessionStorage.getItem("user")
    let user = JSON.parse(userSession)
    
    if(user){
        document.getElementById("CustomerFirstName").value = user.name
        document.getElementById("CustomerLastName").value = user.lastName
        document.getElementById("CustomerEmail").value = user.email
        document.getElementById("CustomerMobilePhone").value = user.mobilePhone
                
        
    }
}

autoFill()

async function makeOrder(){

  let userSession = sessionStorage.getItem("user")
  if(userSession!=null && userSession !=undefined){
        
    let street = `${document.getElementById("street").value} ${document.getElementById("street-number").value}, ${document.getElementById("floor").value}`
    

    let carrito = JSON.parse(localStorage.getItem("data"))

    let orderLine = []

    carrito.forEach(line => {
        orderLine.push({
            "cuantity": line.item,
            "product": {
                "idProduct": line.idProduct
        
            }}
        )
    });

    let user = JSON.parse(sessionStorage.getItem("user"))

    let orderHeader = {
        "shippingAddress": street,
        "orderStatus": "Pending",
        "paymentMethod": "CASH",
        "listOrderLine": carrito,
        "customer":{
            "idCustomer": user.id
        },
        "employee":{
            "idEmployee": 1
        },
        "listOrderLine": orderLine
    }  

    let resultado = await fetch("http://54.161.240.158:8080/OrderHeader",{
                                    method: "POST",
                                    body: JSON.stringify(orderHeader)})
    let idOrder= await resultado.text()

    console.log(resultado)

    if(idOrder>0) {
        window.location.href = "see-order-details.html?idOrder="+idOrder
        localStorage.removeItem("data")
    }
  }else{
    alert("Su usuario no se encunetra registrado. Por favor, regístrese para poder realizar la compra.")

    window.location.href = "sign-in.html";

  }
}

