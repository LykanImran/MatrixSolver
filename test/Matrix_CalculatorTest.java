/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raj
 */
public class Matrix_CalculatorTest {
    
    public Matrix_CalculatorTest() {
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
     * Test of getMatrix method, of class Matrix_Calculator.
     */
    @Test
    public void testGetMatrix() {
        System.out.println("getMatrix");
        String string = "";
        Matrix_Calculator instance = new Matrix_Calculator();
        instance.getMatrix(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Matrix_Calculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Matrix_Calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
