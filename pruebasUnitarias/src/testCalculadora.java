
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class testCalculadora {
    @Test
    public void testSuma() {
        Calculadora suma = new Calculadora(5L, 6L);
        assertEquals(11L, suma.suma());
    }

    @Test
    public void testResta() {
        Calculadora resta = new Calculadora(8L, 4L);
        assertEquals(4L, resta.resta());
    }

    @Test
    public void testMult() {
        Calculadora multiplicacion = new Calculadora(5L, 6L);
        assertEquals(30L, multiplicacion.multiplicacion());
    }

    @Test
    public void testDiv() {
        Calculadora division = new Calculadora(10L, 5L);
        assertEquals(2L, division.division());
    }

    @Test
    public void testExpo() {
        Calculadora exponente = new Calculadora(3L, 2L);
        assertEquals(9L, exponente.exponente());
    }

    @Test
    public void testAbs() {
        Calculadora absoluto = new Calculadora(5L);
        assertEquals(5L, absoluto.absoluto());
    }

    @Test
    public void testPositivo() {
        Calculadora positivo = new Calculadora(5L);
        assertTrue(positivo.esPositivo());
    }
}
