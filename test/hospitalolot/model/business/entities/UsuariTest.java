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
public class UsuariTest {
    
    public UsuariTest() {
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
     * Test de NomUsuari
     */
    @Test
    public void testGetAndSetNomCorrecte() {
        System.out.println("testGetAndSetNomCorrecte");
        Usuari instance = new Usuari();
        String expResult = "Administrador";
        instance.setContrasenya(expResult);
        assertNotNull(instance.getContrasenya());
    }

    @Test
    public void testGetAndSetNomIncorrecte() {
        System.out.println("testGetAndSetNomIncorrecte");
        Usuari instance = new Usuari();
        String expResult = null;
        instance.setContrasenya(expResult);
        assertNotNull(instance.getContrasenya());
    }

    /**
     * Test de Contrasenya
     */
    @Test
    public void testGetAndSetContrasenyaCorrecte() {
        System.out.println("testGetAndSetContrasenyaCorrecte");
        Usuari instance = new Usuari();
        String expResult = "Patata123";
        instance.setContrasenya(expResult);
        assertNotNull(instance.getContrasenya());
    }

    @Test
    public void testGetAndSetContrasenyaIncorrecte() {
        System.out.println("testGetAndSetContrasenyaIncorrecte");
        Usuari instance = new Usuari();
        String expResult = null;
        instance.setContrasenya(expResult);
        assertNotNull(instance.getContrasenya());
    }


    /**
     * Test de IDTreballador
     */
    @Test
    public void testGetAndSetIdTreballadorCorrecte() {
        System.out.println("testGetAndSetIdTreballadorCorrecte");
        Usuari instance = new Usuari();
        int expResult = 1;
        instance.setIdTreballador(expResult);
        assertNotNull(instance.getIdTreballador());
    }
    
}
