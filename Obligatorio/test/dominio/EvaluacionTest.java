/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

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
public class EvaluacionTest {
    
    public EvaluacionTest() {
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
     * Test of getCliente method, of class Evaluacion.
     */
    @Test
    public void testGetCliente() {
        System.out.println("Test getCliente");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        Evaluacion evaluacion = new Evaluacion(cliente, 3, "Bueno");
        assertEquals(cliente, evaluacion.getCliente());
    }

    /**
     * Test of setCliente method, of class Evaluacion.
     */
    @Test
    public void testSetCliente() {
        System.out.println("Test setCliente");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        Cliente cliente2 = new Cliente("Martin", "");
        Evaluacion evaluacion = new Evaluacion(cliente, 3, "Bueno");
        evaluacion.setCliente(cliente2);
        assertEquals(cliente2, evaluacion.getCliente());
    }

    /**
     * Test of getPuntuacion method, of class Evaluacion.
     */
    @Test
    public void testGetPuntuacion() {
        System.out.println("Test getPuntuacion");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        Evaluacion evaluacion = new Evaluacion(cliente, 3, "Bueno");
        assertEquals(3, evaluacion.getPuntuacion());
    }

    /**
     * Test of setPuntuacion method, of class Evaluacion.
     */
    @Test
    public void testSetPuntuacion() {
        System.out.println("Test setPuntuacion");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        Evaluacion evaluacion = new Evaluacion(cliente, 3, "Bueno");
        evaluacion.setPuntuacion(4);
        assertEquals(4, evaluacion.getPuntuacion());
    }

    /**
     * Test of getResena method, of class Evaluacion.
     */
    @Test
    public void testGetResena() {
        System.out.println("Test getResena");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        Evaluacion evaluacion = new Evaluacion(cliente, 3, "Bueno");
        assertEquals("Bueno", evaluacion.getResena());
    }

    /**
     * Test of setResena method, of class Evaluacion.
     */
    @Test
    public void testSetResena() {
        System.out.println("Test getResena");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        Evaluacion evaluacion = new Evaluacion(cliente, 3, "Bueno");
        evaluacion.setResena("Meh");
        assertEquals("Meh", evaluacion.getResena());
    }
    
}
