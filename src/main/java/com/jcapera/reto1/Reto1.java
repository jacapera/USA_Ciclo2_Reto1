package com.jcapera.reto1;

import java.util.Scanner;

/**
 * Casos de prueba:
 * Entrada: 73.1  1.65  35  / Salida:  26.9 Medio
 * Entrada: 190   1.60  100 / Salida:  ERROR
 * Entrada: 73    1.65  45  / Salida:  26.8 Alto
 * Entrada: 73    1.65  44  / Salida:  26.8 Medio
 * Entrada: 69.2  1.61  32  / Salida:  26.7 Medio
 * Entrada: 0     0     0   / Salida:  ERROR
 * Entrada: -1    -1    -1  / Salida:  ERROR
 * @author jesus capera
 */
public class Reto1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] datosIngreso = sc.nextLine().split(" ");

        double peso = Double.parseDouble(datosIngreso[0]);
        double altura = Double.parseDouble(datosIngreso[1]);
        int edad = Integer.parseInt(datosIngreso[2]);

        Persona persona = new Persona(peso, altura, edad);
        persona.validarRiesgo(persona.calcularIMC(peso, altura, edad));
        //persona.calcular_imc(peso, altura, edad);
        
    }
}
