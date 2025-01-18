//Modo dark
let themeDark = false;
let btnTema = document.getElementById("btnTema");
const cambiarTema = () => {
    themeDark = !themeDark;
    if (!themeDark) {
        document.documentElement.dataset.bsTheme = "light";
        btnTema.innerHTML = "<i class='bi bi-sun-fill'></i>";
        btnTema.className = "btn btn-outline-dark";
    } else {
        document.documentElement.dataset.bsTheme = "dark";
        btnTema.innerHTML = "<i class='bi bi-moon-stars-fill'></i>";
        btnTema.className = "btn btn-outline-light";
    }
    //console.log(document.documentElement.dataset.bsTheme);
};

// Código login
function validateEmail(input) {
    const email = input.value;
    if (email.includes('@') && email.indexOf('@') !== email.lastIndexOf('@') ) {
        input.classList.remove('is-invalid');
        input.classList.add('is-valid');
    } else if (email.includes('@') && email.split('@')[1].length > 0 ) {
        input.classList.remove('is-invalid');
        input.classList.add('is-valid');

    } else {
        input.classList.remove('is-valid');
        input.classList.add('is-invalid');
    }
}