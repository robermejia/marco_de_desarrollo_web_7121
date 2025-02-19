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