/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcutest;

/**
 *
 * @author 123 jeisson Lopez jlopezh36@miumg.edu.gt
 */
public class Calculadora {
    
    /**
     * Método para sumar dos números enteros.
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return La suma de a y b.
     */
    public int sumar(int a, int b) {
        return a + b; // Retorna el resultado de la suma.
    }
    
    // metodo para resta
        public int restar(int a, int b) {
        return a - b;
    }
        
     /**
     * Método para multiplicar dos números enteros.
     * @param a Primer número
     * @param b Segundo número
     * @return El producto de a y b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Método para dividir dos números enteros.
     * @param a Dividendo
     * @param b Divisor (Debe ser diferente de 0)
     * @return El resultado de la división
     * @throws ArithmeticException si b es 0
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}
