package com.jcapera.reto1;

/**
 *
 * @author jesus capera
 */
public class Persona {

    private double peso;
    private double altura;
    private int edad;

    public Persona(double peso, double altura, int edad) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public boolean validarIngresoDatos() {
        if ((peso >= 0 && peso <= 150) && (altura >= 0.1 && altura <= 2.5) && (edad >= 0 && edad <= 110)) {
            return true;
        }
        return false;
    }

    public double calcularIMC(double peso, double altura, int edad) {
        double IMC = peso / (altura * altura);
        return IMC;
    }

    public String validarRiesgo(double IMC) {
        String riesgo = "";
        if (validarIngresoDatos()) {
            if (edad < 45 && IMC < 22) {
                riesgo = "Bajo";
            } else if ((edad >= 45 && IMC < 22) || (edad < 45 && IMC >= 22)) {
                riesgo = "Medio";
            } else {
                riesgo = "Alto";
            }
            System.out.println(String.format("%.1f", IMC) + " " + riesgo);
        } else {
            System.out.println("ERROR");
        }
        return riesgo;

    }

    public double calcular_imc(double peso, double altura, int edad) {

        String riesgo = "";
        double calcular_imc = peso / (altura * altura);
        //System.out.println(calcular_imc);
        if ((peso >= 0 && peso <= 150) && (altura >= 0.1 && altura <= 2.5) && (edad >= 0 && edad <= 110)) {
            if (edad < 45 && calcular_imc < 22) {
                riesgo = "Bajo";
            } else if ((edad >= 45 && calcular_imc < 22) || (edad < 45 && calcular_imc >= 22)) {
                riesgo = "Medio";
            } else {
                riesgo = "Alto";
            }
            System.out.println(String.format("%.1f", calcular_imc) + " " + riesgo);
        } else {
            System.out.println("ERROR");
        }
        return calcular_imc;
    }

}
