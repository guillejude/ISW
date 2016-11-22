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
        Sorteo sorteo = new Sorteo("Pizza", 4, "Pizza", inicio, fin);
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
