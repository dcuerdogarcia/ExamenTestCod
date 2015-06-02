/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmcd;



import examenmcd.Calculo;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author dcuerdogarcia
 */

@RunWith(Parameterized.class)
public class CalculoParametrizada {

    private int result;
    Calculo cal = new Calculo();

    @Before
    public void initialize() {

    }

    public CalculoParametrizada(Calculo cal, int result) {
        this.cal = cal;
        this.result = result;

    }

    @Parameterized.Parameters
    public static Collection MCDnumbers() {
        return Arrays.asList(new Object[][]{
            {new Calculo(2, 2), 2},
            {new Calculo(2, 5), 1},
            {new Calculo(2, 2), 2},
            {new Calculo(2, -1), 3}

        });
    }

    @Test
    public void testMCDnumbersChecker() {
        System.out.println("Parameterized MCD is : " + result);
        assertEquals(result, cal.obtenerMCD(cal.getNumero1(), cal.getNumero2()));
    }
}