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
        System.out.println("test getNombre");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        assertEquals("Pizza", sorteo.getNombre());
    }
    
    /**
     * Test of setNombre method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetNombre() {
        System.out.println("test setNombre");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        sorteo.setNombre("Pop");
        assertEquals("Pop", sorteo.getNombre());
    }
    
    /**
     * Test of isRealizado method, of class Sorteo.
     */
    @org.junit.Test
    public void testIsRealizado() {
        System.out.println("test isRealizado");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        assertFalse(sorteo.isRealizado());
    }
    
    /**
     * Test of setRealizado method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetRealizado() {
        System.out.println("test setRealizado");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        sorteo.setRealizado(true);
        assertTrue(sorteo.isRealizado());
    }
    
    /**
     * Test of getParticipantes method, of class Sorteo.
     */
    @org.junit.Test
    public void testGetParticipantes() {
        System.out.println("test getParticipantes");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        ArrayList<Cliente> participantes = new ArrayList();
        assertEquals(participantes, sorteo.getParticipantes());
    }
    
    /**
     * Test of setParticipantes method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetParticipantes() {
        System.out.println("test setParticipantes");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        ArrayList<Cliente> participantes = new ArrayList();
        Cliente cliente = new Cliente("uan", "1@2");
        participantes.add(cliente);
        sorteo.setParticipantes(participantes);
        assertEquals(participantes, sorteo.getParticipantes());
    }
    
    /**
     * Test of getCantidadGanadores method, of class Sorteo.
     */
    @org.junit.Test
    public void testGetCantidadGanadores() {
        System.out.println("test getCantidadGanadores");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        assertEquals(4, sorteo.getCantidadGanadores());
    }
    
    /**
     * Test of setCantidadGanadores method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetCantidadGanadores() {
        System.out.println("test getCantidadGanadores");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        sorteo.setCantidadGanadores(3);
        assertEquals(3, sorteo.getCantidadGanadores());
    }
    
    /**
     * Test of getDescripcionPremio method, of class Sorteo.
     */
    @org.junit.Test
    public void testGetDescripcionPremio() {
        System.out.println("test getDescripcionPremio");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        assertEquals("Pizza", sorteo.getDescripcionPremio());
    }
    
    /**
     * Test of setDescripcionPremio method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetDescripcionPremio() {
        System.out.println("test setDescripcionPremio");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        sorteo.setDescripcionPremio("Pop");
        assertEquals("Pop", sorteo.getDescripcionPremio());
    }
    
    /**
     * Test of getFechaInicio method, of class Sorteo.
     */
    @org.junit.Test
    public void testGetFechaInicio() {
        System.out.println("test setFechaInicio");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        assertEquals(inicio, sorteo.getFechaInicio());
    }
    
    /**
     * Test of setFechaInicio method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetFechaInicio() {
        System.out.println("test setFechaInicio");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        inicio = new Date(118, 10, 10);
        sorteo.setFechaInicio(inicio);
        assertEquals(inicio, sorteo.getFechaInicio());
    }
    
    /**
     * Test of getFechaFin method, of class Sorteo.
     */
    @org.junit.Test
    public void testGetFechaFin() {
        System.out.println("test setFechaFin");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        assertEquals(fin, sorteo.getFechaFin());
    }
    
    /**
     * Test of setFechaFin method, of class Sorteo.
     */
    @org.junit.Test
    public void testSetFechaFin() {
        System.out.println("test setFechaInicio");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        fin = new Date(119, 10, 10);
        sorteo.setFechaFin(fin);
        assertEquals(fin, sorteo.getFechaFin());
    }
    
    /**
     * Test of toString method, of class Sorteo.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("test toString");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        assertEquals("Pizza", sorteo.toString());
    }

    /**
     * Test of equals method, of class Sorteo.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("test equals");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        Sorteo sorteo2 = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        assertEquals(sorteo, sorteo2);
    }

    /**
     * Test of realizarSorteo method, of class Sorteo.
     */
    @org.junit.Test
    public void testRealizarSorteoConParticipante() {
        System.out.println("test realizarSorteo con participante");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 2, "Pizza", inicio, fin);
        //Agrego participantes
        Cliente cliente = new Cliente("Juan", "juan@hotmail.com");
        sorteo.getParticipantes().add(cliente);
        //ganadores del sorteo tendria que quedar
        ArrayList<Cliente> ganadores = new ArrayList();
        ganadores.add(cliente);
        //pruebo
        assertEquals(ganadores, sorteo.realizarSorteo());
    }

    @Test
    public void testRealizarSorteoConMasParticipantesQueGanadores() {
        System.out.println("test realizarSorteo con mas participantes que ganadores");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 2, "Pizza", inicio, fin);
        //Agrego participantesa
        Cliente cliente1 = new Cliente("Juan", "juan@hotmail.com");
        Cliente cliente2 = new Cliente("A", "juan@hotmail.com");
        Cliente cliente3 = new Cliente("B", "juan@hotmail.com");
        Cliente cliente4 = new Cliente("C", "juan@hotmail.com");
        sorteo.getParticipantes().add(cliente1);
        sorteo.getParticipantes().add(cliente2);
        sorteo.getParticipantes().add(cliente3);
        sorteo.getParticipantes().add(cliente4);
        //pruebo que hay dos ganadores
        assertEquals(2, sorteo.realizarSorteo().size());
    }
    
    /*@Test
    public void testRealizarSorteoConMuchosParticipantes() {
        System.out.println("test realizarSorteo con muchos participantes");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 10, "Pizza", inicio, fin);
        //Agrego participantesa
        Cliente cliente1 = new Cliente("Juan", "juan@hotmail.com");
        Cliente cliente2 = new Cliente("A", "juan@hotmail.com");
        Cliente cliente3 = new Cliente("B", "juan@hotmail.com");
        Cliente cliente4 = new Cliente("C", "juan@hotmail.com");
        Cliente cliente5 = new Cliente("A", "juan@hotmail.com");
        Cliente cliente6 = new Cliente("B", "juan@hotmail.com");
        Cliente cliente7 = new Cliente("C", "juan@hotmail.com");
        Cliente cliente8 = new Cliente("A", "juan@hotmail.com");
        Cliente cliente9 = new Cliente("B", "juan@hotmail.com");
        Cliente cliente0 = new Cliente("C", "juan@hotmail.com");
        sorteo.getParticipantes().add(cliente1);
        sorteo.getParticipantes().add(cliente2);
        sorteo.getParticipantes().add(cliente3);
        sorteo.getParticipantes().add(cliente4);
        sorteo.getParticipantes().add(cliente5);
        sorteo.getParticipantes().add(cliente6);
        sorteo.getParticipantes().add(cliente7);
        sorteo.getParticipantes().add(cliente8);
        sorteo.getParticipantes().add(cliente9);
        sorteo.getParticipantes().add(cliente0);
        //pruebo que hay dos ganadores
        assertEquals(10, sorteo.realizarSorteo().size());
    }*/

    @Test
    public void testRealizarSorteoConParticipantesSorteoYaRealizado() {
        System.out.println("test realizarSorteo con participantes pero con sorteo ya realizado");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        //Agrego participantes
        Cliente cliente = new Cliente("Juan", "juan@hotmail.com");
        sorteo.getParticipantes().add(cliente);
        //ganadores del sorteo tendria que quedar
        ArrayList<Cliente> ganadores = new ArrayList();
        //pruebo
        sorteo.realizarSorteo();
        assertEquals(ganadores, sorteo.realizarSorteo());
    }


    @Test
    public void testRealizarSorteoSinParticipantes() {
        System.out.println("test realizarSorteo sin participantes");
        Date inicio = new Date(116, 10, 10);
        Date fin = new Date(117, 10, 10);
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
        //ganadores del sorteo tendria que quedar
        ArrayList<Cliente> ganadores = new ArrayList();
        //pruebo
        assertEquals(ganadores, sorteo.realizarSorteo());
    }
}
