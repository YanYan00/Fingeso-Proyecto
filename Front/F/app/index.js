import express from "express";
//__dirname
import path from 'path';
import { fileURLToPath } from 'url';
const __dirname = path.dirname(fileURLToPath(import.meta.url))
import { methods as autenticacion} from "./controllers/autentication.controller.js";



//Server
const app = express();
app.set("port",3000);
app.listen(app.get("port"));

//config
app.use(express.static(__dirname+"/public"));
app.use(express.json())

//Rutas

app.get("/",(req,res) => res.sendFile(__dirname+"/pages/login.html"));
app.get("/user",(req,res) => res.sendFile(__dirname+"/pages/user.html"));
app.post("/api/login",autenticacion.login);