/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex14;

import java.util.Scanner;

/*
 *Desenvolva um programa que, dados dois valores A e B, 
 *troque os valores de forma que A passe a ter o valor de B e vice-versa. Exiba os valores após a troca.
 */
public class Ex14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a , b, c;

        System.out.print("Digite um número para atribuir a A: ");
        a = input.nextInt();
        System.out.print("Digite um número para atribuir a B: ");
        b = input.nextInt();

        System.out.printf("(A) vale %d e (B) vale %d.", a, b);
        c = a;
        a = b;
        b = c;
        System.out.printf("\nAgora (A) vale %d e (B) vale %d.",a ,b);
    }
    
}
