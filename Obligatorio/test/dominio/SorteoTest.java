/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Date;
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
public class SorteoTest {
    
    public SorteoTest() {
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
     * Test of getNombre method, of class Sorteo.
     */
    @org.junit.Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Sorteo instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Sorteo instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParticipantes method, of class Sorteo.
     */
    @org.junit.Test
    public void testGetParticipantes() {
        System.out.println("getParticipantes");
        Sorteo instance = null;
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getParticipantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParticipantes method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetParticipantes() {
        System.out.println("setParticipantes");
        ArrayList<Cliente> participantes = null;
        Sorteo instance = null;
        instance.setParticipantes(participantes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRealizado method, of class Sorteo.
     */
    @org.junit.Test
    public void testIsRealizado() {
        System.out.println("isRealizado");
        Sorteo instance = null;
        boolean expResult = false;
        boolean result = instance.isRealizado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRealizado method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetRealizado() {
        System.out.println("setRealizado");
        boolean realizado = false;
        Sorteo instance = null;
        instance.setRealizado(realizado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadGanadores method, of class Sorteo.
     */
    @org.junit.Test
    public void testGetCantidadGanadores() {
        System.out.println("getCantidadGanadores");
        Sorteo instance = null;
        int expResult = 0;
        int result = instance.getCantidadGanadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidadGanadores method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetCantidadGanadores() {
        System.out.println("setCantidadGanadores");
        int cantidadGanadores = 0;
        Sorteo instance = null;
        instance.setCantidadGanadores(cantidadGanadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcionPremio method, of class Sorteo.
     */
    @org.junit.Test
    public void testGetDescripcionPremio() {
        System.out.println("getDescripcionPremio");
        Sorteo instance = null;
        String expResult = "";
        String result = instance.getDescripcionPremio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcionPremio method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetDescripcionPremio() {
        System.out.println("setDescripcionPremio");
        String descripcionPremio = "";
        Sorteo instance = null;
        instance.setDescripcionPremio(descripcionPremio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaInicio method, of class Sorteo.
     */
    @org.junit.Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Sorteo instance = null;
        Date expResult = null;
        Date result = instance.getFechaInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaInicio method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        Date fechaInicio = null;
        Sorteo instance = null;
        instance.setFechaInicio(fechaInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFin method, of class Sorteo.
     */
    @org.junit.Test
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        Sorteo instance = null;
        Date expResult = null;
        Date result = instance.getFechaFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFin method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetFechaFin() {
        System.out.println("setFechaFin");
        Date fechaFin = null;
        Sorteo instance = null;
        instance.setFechaFin(fechaFin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Sorteo.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Sorteo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of realizarSorteo method, of class Sorteo.
     */
    @org.junit.Test
    public void testRealizarSorteo() {
        System.out.println("realizarSorteo");
        Sorteo instance = null;
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.realizarSorteo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
