/**
 * This method change the section from the header login 
 * to redirect to the 
 */
function isLogged(){
    try{
        let user = JSON.parse(sessionStorage.getItem("user"))
        if(user){
            let loginPlace = document.getElementById("login")
            
            loginPlace.innerHTML = user.name
            loginPlace.href = "./user.html"
           
        }
    }catch(Exception){
        console.log("User not registered")
    }
}

isLogged()