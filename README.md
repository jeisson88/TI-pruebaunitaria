# TI-pruebaunitaria
# Este proyecto es una implementación simple de una Calculadora con pruebas unitarias en JUnit 4, desarrollado en NetBeans 21.
# Tecnologías Utilizadas
  Java 8+ (Compatible con versiones más recientes)
  JUnit 4 (Framework para pruebas unitarias)
  NetBeans IDE 21
  # Código Fuente
  # Clase Calculadora
  package com.mycompany.calcutest;

/**
 * Clase Calculadora que proporciona operaciones matemáticas básicas.
 */
public class Calculadora {
    /**
     * Método para sumar dos números enteros.
     * @param a Primer número.
     * @param b Segundo número.
     * @return La suma de a y b.
     */
    public int sumar(int a, int b) {
        return a + b;
    }
}


# Clase de Pruebas: CalculadoraTest
package com.mycompany.calcutest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de pruebas unitarias para la Calculadora usando JUnit 4.
 */
public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado); // 2 + 3 = 5
    }

    @Test
    public void testSumarNegativos() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(-2, -3);
        assertEquals(-5, resultado); // -2 + (-3) = -5
    }

    @Test
    public void testSumarCero() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(0, 0);
        assertEquals(0, resultado); // 0 + 0 = 0
    }
}


# Cómo Ejecutar el Proyecto
# opcion 1 clonar el repositorio
https://github.com/jeisson88/TI-pruebaunitaria.git
lo puede clonar mediante este enlace
# opcion 2
# descargar el archivo Rar
decomprimirlo
#  Abrir en NetBeans
Abrir NetBeans 21.
Seleccionar Archivo → Abrir Proyecto.
Buscar y abrir el proyecto calcuTest.
# Ejecutar las Pruebas
# Método 1: 
Clic derecho en CalculadoraTest.java → Ejecutar Prueba.
# Método 2: 
Usar el atajo Ctrl + F6.

Si todas las pruebas pasan correctamente, verás el siguiente mensaje en la consola:
# Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
