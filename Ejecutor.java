/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.paginaweb;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MSIBRAVO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorHistorial gestor = new GestorHistorial();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa el nombre de la web");
            String nombre = entrada.nextLine();
            System.out.println("ingrsa la doreccion web");
            String direccion = entrada.nextLine();
            System.out.println("Desde que dispositivo ingresa");
            String dispositivo = entrada.nextLine();
            gestor.VisitarWeb(new PaginaWeb(nombre, nombre, new Date(), new Date(), dispositivo));
            System.out.println("Desde que dispositivo");
        }
        gestor.historial();
        System.out.println("------------------");
        System.out.println(gestor.obtenerUltimaWebVisitada().toString());
        gestor.cerrarWeb();
        System.out.println(gestor.obtenerUltimaWebVisitada().toString());
        gestor.EliminarWEb();
        System.out.println(gestor.obtenerUltimaWebVisitada().toString());
        System.out.println("-----------------------------------");
        System.out.println("Ingresa el dispositivo que quieres el hisotrial");
        String dispositivo = entrada.nextLine();
        System.out.println(gestor.obtenerVisitasDispositivo(dispositivo).toString());
        
    
    }
              
}
