/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.paginaweb;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author MSIBRAVO
 */
public class GestorHistorial {
    
    private Stack pila;

    public Stack getPila() {
        return pila;
    }

    public void setPila(Stack pila) {
        this.pila = pila;
    }

    public GestorHistorial(Stack pila) {
        this.pila = pila;
    }
    
    public GestorHistorial(){
        pila = new Stack();
    }
            
    public void VisitarWeb(PaginaWeb pagina){
        pila.push(pagina);
        System.out.println("Se agrego el nuevo historial");
    }
    
    public void cerrarWeb(){
        PaginaWeb pg = (PaginaWeb) pila.firstElement(); //Sirve par aobtener el primer elemento
        pg.setFechaCierre(new Date()); //Asi actualizamos la fecha de cierre
        pila.set(0, pg); //De este modo actualizamos 
    }
    
    public PaginaWeb obtenerUltimaWebVisitada(){
        return (PaginaWeb) pila.peek(); //obtiene el ultimo elemento de la pila
    }
    
    public void EliminarWEb(){
        pila.pop();
        System.out.println("Eliminamos el ultimo sitio web");
    }
    
    public PaginaWeb obtenerVisitasDispositivo(String dispositivo){
        PaginaWeb ultimoElemento = null;
        for (Object o : pila) {
            PaginaWeb pw = (PaginaWeb) o;
            if(pw.getDispositivo().equals(dispositivo)){
                ultimoElemento = pw;
            }
        }
        return ultimoElemento;
    
    }
    
    public void historial(){
        for (Object object : pila) {
            PaginaWeb p = (PaginaWeb)object;
            System.out.println(p.toString());
        }
                
        
    }
}
