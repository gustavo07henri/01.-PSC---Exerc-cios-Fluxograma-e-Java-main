/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15;
import java.util.Scanner;
/*
 *Construa um programa que calcule as raízes de uma equação de 2º grau (Ax²+Bx+C). 
 *Sendo que os valores A,B e C são fornecidos pelo usuário. Considere que tem duas raízes.
 */
public class Ex15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        double delta, x1, x2;

       
        System.out.println("Vamos resolver a equação (Ax²+Bx+C) em que você fornecera o valor de A, B e C.");
        System.out.print("Forneça um valor para A: ");
        a = input.nextInt();
        System.out.print("Forneça um valor para B: ");
        b = input.nextInt();
        System.out.print("Forneça um valor para C: ");
        c = input.nextInt();
        
        delta = (b*b)-4*a*c;
       
        //Este programa NaN para as raizes quando o valor do delta der negativo (Não existe raiz quadrada de número negativo)
        x1 = (-b + Math.sqrt(delta)) / (2*a);
        x2 = (-b - Math.sqrt(delta)) / (2*a);

        System.out.printf("Em raises da equação são para X1 %2.2f e para X2 %2.2f", x1, x2);
    }
    
}
