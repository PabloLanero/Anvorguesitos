/**
 * This method change the section from the header login 
 * to redirect to the 
 */
function isLogged(){
    try{
        let user = JSON.parse(sessionStorage.getItem("user"))
        if(user){
            let place = document.getElementById("login")
            console.log(user.name)
            place.innerHTML = user.name
            place.href = "./user.html"
        }
    }catch(Exception){
        console.log("User not registered")
    }
}

isLogged()