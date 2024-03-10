/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex11;
import java.util.Scanner;
/*
 *Crie um programa que calcula a média simples de três notas fornecidas pelo usuário.
 */
public class Ex11{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nota_1, nota_2, nota_3, media;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua nota na primeira matéria: ");
        nota_1 = input.nextInt();
        System.out.print("Digite sua nota na segunda matéria: ");
        nota_2 = input.nextInt();
        System.out.print("Digite sus nota na terceira matéria: ");
        nota_3 = input.nextInt();

        media = (nota_1 + nota_2 + nota_3)/3;

        System.out.printf("Sua média nas três matérias é %d",media);


    }
    
}
