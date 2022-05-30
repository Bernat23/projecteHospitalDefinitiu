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
public class TreballadorTest {
    
    public TreballadorTest() {
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
     * Test de NomTreballador
     */
    @Test
    public void testGetAndSetNomCorrecte() {
        System.out.println("testGetAndSetNomCorrecte");
        String nom = "Pere";
        Treballador instance = new Treballador();
        instance.setNom(nom);
        assertNotNull(instance.getNom());
    }

    @Test
    public void testGetAndSetNomIncorrecte() {
        System.out.println("testGetAndSetNomIncorrecte");
        String nom = null;
        Treballador instance = new Treballador();
        instance.setNom(nom);
        assertNotNull(instance.getNom());
    }
    
}
