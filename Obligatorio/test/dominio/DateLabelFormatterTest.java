/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
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
public class DateLabelFormatterTest {
    
    public DateLabelFormatterTest() {
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
     * Test of stringToValue method, of class DateLabelFormatter.
     */
    @Test
    public void testStringToValue() throws Exception {
        System.out.println("test stringToValue");
        DateLabelFormatter dlf = new DateLabelFormatter();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        assertEquals(dateFormatter.parse("10-10-2016"), dlf.stringToValue("10-10-2016"));
    }

    /**
     * Test of valueToString method, of class DateLabelFormatter.
     */
    @Test
    public void testValueToStringNoNull() throws Exception {
        System.out.println("test valueToString no null");
        DateLabelFormatter dlf = new DateLabelFormatter();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UYST"), Locale.ENGLISH);
        cal.set(2016, 9, 10);
        assertEquals("10-10-2016", dlf.valueToString(cal));
    }
    
    @Test
    public void testValueToStringNull() throws Exception {
        System.out.println("test valueToString null");
        DateLabelFormatter dlf = new DateLabelFormatter();
        assertEquals("", dlf.valueToString(null));
    }
}
