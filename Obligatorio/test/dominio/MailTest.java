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
public class MailTest {
    
    public MailTest() {
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
     * Test of SendMail method, of class Mail.
     */
    @Test
    public void testSendMailCorrecto() {
        System.out.println("Test SendMail con informacion correcta");
        Mail mail = new Mail();
        assertTrue(mail.SendMail("Juan", "La Pasiva", "guillejude@hotmail.com" , "Un metro de pizza gratis"));
    }
    
    @Test
    public void testSendMailMailIncorrecto() {
        System.out.println("Test SendMail con informacion mail incorrecto");
        Mail mail = new Mail();
        assertFalse(mail.SendMail("Juan", "La Pasiva", "" , "Un metro de pizza gratis"));
    }
    
}
