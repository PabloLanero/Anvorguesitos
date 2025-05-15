async function callAPI(){

    /*
const datas =  await fetch("http://localhost:8080/api/OrderHeader");
console.log(datas)
const datasParsed = await datas.text()
console.log(datasParsed)
const datos = JSON.parse(datasParsed)
console.log(datos  )
*/


        const datas = await fetch("http://localhost:8080/api/Customer", {
            method: "post",
            body: JSON.stringify({
                "firstName": "AAA",
                "lastName": "registered.lastName",
                "emailCustomer": "registered.email",
                "phoneCustomer": "registered.mobilePhone",
                "registered": false,
                "idCustomer": 1000,
            })
            
        });



}

callAPI()







/** para pruebas
 * 
 * 

 */