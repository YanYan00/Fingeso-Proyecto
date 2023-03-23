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
    String rut;
    String correo;
    public void setRut(String rut){
        this.rut = rut;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getRut(){
        return rut;
    }
    public String getCorreo(){
        return correo;
    }
    public void printear(){
        System.out.println("\n"+rut+correo+"\n");
    }
}
