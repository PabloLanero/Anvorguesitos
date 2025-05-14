async function getOrder(id){
    let result = await fetch("http://localhost:8080/api/OrderHeader?idOrder="+id)
    let order = await result.json()
    console.log(order)
}

let id = new URLSearchParams(window.location.search).get("idOrder")
getOrder(id)