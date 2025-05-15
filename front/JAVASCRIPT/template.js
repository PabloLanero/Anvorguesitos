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
                "firstName": "Izarbe",
                "lastName": "Bailo",
                "emailCustomer": "ejemplo@gmail.com",
                "phoneCustomer": "123456789",
                "registered": true,
                "passwordCustomer": "123"
                
            })
            
        });



}

callAPI()







/** para pruebas
 * 
 * 

 */