/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.tickets;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
/**
 *
 * @author Yan
 * holi:p
 */
public class Usuario {
    String nombre;
    String rut;
    String correo;
    String contraseña;
    String sexo;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setContraseña(String contra){
        this.contraseña = contra;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getRut(){
        return rut;
    }
    public String getCorreo(){
        return correo;
    }
    public String getContraseña(){
        return rut;
    }
    public String getSexo(){
        return sexo;
    }
    public void printear(){
        System.out.println("\n"+rut+correo+"\n");
    }
}
