/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

import java.util.Scanner;

/*
 *
 * @author aluno
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa que solicita ao usuário
        dois números e, em seguida, mostra a soma desses números.*/
        
        int numero1, numero2, soma;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        numero1 = input.nextInt();
        System.out.println("Digite outro número: ");
        numero2 = input.nextInt();
        
        soma = numero1 + numero2;
        
        System.out.println("A soma de"+ numero1+" + "+ numero2+" = "+ soma);
        
        
        
         
    }
    
}
