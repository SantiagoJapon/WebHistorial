/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.paginaweb;

import java.util.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author MSIBRAVO
 */
public class GestorHistorialTest {
    
    public GestorHistorialTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPila method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testGetPila() {
        System.out.println("getPila");
        GestorHistorial instance = new GestorHistorial();
        Stack expResult = null;
        Stack result = instance.getPila();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPila method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testSetPila() {
        System.out.println("setPila");
        Stack pila = null;
        GestorHistorial instance = new GestorHistorial();
        instance.setPila(pila);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VisitarWeb method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testVisitarWeb() {
        System.out.println("VisitarWeb");
        PaginaWeb pagina = null;
        GestorHistorial instance = new GestorHistorial();
        instance.VisitarWeb(pagina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cerrarWeb method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testCerrarWeb() {
        System.out.println("cerrarWeb");
        GestorHistorial instance = new GestorHistorial();
        instance.cerrarWeb();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUltimaWebVisitada method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerUltimaWebVisitada() {
        System.out.println("obtenerUltimaWebVisitada");
        GestorHistorial instance = new GestorHistorial();
        PaginaWeb expResult = null;
        PaginaWeb result = instance.obtenerUltimaWebVisitada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarWEb method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testEliminarWEb() {
        System.out.println("EliminarWEb");
        GestorHistorial instance = new GestorHistorial();
        instance.EliminarWEb();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerVisitasDispositivo method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerVisitasDispositivo() {
        System.out.println("obtenerVisitasDispositivo");
        String dispositivo = "";
        GestorHistorial instance = new GestorHistorial();
        PaginaWeb expResult = null;
        PaginaWeb result = instance.obtenerVisitasDispositivo(dispositivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of historial method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testHistorial() {
        System.out.println("historial");
        GestorHistorial instance = new GestorHistorial();
        instance.historial();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
