/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1110;

import java.util.Scanner;
/**
 *
 * @author conizunino
 */
public class Comision1110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String user;
        int pass;
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editor;
        String sistema;
        
        System.out.println("Bienvenido al sistema");
        System.out.println("Por favor ingrese sus datos");
        Scanner usuario = new Scanner (System.in);
        System.out.println("Ingrese su usuario: ");
        user = usuario.nextLine();
        Scanner clave = new Scanner (System.in);
        System.out.println("Ingrese su password: ");
        pass = clave.nextInt();
        
        Scanner name = new Scanner (System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = name.nextLine();
        Scanner surname = new Scanner (System.in);
        System.out.println("Ingrese su apellido: ");
        apellido = surname.nextLine();
        Scanner age = new Scanner (System.in);
        System.out.println("Ingrese su edad: ");
        edad = age.nextInt();
        Scanner hob = new Scanner (System.in);
        System.out.println("Ingrese su hobbie: ");
        hobbie = hob.nextLine();
        Scanner ed = new Scanner (System.in);
        System.out.println("Ingrese su editor de codigo favorito: ");
        editor = ed.nextLine();
        Scanner system = new Scanner (System.in);
        System.out.println("Ingrese su sistema operativo: ");
        sistema = system.nextLine();
        
        System.out.println("Los datos ingresados son:");
        System.out.println("Usuario: "+user);
        System.out.println("Clave: "+pass);
        System.out.println("Tu nombre completo es "+nombre+" "+apellido+".");
        System.out.println("Vos tenes "+edad+" años y tu hobbie es "+hobbie+".");
        System.out.println("Tu editor de codigo favorito es "+editor+" y el sistema operativo que usas es "+sistema+".");
    }
    
}
