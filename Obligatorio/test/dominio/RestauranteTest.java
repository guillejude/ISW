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
public class RestauranteTest {
    
    public RestauranteTest() {
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
     * Test of getNombre method, of class Restaurante.
     */
    @Test
    public void testGetNombre() {
        System.out.println("test getNombre");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        assertEquals("La Pasiva", restaurante.getNombre());
    }

    /**
     * Test of setNombre method, of class Restaurante.
     */
    @Test
    public void testSetNombre() {
        System.out.println("test setNombre");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.setNombre("El Pasivo");
        assertEquals("El Pasivo", restaurante.getNombre());
    }

    /**
     * Test of getDireccion method, of class Restaurante.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("test getDireccion");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        assertEquals("Cuareim 1414", restaurante.getDireccion());
    }

    /**
     * Test of setDireccion method, of class Restaurante.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("test setDireccion");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.setDireccion("Cuareim 1111");
        assertEquals("Cuareim 1111", restaurante.getDireccion());
    }

    /**
     * Test of getHorarioAbrir method, of class Restaurante.
     */
    @Test
    public void testGetHorarioAbrir() {
        System.out.println("test getHorarioAbrir");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        assertEquals("10:00", restaurante.getHorarioAbrir());
    }

    /**
     * Test of setHorarioAbrir method, of class Restaurante.
     */
    @Test
    public void testSetHorarioAbrir() {
        System.out.println("test setHorarioAbrir");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.setHorarioAbrir("11 am");
        assertEquals("11 am", restaurante.getHorarioAbrir());
    }

    /**
     * Test of getHorarioCerrar method, of class Restaurante.
     */
    @Test
    public void testGetHorarioCerrar() {
        System.out.println("test getHorarioCerrar");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        assertEquals("23:00", restaurante.getHorarioCerrar());
    }

    /**
     * Test of setHorarioCerrar method, of class Restaurante.
     */
    @Test
    public void testSetHorarioCerrar() {
        System.out.println("test setHorarioCerrar");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.setHorarioCerrar("2330");
        assertEquals("2330", restaurante.getHorarioCerrar());
    }

    /**
     * Test of getTipoComida method, of class Restaurante.
     */
    @Test
    public void testGetTipoComida() {
        System.out.println("test getTipoComida");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        assertEquals("Pizzeria", restaurante.getTipoComida());
    }

    /**
     * Test of setTipoComida method, of class Restaurante.
     */
    @Test
    public void testSetTipoComida() {
        System.out.println("test setTipoComida");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.setTipoComida("Bar");
        assertEquals("Bar", restaurante.getTipoComida());
    }

    /**
     * Test of getEvaluaciones method, of class Restaurante.
     */
    @Test
    public void testGetEvaluaciones() {
        System.out.println("test getEvaluaciones");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        ArrayList<Evaluacion> evaluaciones = new ArrayList();
        assertEquals(evaluaciones, restaurante.getEvaluaciones());
    }

    /**
     * Test of setEvaluaciones method, of class Restaurante.
     */
    @Test
    public void testSetEvaluaciones() {
        System.out.println("test getEvaluaciones");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        ArrayList<Evaluacion> evaluaciones = new ArrayList();
        Evaluacion evaluacion = new Evaluacion(null, 3, "Bueno");
        evaluaciones.add(evaluacion);
        restaurante.setEvaluaciones(evaluaciones);
        assertEquals(evaluaciones, restaurante.getEvaluaciones());
    }

    /**
     * Test of getParticipantes method, of class Restaurante.
     */
    @Test
    public void testGetParticipantes() {
        System.out.println("test getParticipantes");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        ArrayList<Evaluacion> participantes = new ArrayList();
        assertEquals(participantes, restaurante.getParticipantes());
    }

    /**
     * Test of setParticipantes method, of class Restaurante.
     */
    @Test
    public void testSetParticipantes() {
        System.out.println("test setParticipantes");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        ArrayList<Cliente> participantes = new ArrayList();
        Cliente cliente = new Cliente("Juan", "");
        participantes.add(cliente);
        restaurante.setParticipantes(participantes);
        assertEquals(participantes, restaurante.getParticipantes());
    }

    /**
     * Test of isEstaDefinidoSorteo method, of class Restaurante.
     */
    @Test
    public void testIsEstaDefinidoSorteo() {
        System.out.println("test isEstaDefinidoSorteo");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        assertFalse(restaurante.isEstaDefinidoSorteo());
    }

    /**
     * Test of setEstaDefinidoSorteo method, of class Restaurante.
     */
    @Test
    public void testSetEstaDefinidoSorteo() {
        System.out.println("test setEstaDefinidoSorteo");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.setEstaDefinidoSorteo(true);
        assertTrue(restaurante.isEstaDefinidoSorteo());
    }

    /**
     * Test of getCantidadGanadores method, of class Restaurante.
     */
    @Test
    public void testGetCantidadGanadores() {
        System.out.println("test getCantidadGanadores");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        assertEquals(0, restaurante.getCantidadGanadores());
    }

    /**
     * Test of setCantidadGanadores method, of class Restaurante.
     */
    @Test
    public void testSetCantidadGanadores() {
        System.out.println("test setCantidadGanadores");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.setCantidadGanadores(3);
        assertEquals(3, restaurante.getCantidadGanadores());
    }

    /**
     * Test of getDescripcionPremio method, of class Restaurante.
     */
    @Test
    public void testGetDescripcionPremio() {
        System.out.println("test getDescripcionPremio");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        assertEquals("", restaurante.getDescripcionPremio());
    }

    /**
     * Test of setDescripcionPremio method, of class Restaurante.
     */
    @Test
    public void testSetDescripcionPremio() {
        System.out.println("test setDescripcionPremio");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.setDescripcionPremio("Pizza");
        assertEquals("Pizza", restaurante.getDescripcionPremio());
    }

    /**
     * Test of equals method, of class Restaurante.
     */
    @Test
    public void testEqualsMismoNombreDireccion() {
        System.out.println("test equals mismo nombre y direccion");
        Restaurante restaurante1 = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        Restaurante restaurante2 = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        assertTrue(restaurante1.equals(restaurante2));
    }
    
    @Test
    public void testEqualsMismoNombreDistintaDireccion() {
        System.out.println("test equals mismo nombre y distinta direccion");
        Restaurante restaurante1 = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        Restaurante restaurante2 = new Restaurante("La Pasiva", "Cuareim 1111", "10:00", "23:00", "Pizzeria");
        assertFalse(restaurante1.equals(restaurante2));
    }
    
    @Test
    public void testEqualsDistintoNombreMismaDireccion() {
        System.out.println("test equals distinto nombre y misma direccion");
        Restaurante restaurante1 = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        Restaurante restaurante2 = new Restaurante("El Pasivo", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        assertFalse(restaurante1.equals(restaurante2));
    }
    
    @Test
    public void testEqualsDistintoNombreDistintaDireccion() {
        System.out.println("test equals distinto nombre y distinta direccion");
        Restaurante restaurante1 = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        Restaurante restaurante2 = new Restaurante("El Pasivo", "Cuareim 1111", "10:00", "23:00", "Pizzeria");
        assertFalse(restaurante1.equals(restaurante2));
    }

    /**
     * Test of toString method, of class Restaurante.
     */
    @Test
    public void testToString() {
        System.out.println("test equals distinto nombre y distinta direccion");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        String texto = "La Pasiva, Cuareim 1414";
        assertEquals(texto, restaurante.toString());
    }

    /**
     * Test of agregarEvaluacion method, of class Restaurante.
     */
    @Test
    public void testAgregarEvaluacionClienteNuevoConResena() {
        System.out.println("test agregarEvaluacion cliente nuevo y con resena");
        //agrega la evaluacion y al cliente 
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.agregarEvaluacion("Juan", "juan@hotmail.com", 3, "Bueno");
        //Como tendria que quedar la lista de evaluaciones
        Cliente cliente = new Cliente("Juan", "juan@hotmail.com");
        Evaluacion evaluacion = new Evaluacion(cliente, 3, "Bueno");
        ArrayList<Evaluacion> evaluaciones = new ArrayList();
        evaluaciones.add(evaluacion);
        //como tendria que quedar la lista de participantes
        ArrayList<Cliente> participantes = new ArrayList();
        participantes.add(cliente);
        //pruebo
        assertEquals(evaluaciones, restaurante.getEvaluaciones());
        assertEquals(participantes, restaurante.getParticipantes());
    }
    
    @Test
    public void testAgregarEvaluacionClienteNuevoSinResena() {
        System.out.println("test agregarEvaluacion cliente nuevo y sin resena");
        //agrega la evaluacion y al cliente 
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.agregarEvaluacion("Juan", "juan@hotmail.com", 3, "");
        //Como tendria que quedar la lista de evaluaciones
        Cliente cliente = new Cliente("Juan", "juan@hotmail.com");
        Evaluacion evaluacion = new Evaluacion(cliente, 3, "");
        ArrayList<Evaluacion> evaluaciones = new ArrayList();
        evaluaciones.add(evaluacion);
        //como tendria que quedar la lista de participantes
        ArrayList<Cliente> participantes = new ArrayList();
        //pruebo
        assertEquals(evaluaciones, restaurante.getEvaluaciones());
        assertEquals(participantes, restaurante.getParticipantes());
    }
    
    @Test
    public void testAgregarEvaluacionClienteExistenteConResena() {
        System.out.println("test agregarEvaluacion cliente existente y con resena");
        //agrega la evaluacion y al cliente 
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.agregarEvaluacion("Juan", "juan@hotmail.com", 3, "Bueno");
        restaurante.agregarEvaluacion("Juan", "juan@hotmail.com", 4, "Muy Bueno");
        //Como tendria que quedar la lista de evaluaciones
        Cliente cliente = new Cliente("Juan", "juan@hotmail.com");
        Evaluacion evaluacion1 = new Evaluacion(cliente, 3, "Bueno");
        Evaluacion evaluacion2 = new Evaluacion(cliente, 4, "Muy Bueno");
        ArrayList<Evaluacion> evaluaciones = new ArrayList();
        evaluaciones.add(evaluacion1);
        evaluaciones.add(evaluacion2);
        //como tendria que quedar la lista de participantes
        ArrayList<Cliente> participantes = new ArrayList();
        participantes.add(cliente);
        //pruebo
        assertEquals(evaluaciones, restaurante.getEvaluaciones());
        assertEquals(participantes, restaurante.getParticipantes());
    }
    
    @Test
    public void testAgregarEvaluacionClienteExistenteSinResena() {
        System.out.println("test agregarEvaluacion cliente existente y con resena");
        //agrega la evaluacion y al cliente 
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.agregarEvaluacion("Juan", "juan@hotmail.com", 3, "Bueno");
        restaurante.agregarEvaluacion("Juan", "juan@hotmail.com", 4, "");
        //Como tendria que quedar la lista de evaluaciones
        Cliente cliente = new Cliente("Juan", "juan@hotmail.com");
        Evaluacion evaluacion1 = new Evaluacion(cliente, 3, "Bueno");
        Evaluacion evaluacion2 = new Evaluacion(cliente, 4, "");
        ArrayList<Evaluacion> evaluaciones = new ArrayList();
        evaluaciones.add(evaluacion1);
        evaluaciones.add(evaluacion2);
        //como tendria que quedar la lista de participantes
        ArrayList<Cliente> participantes = new ArrayList();
        participantes.add(cliente);
        //pruebo
        assertEquals(evaluaciones, restaurante.getEvaluaciones());
        assertEquals(participantes, restaurante.getParticipantes());
    }
    
    @Test
    public void testAgregarEvaluacionClienteAnonimoConResena() {
        System.out.println("test agregarEvaluacion cliente existente y con resena");
        //agrega la evaluacion y al cliente 
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.agregarEvaluacion("", "", 3, "Bueno");
        //Como tendria que quedar la lista de evaluaciones
        Cliente cliente = new Cliente("", "");
        Evaluacion evaluacion = new Evaluacion(cliente, 3, "Bueno");
        ArrayList<Evaluacion> evaluaciones = new ArrayList();
        evaluaciones.add(evaluacion);
        //como tendria que quedar la lista de participantes
        ArrayList<Cliente> participantes = new ArrayList();
        //pruebo
        assertEquals(evaluaciones, restaurante.getEvaluaciones());
        assertEquals(participantes, restaurante.getParticipantes());
    }
    
    @Test
    public void testAgregarEvaluacionClienteAnonimoSinResena() {
        System.out.println("test agregarEvaluacion cliente existente y con resena");
        //agrega la evaluacion y al cliente 
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.agregarEvaluacion("", "", 3, "");
        //Como tendria que quedar la lista de evaluaciones
        Cliente cliente = new Cliente("", "");
        Evaluacion evaluacion = new Evaluacion(cliente, 3, "");
        ArrayList<Evaluacion> evaluaciones = new ArrayList();
        evaluaciones.add(evaluacion);
        //como tendria que quedar la lista de participantes
        ArrayList<Cliente> participantes = new ArrayList();
        //pruebo
        assertEquals(evaluaciones, restaurante.getEvaluaciones());
        assertEquals(participantes, restaurante.getParticipantes());
    }

    /**
     * Test of definirSorteo method, of class Restaurante.
     */
    @Test
    public void testDefinirSorteo() {
        System.out.println("test definirSorteo");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.definirSorteo(3, "Pizza");
        assertTrue(restaurante.isEstaDefinidoSorteo());
        assertEquals(3, restaurante.getCantidadGanadores());
        assertEquals("Pizza", restaurante.getDescripcionPremio());
    }

    /**
     * Test of realizarSorteo method, of class Restaurante.
     */
    @Test
    public void testRealizarSorteoConParticipante() {
        System.out.println("test realizarSorteo con participante");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.definirSorteo(3, "Pizza");
        //Agrego participantes
        restaurante.agregarEvaluacion("Juan", "juan@hotmail.com", 3, "Bueno");
        //ganadores del sorteo tendria que quedar
        ArrayList<Cliente> ganadores = new ArrayList();
        Cliente cliente  = new Cliente("Juan", "juan@hotmail.com");
        ganadores.add(cliente);
        //pruebo
        assertEquals(ganadores, restaurante.realizarSorteo());
    }
    
    @Test
    public void testRealizarSorteoConMasParticipantesQueGanadores() {
        System.out.println("test realizarSorteo con mas participantes que ganadores");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.definirSorteo(2, "Pizza");
        //Agrego participantes
        restaurante.agregarEvaluacion("Juan", "juan@hotmail.com", 3, "Bueno");
        restaurante.agregarEvaluacion("Martin", "martin@hotmail.com", 3, "Bueno");
        restaurante.agregarEvaluacion("Matias", "matias@hotmail.com", 3, "Bueno");
        //pruebo que hay dos ganadores
        assertEquals(2, restaurante.realizarSorteo().size());
    }
    
    @Test
    public void testRealizarSorteoConParticipantesSinSorteoDefinido() {
        System.out.println("test realizarSorteo con participantes pero sin sorteo definido");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        //Agrego participantes
        restaurante.agregarEvaluacion("Juan", "juan@hotmail.com", 3, "Bueno");
        restaurante.agregarEvaluacion("Martin", "martin@hotmail.com", 3, "Bueno");
        restaurante.agregarEvaluacion("Matias", "matias@hotmail.com", 3, "Bueno");
        //Tendria que devolver una lista vacia
        ArrayList<Cliente> ganadores = new ArrayList();
        //pruebo
        assertEquals(ganadores, restaurante.realizarSorteo());
    }
    
    @Test
    public void testRealizarSorteoSinParticipantesSinSorteoDefinido() {
        System.out.println("test realizarSorteo sin participantes pero sin sorteo definido");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        //Tendria que devolver una lista vacia
        ArrayList<Cliente> ganadores = new ArrayList();
        //pruebo
        assertEquals(ganadores, restaurante.realizarSorteo());
    }
    
    @Test
    public void testRealizarSorteoSinParticipantesConSorteoDefinido() {
        System.out.println("test realizarSorteo sin participantes pero con sorteo definido");
        Restaurante restaurante = new Restaurante("La Pasiva", "Cuareim 1414", "10:00", "23:00", "Pizzeria");
        restaurante.definirSorteo(3, "Pizza");
        //Tendria que devolver una lista vacia
        ArrayList<Cliente> ganadores = new ArrayList();
        //pruebo
        assertEquals(ganadores, restaurante.realizarSorteo());
    }
}
