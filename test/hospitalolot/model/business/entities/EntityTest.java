/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hospitalolot.model.business.entities;

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
public class EntityTest {
    
    public EntityTest() {
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
     * Test of getId method, of class Entity.
     */
    @Test
    public void testSetAndGetIdCorrecte() {
        System.out.println("testSetAndGetIdCorrecte");
        Entity instance = new EntityImpl();
        long expResult = 1;
        instance.setId(expResult);
        assertNotNull(instance.getId());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setId method, of class Entity.
     */
    @Test
    public void testSetAndGetIdIncorrecte() {
        System.out.println("testSetAndGetIdCorrecte");
        Entity instance = new EntityImpl();
        long expResult = 1;
        instance.setId(expResult);
        assertNotNull (instance.getId());
        // TODO review the generated test code and remove the default call to fail.
    }

    public class EntityImpl extends Entity {
    }
    
}
