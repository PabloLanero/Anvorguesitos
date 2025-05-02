async function callAPI(){
const datas =  await fetch("http://localhost:8080/api/Ejemplo")
console.log(datas)
const datasParsed = datas.json()
console.log(datasParsed)
}

callAPI()