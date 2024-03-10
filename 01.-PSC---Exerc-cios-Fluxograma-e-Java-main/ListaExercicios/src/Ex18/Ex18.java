
package Ex18;

/*
  Cada degrau de uma escada tem X de altura. Faça um programa que receba essa altura e
  a altura que o usuário deseja alcançar subindo a escada,
  calcule e mostre quantos degraus ele deverá subir para atingir seu objetivo,
  sem se preocupar com a altura do usuário. Todas as medidas fornecidas devem estar em metros.
 */

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double altura_degrau, altura_desejada, degrau_necessarios;

        System.out.print("Qual a altura de cada degrau em metros? ");
        altura_degrau = input.nextDouble();
        System.out.print("Qual a altura que deseja alcançar em metros? ");
        altura_desejada = input.nextDouble();

        degrau_necessarios = (int) (altura_desejada / altura_degrau);

        System.out.printf("Você devera subir %2.2f degraus para atingir seu objetivo.", degrau_necessarios);

        
    }
    
}
