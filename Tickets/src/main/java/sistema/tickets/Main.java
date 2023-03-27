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
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Registros usuarios =new Registros();
        usuarios.base("Datos.txt");
        int cantidadUsuarios =  usuarios.getTamaño();
        usuarios.printear(cantidadUsuarios);
        System.out.println("Ingrese su correo:");
        String correo = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = sc.nextLine();
        System.out.println("termine");
    }
}