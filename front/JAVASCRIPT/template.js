async function callAPI(){
const datas =  await fetch("http://localhost:8080/api/OrderHeader?user=1&firstName=23", "PATCH")
console.log(datas)
const datasParsed = await datas.text()
console.log(datasParsed)
const datos = JSON.parse(datasParsed)
console.log(datos  )
}

callAPI()


const datas =  await fetch("http://localhost:8080/api/habuerguers", "GET") 
const datas =  await fetch("http://localhost:8080/api/habuerguers", "GET")
const datas =  await fetch("http://localhost:8080/api/habuerguers", "GET")
const datas =  await fetch("http://localhost:8080/api/habuerguers", "GET")
const datas =  await fetch("http://localhost:8080/api/habuerguers", "GET")