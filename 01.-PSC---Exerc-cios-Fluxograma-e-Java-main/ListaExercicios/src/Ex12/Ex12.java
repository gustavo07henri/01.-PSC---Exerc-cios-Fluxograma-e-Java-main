/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex12;
import java.util.Scanner;
/*
 *Escreva um algoritmo para ler um valor e escrever o seu antecessor e o seu sucessor.
 */
public class Ex12 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numero, antecessor;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = input.nextInt();
        
        antecessor = numero - 1;

        System.out.printf("O antecessor de %d é %d.", numero, antecessor);
    }
    
}
