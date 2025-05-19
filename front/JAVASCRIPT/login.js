async function login(){

    try
    {
        let name = document.getElementById("name")
    let password = document.getElementById("password")

    let user = await fetch("http://54.161.240.158:8080/Login", {
        method: "POST",
        body: JSON.stringify({
          "name": name.value,
          "password": password.value
        })
      })
    console.log(user)
    let registered = await user.json()
    console.log(registered)
 
    
    if(registered != null){

        
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
    } else{
      alert("Usuario o contraseña incorrectos")
      name.value =null
      password.value =null
    }
    }catch(error){
        console.error("error al conectar usuario")
        console.log(error)

    }
   

}