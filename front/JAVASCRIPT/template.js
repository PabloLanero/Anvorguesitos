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
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                "name": "AAA",
                "lastName": "registered.lastName",
                "email": "registered.email",
                "mobilePhone": "registered.mobilePhone",
                "admin": "false",
                "id": "1",
            })
        });



}

callAPI()







/** para pruebas
 * 
 * 

 */