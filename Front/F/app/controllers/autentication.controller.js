async function login(req,res){
    console.log(req.body);
    const user = req.body.user;
    const password =  req.body.password;
    if(!user || !password){
        return res.status(401).send({status:"Error",message:"Complete todos los campos solicitados"})
    }
    const revisarUser = usuarios.find(usuario => usuario.user === user);
    if(!revisarUser){
        return res.status(401).send({status:"Error",message:"Credenciales incorrectas"})
    }
    var correct = false;
    if(password===revisarUser.password){
        correct = true;
    }
    console.log(correct);
    if(!correct){
        return res.status(401).send({status:"Error",message:"Credenciales incorrectas"})
    }
    if (password === revisarUser.password) {
        return res.status(200).send({ status: "Success", redirect: "/user" });
        } 
        
    else {
        return res.status(401).send({ status: "Error", message: "Credenciales incorrectas" });
    }
}

export const methods = {
    login
}