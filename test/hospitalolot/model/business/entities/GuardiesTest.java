/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hospitalolot.model.business.entities;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class GuardiesTest {

    public GuardiesTest() {
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
     * Testos de Unitat
     */
    @Test
    public void testSetAndGetUCorrecte() {
        System.out.println("testSetAndGetUCorrecte");
        Unitat u = new Unitat("");
        Guardies instance = new Guardies();
        instance.setU(u);
        assertNotNull(instance.getU());
    }
    
    
    @Test
    public void testSetAndGetUIncorrecte() {
        System.out.println("testSetAndGetUIncorrecte");
        Unitat u = null;
        Guardies instance = new Guardies();
        instance.setU(u);
        assertNotNull(instance.getU());
    }

    /**
     * Testos de Categoria
     */
    @Test
    public void testSetAndGetCCorrecte() {
        System.out.println("testSetAndGetCCorrecte");
        Categoria c = new Categoria("");
        Guardies instance = new Guardies();
        instance.setC(c);
        assertNotNull(instance.getC());
    }
    
    @Test
    public void testSetAndGetCIncorrecte() {
        System.out.println("testSetAndGetCIncorrecte");
        Categoria c = null;
        Guardies instance = new Guardies();
        instance.setC(c);
        assertNotNull(instance.getC());
    }
    
    /**
     * Testos de Torn
     */
    @Test
    public void testSetAndGetTCorrecte() {
        System.out.println("testSetAndGetTCorrecte");
        Torn t = new Torn("");
        Guardies instance = new Guardies();
        instance.setT(t);
        assertNotNull(instance.getT());
    }
    
    @Test
    public void testSetAndGetTIncorrecte() {
        System.out.println("testSetAndGetTIncorrecte");
        Torn t = null;
        Guardies instance = new Guardies();
        instance.setT(t);
        assertNotNull(instance.getT());
    }

}
