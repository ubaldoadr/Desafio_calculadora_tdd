package cl.praxis.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    Calculadora cl = new Calculadora();

    @Test
    public void sumarTest(){
        final double  c = cl.sumar(4,5);

        assertEquals(9,c);

    }

    @Test
    public void restarTest(){
        assertEquals(5,cl.restar(10,5));
    }

    @Test
    public void multiplicarTest(){
        assertEquals(20,cl.multiplicar(4,5));
    }

    @Test
    public void dividir(){
        ArithmeticException exception = assertThrows(ArithmeticException.class, () ->
                cl.dividir(1, 0));
        assertEquals("No se puede dividir por cero.", exception.getMessage());
        assertEquals(2,cl.dividir(10,5));
    }
}
