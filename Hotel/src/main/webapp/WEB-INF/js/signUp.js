document.addEventListener('DOMContentLoaded', () => {
    let name = document.querySelector("#name"),
        email = document.querySelector("#email"),
        password = document.querySelector("#password"),
        confirmPassword = document.querySelector("#confirm_password"),
        consent = document.querySelector("#consent");

    confirmPassword.addEventListener('input', () => {
        checkConfirmPassword(password, confirmPassword);
    });

    password.addEventListener('input', () => {
        checkConfirmPassword(password, confirmPassword);
    });

    function checkConfirmPassword(password, confirmPassword) {
        if (password.value !== confirmPassword.value) {
            confirmPassword.style.borderColor = 'red';
            document.querySelector(".btn").disabled = true;
        } else {
            confirmPassword.style.borderColor = 'black';
            document.querySelector(".btn").disabled = false;
        }
    }
})