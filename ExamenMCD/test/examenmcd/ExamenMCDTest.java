/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenmcd;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dcuerdogarcia
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ExamenMCDTest {
    
    public ExamenMCDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

  
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 = 1;
        int num2 = 3;
        Calculo instance = new Calculo();
        int expResult = 1;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result);
       
    }
    
}