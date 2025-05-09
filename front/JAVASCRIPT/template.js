async function callAPI(){
const datas =  await fetch("http://localhost:8080/api/OrderHeader")
console.log(datas)
const datasParsed = await datas.text()
console.log(datasParsed)
const datos = JSON.parse(datasParsed)
console.log(datos  )
}

callAPI()