/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.tickets;

/**
 *
 * @author Yan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setRut("12.233");
        usuario.setCorreo("Hola@gmail.com");
        usuario.printear();
    }
    
}
