async function login(){
    let name = document.getElementById("name")
    let password = document.getElementById("password")

    let user = await fetch(`http://localhost:8080/api/Login?name=${name.value}&password=${password.value}`)
    let registered = await user.json()
    console.log(registered)

    
    
    if(registered){

        
        let userRegistered = {
            "name": registered.firstName,
            "lastName": registered.lastName,
            "email": registered.email,
            "mobilePhone": registered.mobilePhone,
            "admin": registered.admin,
            "id": registered.id,
        }

        console.log(userRegistered)


        sessionStorage.setItem("user",JSON.stringify(userRegistered))
        window.location.href = "user.html"
    }

}