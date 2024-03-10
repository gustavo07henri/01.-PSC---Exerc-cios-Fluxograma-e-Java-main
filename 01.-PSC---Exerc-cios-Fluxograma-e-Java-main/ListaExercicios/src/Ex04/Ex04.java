/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

import java.util.Scanner;
/*
 *
 * @author aluno
 */
public class Ex04 {

    /**
     * Crie um algoritmo que solicite o nome, 
     * o endereço e o telefone do usuário e 
     * depois mostre os dados digitados.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String nome, endereco, telefone; 
        
        System.out.println("Informe o seu nome: ");
        nome = input.nextLine();
        System.out.println("Informe seu endereço: ");
        endereco = input.nextLine();
        System.out.println("Informe seu telefone: ");
        telefone = input.nextLine();
                
        System.out.printf("Olá %s você reside em %s e seu número é %s", nome, endereco, telefone);
        
        
    }
    
}
