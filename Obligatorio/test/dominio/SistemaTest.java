/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guillermo
 */
public class SistemaTest {
    
    public SistemaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRestaurantes method, of class Sistema.
     */
    @Test
    public void testGetRestaurantes() {
        System.out.println("getRestaurantes");
        Sistema instance = new Sistema();
        ArrayList<Restaurante> expResult = null;
        ArrayList<Restaurante> result = instance.getRestaurantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRestaurantes method, of class Sistema.
     */
    @Test
    public void testSetRestaurantes() {
        System.out.println("setRestaurantes");
        ArrayList<Restaurante> restaurantes = null;
        Sistema instance = new Sistema();
        instance.setRestaurantes(restaurantes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarRestaurante method, of class Sistema.
     */
    @Test
    public void testAgregarRestaurante() {
        System.out.println("agregarRestaurante");
        String nombre = "";
        String direccion = "";
        String horarioApertura = "";
        String horarioCierre = "";
        String tipoComida = "";
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.agregarRestaurante(nombre, direccion, horarioApertura, horarioCierre, tipoComida);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarRestaurante method, of class Sistema.
     */
    @Test
    public void testEditarRestaurante() {
        System.out.println("editarRestaurante");
        Restaurante rest = null;
        String nombre = "";
        String direccion = "";
        String horarioApertura = "";
        String horarioCierre = "";
        String tipoComida = "";
        Sistema instance = new Sistema();
        instance.editarRestaurante(rest, nombre, direccion, horarioApertura, horarioCierre, tipoComida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
