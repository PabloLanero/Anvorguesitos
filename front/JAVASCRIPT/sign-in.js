
/**
 * This method will take every data in the formulary and
 * save it in SessionStorage with the key "user"
 */
async function createUser() {

    //First of all, we get the values

    let name = document.getElementById("name")
    let username = document.getElementById("surname")
    let email = document.getElementById("email")
    let mobilePhone = document.getElementById("mobile-phone")
    let password = document.getElementById("password")
    let passwordConfirmation = document.getElementById("password-confirmation")

    if (password.value === passwordConfirmation.value) {

        let user = {
            "firstName": name.value,
            "lastName": username.value,
            "emailCustomer": email.value,
            "phoneCustomer": mobilePhone.value,
            "passwordCustomer": password.value,
            "registered": true,
            "admin": false,
        }

        console.log(user)




        let response = await fetch("http://54.161.240.158:8080/Customer", {
            method: "POST",
            body: JSON.stringify(user)
        })

        console.log(response);

        let responseJSON = await response.json()

        console.log(responseJSON);

        user = {
            "name": responseJSON.firstName,
            "lastName": responseJSON.lastName,
            "email": responseJSON.emailCustomer,
            "mobilePhone": responseJSON.phoneCustomer,
            "admin": responseJSON.admin,
            "id": responseJSON.idCustomer,
        }



        sessionStorage.setItem("user", JSON.stringify(user))

        window.location.href = "user.html"
    }

}


