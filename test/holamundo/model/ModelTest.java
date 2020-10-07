/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Moroni
 */
public class ModelTest {
    
    public ModelTest() {
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
     * Test of getGreeting method, of class Model.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        Model instance = new ModelImpl();
        String expResult = "Hola mundo mvc";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!expResult.equalsIgnoreCase(result)){
        fail("The test case is a prototype.");
    }
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(String expResult, String result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class ModelImpl implements Model {

        @Override
        public String getGreeting() {
            return "Hola Mundo MVC";
        }
    }
    
}
