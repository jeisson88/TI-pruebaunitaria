/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.calcutest;

import org.junit.Test;  // Importa la anotación @Test para definir pruebas unitarias.
import static org.junit.Assert.*; // Importa las funciones de aserción de JUnit para validar los resultados.
import org.junit.Before;

/**
 * Clase de pruebas unitarias para la clase Calculadora.
 * Se utiliza JUnit para comprobar el correcto funcionamiento del método sumar.
 * 
 * @author 123 jeisson Lopez jlopezh36@miumg.edu.gt
 */
public class CalculadoraTest {

       private Calculadora calculadora;

    /**
     * Método que se ejecuta antes de cada prueba.
     * Inicializa la instancia de la calculadora.
     */
    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    /**
     * Prueba unitaria del método sumar.
     */
    @Test
    public void testSumar() {
        assertEquals(10, calculadora.sumar(5, 5));
        assertEquals(-2, calculadora.sumar(-1, -1));
        assertEquals(0, calculadora.sumar(0, 0));
    }

    /**
     * Prueba unitaria del método restar.
     */
    @Test
    public void testRestar() {
        assertEquals(0, calculadora.restar(5, 5));
        assertEquals(-10, calculadora.restar(-5, 5));
    }
    
        /**
     * Prueba unitaria del método multiplicar.
     */
    @Test
    public void testMultiplicar() {
        assertEquals(25, calculadora.multiplicar(5, 5));
        assertEquals(0, calculadora.multiplicar(5, 0));
    }

    /**
     * Prueba unitaria del método dividir.
     */
    @Test
    public void testDividir() {
        assertEquals(2.0, calculadora.dividir(10, 5), 0.001);
        assertEquals(0.5, calculadora.dividir(1, 2), 0.001);
    }

    /**
     * Prueba unitaria para verificar que se lanza la excepción al dividir por cero.
     */
    @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        calculadora.dividir(10, 0);
    }
}