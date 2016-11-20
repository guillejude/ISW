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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("Test getNombre");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        assertEquals("Juan", cliente.getNombre());
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("Test setNombre");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        cliente.setNombre("Martin");
        assertEquals("Martin", cliente.getNombre());
    }

    /**
     * Test of getEmail method, of class Cliente.
     */
    @Test
    public void testGetEmail() {
        System.out.println("Test getEmail");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        assertEquals("juan@gmail.com", cliente.getEmail());
    }

    /**
     * Test of setEmail method, of class Cliente.
     */
    @Test
    public void testSetEmail() {
        System.out.println("Test setEmail");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        cliente.setEmail("martin@gmail.com");
        assertEquals("martin@gmail.com", cliente.getEmail());
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("Test toString");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        assertEquals("nombre: Juan, email: juan@gmail.com", cliente.toString());
    }

    /**
     * Test of equals method, of class Cliente.
     */
    @Test
    public void testEqualsIguales() {
        System.out.println("Test equals con clientes con mismo nombre y mail");
        Cliente clienteA = new Cliente("Juan", "juan@gmail.com");
        Cliente clienteB = new Cliente("Juan", "juan@gmail.com");
        assertTrue(clienteA.equals(clienteB));
    }
    
    @Test
    public void testEqualsNoIgualesNombre() {
        System.out.println("Test equals con clientes con distinto nombre");
        Cliente clienteA = new Cliente("Juan", "juan@gmail.com");
        Cliente clienteB = new Cliente("Martin", "juan@gmail.com");
        //daria true ya qeu se define que dos clientes son iguales solo cuando comparten mail
        assertTrue(clienteA.equals(clienteB));
    }

    @Test
    public void testEqualsNoIgualesEmail() {
        System.out.println("Test equals con clientes con distinto mail");
        Cliente clienteA = new Cliente("Juan", "juan@gmail.com");
        Cliente clienteB = new Cliente("Juan", "martin@gmail.com");
        assertFalse(clienteA.equals(clienteB));
    }
    
    @Test
    public void testEqualsNoIgualesNada() {
        System.out.println("Test equals con clientes de nombre y mails diferentes");
        Cliente clienteA = new Cliente("Juan", "juan@gmail.com");
        Cliente clienteB = new Cliente("Martin", "martin@gmail.com");
        assertFalse(clienteA.equals(clienteB));
    }
    
    
    /**
     * Test of noEsAnonimo method, of class Cliente.
     */
    @Test
    public void testNoEsAnonimoSinNombre() {
        System.out.println("Test noEsAnonimo con cliente sin nombre");
        Cliente cliente = new Cliente("", "juan@gmail.com");
        assertFalse(cliente.noEsAnonimo());
    }
    
    @Test
    public void testNoEsAnonimoSinEmail() {
        System.out.println("Test noEsAnonimo con cliente sin email");
        Cliente cliente = new Cliente("Juan", "");
        assertFalse(cliente.noEsAnonimo());
    }
    
    @Test
    public void testNoEsAnonimoNoAnonimo() {
        System.out.println("Test noEsAnonimo con cliente no anonimo");
        Cliente cliente = new Cliente("Juan", "juan@gmail.com");
        assertTrue(cliente.noEsAnonimo());
    }
}
