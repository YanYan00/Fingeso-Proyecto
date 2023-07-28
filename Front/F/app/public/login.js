

const mensajeError = document.getElementsByName("error")[0];

document.getElementById("login-forms").addEventListener("submit",async(e)=>{
    e.preventDefault();
    const email =e.target.children.user.value;
    const password =e.target.children.password.value;
    const res = await fetch("http://localhost:8080/api/auth/login",{
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
        body: JSON.stringify({
            email,password
        })
    });
    console.log(res);
    
    if(!res.ok) return mensajeError.classList.toggle("escondido",false);
    const resJson = await res.json();
    // Verifica si la respuesta contiene información sobre el usuario (por ejemplo, el ID del usuario)
    
        // Redirige al usuario a la página de usuario, por ejemplo, user.html
    window.location.href = "/user";
    
})

    