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
        System.out.println(" testgetRestaurantes");
        Sistema sistema = new Sistema();
        ArrayList<Restaurante> restaurantes = new ArrayList();
        assertEquals(restaurantes, sistema.getRestaurantes());
    }

    /**
     * Test of setRestaurantes method, of class Sistema.
     */
    @Test
    public void testSetRestaurantes() {
        System.out.println("test setRestaurantes");
        Sistema sistema = new Sistema();
        ArrayList<Restaurante> restaurantes = new ArrayList();
        Restaurante restaurante = new Restaurante("", "", "", "", "");
        restaurantes.add(restaurante);
        sistema.setRestaurantes(restaurantes);
        assertEquals(restaurantes, sistema.getRestaurantes());
    }

    /**
     * Test of agregarRestaurante method, of class Sistema.
     */
    @Test
    public void testAgregarRestauranteNuevo() {
        System.out.println("test agregarRestaurante nuevo");
        Sistema sistema = new Sistema();
        ArrayList<Restaurante> restaurantes = new ArrayList();
        Restaurante restaurante = new Restaurante("", "", "", "", "");
        restaurantes.add(restaurante);
        sistema.agregarRestaurante("", "", "", "", "");
        assertEquals(restaurantes, sistema.getRestaurantes());
    }

    @Test
    public void testAgregarRestauranteExistente() {
        System.out.println("test agregarRestaurante nuevo");
        Sistema sistema = new Sistema();
        ArrayList<Restaurante> restaurantes = new ArrayList();
        Restaurante restaurante = new Restaurante("", "", "", "", "");
        restaurantes.add(restaurante);
        sistema.agregarRestaurante("", "", "", "", "");
        //no se agrega
        sistema.agregarRestaurante("", "", "", "", "");
        assertEquals(restaurantes, sistema.getRestaurantes());
    }
    
    /**
     * Test of editarRestaurante method, of class Sistema.
     */
    @Test
    public void testEditarRestaurante() {
        System.out.println("test editarRestaurante");
        Sistema sistema = new Sistema();
        ArrayList<Restaurante> restaurantes = new ArrayList();
        Restaurante restaurante = new Restaurante("McDonalds", "", "", "", "");
        restaurantes.add(restaurante);
        sistema.agregarRestaurante("Pasiva", "", "", "", "");
        Restaurante aEditar = sistema.getRestaurantes().get(0);
        sistema.editarRestaurante(aEditar, "McDonalds", "", "", "", "");
        assertEquals(restaurantes, sistema.getRestaurantes());
    }
    
}
