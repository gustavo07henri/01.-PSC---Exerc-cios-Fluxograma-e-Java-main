
package Ex06;

import java.util.Scanner;
    /**
     * Crie um algoritmo que leia a idade de uma 
     * pessoa e calcule quantos dias essa pessoa já viveu.
     */
public class Ex06 {


    public static void main(String[] args) {
        
        int idade, dias_vividos, ano = 365;
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("Me informe sua idade: ");
        idade = input.nextInt();
        
        dias_vividos = idade * 365;
        
        System.out.printf("Com sua idade você viveu %d dias.", dias_vividos);
       
       
    }
    
}
