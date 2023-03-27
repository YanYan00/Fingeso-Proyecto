/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.tickets;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Registros{
    Usuario [] registrados;
    int tamaño;
    public void setTamaño(int n){
        this.tamaño= n;
    }
    public void cantidad(){
        this.registrados = new Usuario[tamaño];
    }
    public int getTamaño(){
        return tamaño;
    }
    public void setUsuarios(int cant,String [] users){
        String [] registrar;
        for(int i=0;i<cant;i++){
            registrar = users[i].split("\\/");
            Usuario agregar = new Usuario();
            agregar.setNombre(registrar[0]);
            agregar.setRut(registrar[1]);
            agregar.setCorreo(registrar[2]);
            agregar.setContraseña(registrar[3]);
            agregar.setSexo(registrar[4]);
            this.registrados[i]=agregar;
        }
    }
    static String leerArchivo(String nombre){
        String contImagen ="";
        try{
            FileReader lectura= new FileReader(nombre);
            String datosTry="";
            String bfRead;
            BufferedReader bf = new BufferedReader(lectura);
            while((bfRead = bf.readLine()) != null){
                datosTry=datosTry + bfRead;
            }
            lectura.close();
            contImagen = datosTry;
        }catch (Exception ex){ex.printStackTrace();}
        return contImagen;
    }
    public void base(String nombreArchivo){
        //Este apartado seria en el caso de logeo abre el txt datos los separa por $ para poder diferenciar cada usuario
        String datos = leerArchivo(nombreArchivo);
        String [] datosUsuarios = datos.split("\\$");
        //Se guarda la cantidad de usuarios que hay registrados en la base de datos
        int cUsuarios = datosUsuarios.length;
        setTamaño(cUsuarios);
        cantidad();
        setUsuarios(tamaño,datosUsuarios);
    }
    public void printear(int cant){
        for(int l=0;l<cant;l++){
            System.out.println(registrados[l].nombre+" "+registrados[l].rut+" "+registrados[l].correo+" "+registrados[l].contraseña+" "+registrados[l].sexo+"\n");
        }
    }
}
