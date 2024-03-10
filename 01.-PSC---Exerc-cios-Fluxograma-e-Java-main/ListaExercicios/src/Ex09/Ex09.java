
package Ex09;

import java.util.Scanner;

 /*
 *Desenvolva um programa que calcula a área de um círculo,
 *onde o raio é fornecido pelo usuário.
 */
public class Ex09{

    public static void main(String[] args) {
        double raio, area, pi;
        Scanner input = new Scanner(System.in);

        pi = Math.PI;

        System.out.print("Para calcular a área de um circulo é nescessário saber seu raio.\nInforme o raio em centimetros do circulo para saber sua área:  ");
        raio = input.nextDouble();

        area = pi * (raio * raio);

        System.out.printf("A área do circulo com o raio %2.2f cm é de %2.2f cm²", raio, area);

        
    }
    
}
