/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.paginaweb;

import java.util.Date;

/**
 *
 * @author MSIBRAVO
 */
public class PaginaWeb {
    public String nombre;
    public String ruta;
    public Date horaVisita;
    public byte[] icono;
    public Date fechaCierre;
    public String dispositivo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Date getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(Date horaVisita) {
        this.horaVisita = horaVisita;
    }

    public byte[] getIcono() {
        return icono;
    }

    public void setIcono(byte[] icono) {
        this.icono = icono;
    }

    

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public PaginaWeb(String nombre, String ruta, Date horaVisita,
            Date fechaCierre, String dispositivo) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.horaVisita = horaVisita;
        this.fechaCierre = fechaCierre;
        this.dispositivo = dispositivo;
    }

    public PaginaWeb() {
    }
    

    @Override
    public String toString() {
        return "PaginaWeb{" + "nombre=" + nombre + ", ruta=" + ruta +
                ", horaVisita=" + horaVisita + ", icono=" + icono +
                ", fechaCierre=" + fechaCierre + ", dispositivo=" +
                dispositivo + '}';
    }
    
    
}
