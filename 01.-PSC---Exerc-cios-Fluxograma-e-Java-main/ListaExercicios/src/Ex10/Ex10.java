/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex10;

import java.util.Scanner;
/*
 *Faça um programa que converta a temperatura dada em Fahrenheit para Celsius.  \
 *Para testar se a sua resposta está correta saiba que 100ºC = 212F. Considere C/5 = (F-32)/9
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int graus_celcius, fahrenheit;

        System.out.print("Digite a temperatura em Fahrenheit para converter em Graus Celcius: ");
        fahrenheit = input.nextInt();


        graus_celcius = (fahrenheit - 32) * 5/9;
        System.out.printf("%d° fahrenheit é igual á %d° em Graus Celcius.", fahrenheit, graus_celcius);

    }
    
}
