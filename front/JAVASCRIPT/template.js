async function callAPI(){

    /*
const datas =  await fetch("http://54.161.240.158:8080OrderHeader");
console.log(datas)
const datasParsed = await datas.text()
console.log(datasParsed)
const datos = JSON.parse(datasParsed)
console.log(datos  )
*/


        const datas = await fetch("http://54.161.240.158:8080/Customer", {
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