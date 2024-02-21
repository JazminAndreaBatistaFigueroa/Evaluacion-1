/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author jazzb
 */
public class EVA_1_6_ASIGNATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //clave,nombre, teoria, horaPractica, horaTeoria, carrera, tipoMat
        String clave, nombre, carrera;
        int creditos, horaTeoria, horaPractica;
        boolean tipoMat;
        //CAPTURAR
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce la clave de la asignatura:");
        clave = captura.nextLine();
        System.out.println("Introduce el nombre de la asignatura:");
        nombre =captura.nextLine();
        System.out.println("Introduce la carrera de la asignatura:");
        carrera = captura.nextLine();
       System.out.println("Introduce los creditos de la asignatura:");
        creditos = captura.nextInt();
       System.out.println("Introduce las horas teoricas de la asignatura");
       horaTeoria = captura.nextInt();
       System.out.println("Introduce las horas practicas de la asignatura");
       horaPractica = captura.nextInt();
       System.out.println("Introduce el tipo de asignatura ---True/generica o False/especialidad");
       tipoMat = captura.nextBoolean();
       
       //Hacer algo con los datos capturados
       System.out.println("DATOS DE LA ASIGNATURA");
       System.out.println(clave);
       System.out.println(nombre);
       System.out.println(carrera);
       System.out.println(creditos);
       System.out.println(horaPractica);
       System.out.println(horaTeoria);
       System.out.println(tipoMat);
       
    }
    
}
