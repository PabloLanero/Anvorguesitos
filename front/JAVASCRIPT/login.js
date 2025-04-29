


function createUser() {

//First of all, we get the values

    let name = document.getElementById("name").value
    let username = document.getElementById("surname").value
    let email = document.getElementById("email").value
    let mobilePhone = document.getElementById("mobile-phone").value
    let password = document.getElementById("password").value
    let passwordConfirmation = document.getElementById("password-confirmation").value
    
    if(password===passwordConfirmation) {

        let user = {
            "Name": name,
            "Username": username,
            "Email": email,
            "MobilePhone": mobilePhone,
            "Admin": false,
        }

        console.log(user)
    }

}