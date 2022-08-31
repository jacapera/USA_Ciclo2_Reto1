# MinTic Universidad Sergio Arboleda Ciclo2
## USA_Ciclo2_Reto1

Índice de masa corporal (IMC)

Andrés, un estudiante de primer semestre de Medicina quiere calcular el nivel de riesgo que tiene sus familiares de sufrir problemas del corazón. Una persona puede estar en riesgo de sufrir estas enfermedades dependiendo de su edad y su índice de masa corporal (IMC).

<table>
  <tr>
    <td><strong></strong></td>
    <td><strong>Edad < 45</strong></td>
    <td><strong>Edad >= 45</strong></td>
  </tr>
  <tr>
    <td><strong>IMC < 22</strong></td>
    <td>Bajo</td>
    <td>Medio</td>
  </tr>
   <tr>
    <td><strong>IMC >= 22</strong></td>
    <td>Medio</td>
    <td>Alto</td>
  </tr>
</table>

Para calcular el índice de masa corporal (IMC) calculamos el cociente entre el peso del individuo en kilos y el cuadrado de su altura en metros.  Debido a que se requiere analizar la información de varias personas, la mejor alternativa es construir un programa que realice los cálculos de forma automática.

<strong>Entrada: </strong>
- Cada caso de prueba estará formado por una línea formada por 3 valores serparados por un espacio (la masa de la persona en kilogramos, la altura de la personas en metros, la edad de la persona en años).
- Los valores de masa permitidos están entre 0 y 150, los valores de altura permitidos están entre 0.1 y 2.5, los valores de años permitidos están entre 0 y 110.  Si alguno de los valores está fuera del rango permitido se debe imprimir un mensaje de error.

<strong>Salida: </strong>
- El programa imprimirá una línea con dos valores separados por un espacio (EL IMC calculado con un número decimal, el nivel de riesgo actual), en caso de ingresar algún valor de masa, altura o edad fuera de los rangos permitidos se debe imprimir la palabra "ERROR"

<strong>Casos de prueba:</strong>

 * Entrada: 73.1  1.65  35  / Salida:  26.9 Medio
 * Entrada: 190   1.60  100 / Salida:  ERROR
 * Entrada: 73    1.65  45  / Salida:  26.8 Alto
 * Entrada: 73    1.65  44  / Salida:  26.8 Medio
 * Entrada: 69.2  1.61  32  / Salida:  26.7 Medio
 * Entrada: 0     0     0   / Salida:  ERROR
 * Entrada: -1    -1    -1  / Salida:  ERROR

 

https://user-images.githubusercontent.com/96667971/187580191-380a785f-a09a-41df-9929-6ffbe1e9be0d.mp4


  
  



