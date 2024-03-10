
package Ex07;

import java.util.Scanner;
     /**
     * Crie um algoritmo que lê o salário de um funcionário, 
     * reajusta o salário em 7% e mostra o resultado.
     */
public class Ex07 {


    public static void main(String[] args) {
        // TODO code application logic here
        double salario, reajuste;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Me informe o seu sálario ");
        salario = input.nextFloat();
        
        reajuste = (float)salario * 1.07;
        
        System.out.println("Seu salario com reajuste é R$ "+reajuste);
    }
    
}
