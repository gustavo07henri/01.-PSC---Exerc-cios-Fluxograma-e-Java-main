
package Ex03;

import java.util.Scanner;
     /*
     * Crie um algoritmo que leia o primeiro nome do 
     * usuário e escreva uma saudação para ele
     */
public class Ex03{


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
                
        String nome;

        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        System.out.printf("O seu nome é %s %d",nome);
        
    }
    
}
