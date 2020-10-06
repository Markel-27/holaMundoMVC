/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pocoy
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
    public class ModelImpl implements Model {

        @Override
        public String getGreeting() {
            return "Hola mundo mvc";
        }
    }
    
}
