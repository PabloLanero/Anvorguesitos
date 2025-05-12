
/**
 * This method will take every data in the formulary and
 * save it in SessionStorage with the key "user"
 */
function createUser() {

//First of all, we get the values

    let name = document.getElementById("name")
    let username = document.getElementById("surname")
    let email = document.getElementById("email")
    let mobilePhone = document.getElementById("mobile-phone")
    let password = document.getElementById("password")
    let passwordConfirmation = document.getElementById("password-confirmation")
    
    if(password.value===passwordConfirmation.value) {

        let user = {
            "name": name.value,
            "lastName": username.value,
            "email": email.value,
            "mobilePhone": mobilePhone.value,
            "admin": true,
        }

        console.log(user)
        

        sessionStorage.setItem("user",JSON.stringify(user))

        window.location.href = "user.html"
    }

}


