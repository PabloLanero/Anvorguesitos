async function callAPI(){
const datas =  await fetch("http://localhost:8080/api/Product");
console.log(datas)
const datasParsed = await datas.text()
console.log(datasParsed)
const datos = JSON.parse(datasParsed)
console.log(datos  )

}

callAPI()







/** para pruebas
 * 
 * const datas = await fetch("http://localhost:8080/api/OrderHeader?user=1&firstName=23", {
    method: "POST",
    headers: {
        "Content-Type": "application/json"
    },
    body: JSON.stringify({
        // Aquí puedes enviar datos en el cuerpo de la solicitud
        orderId: 123,
        items: ["Burger", "Fries"]
    })
});

 */