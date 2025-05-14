async function getOrder(id){
    let result = await fetch("http://localhost:8080/api/OrderHeader?idOrder="+id)
    let order = await result.json()
    console.log(order)
    showOrderInformation(order[0])
    showCustomerInformation(order[0].customer)
    showEmployeeInformation(order[0].employee)
    showOrderLines(order[0].listOrderLine)

}

let id = new URLSearchParams(window.location.search).get("idOrder")
getOrder(id)


function showOrderInformation(order){
    let divOrder = document.getElementById("order_information")
    let accepted = "NO"
    if (order.accepted) accepted= "Yes"
    

    let html = `
    <p><strong>Id Order:</strong></p><p> ${order.idOrderHeader}</p>
    <p><strong>Shipping Address:</strong></p><p>  ${order.shippingAddress}</p>
    <p><strong>Order Date:</strong> </p><p> ${order.orderDate}</p>
    <p><strong>Order Status:</strong></p><p>  ${order.orderStatus}</p>
    <p><strong>Payment Method:</strong> </p><p> ${order.paymentMethod}</p>
    <p><strong>Accepted: </strong></p><p> ${accepted}</p>
    `

    divOrder.innerHTML = html

}

function showCustomerInformation(customer){
    let divCustomer = document.getElementById("customer_information")

    let registered = customer.registered ? "Yes" : "No"

    let html = `
    <p><strong>First Name:</strong></p><p> ${customer.firstName}</p>
    <p><strong>Registered:</strong></p><p>  ${registered}</p>

    
    `

    divCustomer.innerHTML = html

}