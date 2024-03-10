/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex08;

import java.util.Scanner;

/*
*escreva um programa que converte uma quantidade de metros para centímetros.
*/
public class Ex08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float metros_entrada, centimetros_saida;

        System.out.print("Por favor digite a medida que você quér converter em centímetros: ");
        metros_entrada = input.nextFloat();

        centimetros_saida = 100 * metros_entrada;

        System.out.printf("%2.2f metros é igual a %2.2f centímetros", metros_entrada, centimetros_saida);

    }
     
}
