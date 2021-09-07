package org.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void probarSuma(){
        //Resultado esperado
        double resultado = 10.0; //5+5

        Calculadora calc = new Calculadora();

        assertEquals(resultado,calc.sumar(5,5),0.001);

    }

    @Test
    public void probarResta(){

        double resultado = 5.0; //5+5

        Calculadora calc = new Calculadora();

        assertEquals(resultado,calc.restar(10,5),0.001);
    }
}
