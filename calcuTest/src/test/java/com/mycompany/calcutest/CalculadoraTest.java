/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.calcutest;

import org.junit.Test;  // Importa la anotación @Test para definir pruebas unitarias.
import static org.junit.Assert.*; // Importa las funciones de aserción de JUnit para validar los resultados.

/**
 * Clase de pruebas unitarias para la clase Calculadora.
 * Se utiliza JUnit para comprobar el correcto funcionamiento del método sumar.
 * 
 * @author 123 jeisson Lopez jlopezh36@miumg.edu.gt
 */
public class CalculadoraTest {

    /**
     * Prueba unitaria para verificar la suma de dos números positivos.
     * Se espera que 2 + 3 sea igual a 5.
     */
    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora(); // Crea una instancia de la Calculadora.
        int resultado = calculadora.sumar(2, 3); // Ejecuta el método sumar con los valores 2 y 3.
        assertEquals(5, resultado); // Verifica que el resultado esperado (5) coincida con el obtenido.
    }

    /**
     * Prueba unitaria para verificar la suma de dos números negativos.
     * Se espera que -2 + (-3) sea igual a -5.
     */
    @Test
    public void testSumarNegativos() {
        Calculadora calculadora = new Calculadora(); // Crea una instancia de la Calculadora.
        int resultado = calculadora.sumar(-2, -3); // Ejecuta el método sumar con valores negativos.
        assertEquals(-5, resultado); // Verifica que el resultado sea -5.
    }

    /**
     * Prueba unitaria para verificar la suma de ceros.
     * Se espera que 0 + 0 sea igual a 0.
     */
    @Test
    public void testSumarCero() {
        Calculadora calculadora = new Calculadora(); // Crea una instancia de la Calculadora.
        int resultado = calculadora.sumar(0, 0); // Ejecuta el método sumar con ceros.
        assertEquals(0, resultado); // Verifica que el resultado sea 0.
    }
}