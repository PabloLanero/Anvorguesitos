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
        
    let street = `${document.getElementById("street").value} ${document.getElementById("street-number").value}, ${document.getElementById("floor").value}`
    /*
    document.getElementById("CustomerFirstName").value
    document.getElementById("CustomerLastName").value
    document.getElementById("CustomerEmail").value 
    document.getElementById("CustomerMobilePhone").value */

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

    let resultado = await fetch("http://localhost:8080/api/OrderHeader",{
                                    method: "post",
                                    body: JSON.stringify(orderHeader)})
    let idOrder= await resultado.text()
    console.log(resultado)
    if(idOrder>0) {
        window.location.href = "see-order-details.html?idOrder="+idOrder
        localStorage.removeItem("data")
    }
}

/**
 * 
{
  "orderDate": "01-01-2025",
  "shippingAddress": "Ejemplo ",
  "orderStatus": "Pending",
  "paymentMethod": "CASH",
  "customer": {
    "firstName": "AAA",
    "lastName": "registered.lastName",
    "emailCustomer": "registered.email",
    "phoneCustomer": "registered.mobilePhone",
    "registered": false,
    "idCustomer": 1
  },
  "employee": {
    "idEmployee": 1,
    "employeeFirstName": "Kevin"
  },
  "listOrderLine": [
    {
      "cuantity": 3,
      "product": {
        "idProduct": 2
      }
    },
    {
      "cuantity": 2,
      "product": {
        "idProduct": 5
      }
    }
  ]
}
 */