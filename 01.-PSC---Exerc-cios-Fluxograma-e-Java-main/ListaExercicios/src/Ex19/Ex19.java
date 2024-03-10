
package Ex19;

/*
 * Escreva um programa que calcule os quadrados e cubos dos números de 0 a 10 e 
 * imprima os valores resultantes em formato de tabela como a seguir:

    Número                       Quadrado                       Cubo

    0                                 0                                      0

    1                                 1                                      1
 * 
 */
public class Ex19 {

    public static void main(String[] args) {
            double numero, quadrado, cubo;

            System.out.println("Número                       Quadrado                       Cubo");
            numero = 0;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                            %.0f\n", numero, quadrado, cubo);

            numero = 1;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                            %.0f\n", numero, quadrado, cubo);

            numero = 2;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                            %.0f\n", numero, quadrado, cubo);

            numero = 3;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                            %.0f\n", numero, quadrado, cubo);

            numero = 4;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 5;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 6;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 7;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 8;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 9;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 10;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                             %.0f                          %.0f\n", numero, quadrado, cubo);
    }
    
    
}
