/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02;

import java.util.Scanner;

/*
 *
 * @author aluno
 */
public class Ex02 {

    /**
     * Crie um algoritmo que lê dois números,
     * X e Y, e mostra o resto da divisão entre eles.
     */
    public static void main(String[] args) {
        
        int numero1, numero2, resto;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        numero1 = input.nextInt();
        System.out.println("Digite outro número: ");
        numero2 = input.nextInt();
        
        resto = numero1 % numero2;
        
        System.out.printf("O resto da divisão de %d por %d é %d", numero1, numero2, resto);
               
                
        
    }
    
}
