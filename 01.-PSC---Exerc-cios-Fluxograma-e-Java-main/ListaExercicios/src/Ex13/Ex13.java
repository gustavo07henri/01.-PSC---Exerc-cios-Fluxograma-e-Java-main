/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13;
import java.util.Scanner;
/*
 *Escreva um programa que calcula o salário líquido de um funcionário. 
 *O programa deve solicitar o valor da hora de trabalho, o número 
 *de horas trabalhadas no mês e o percentual de desconto do INSS.
 */
public class Ex13{

    public static void main(String[] args) {
        double valor_hora, salario_liquido;
        int horas_trabalhadas;
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é o valor de sua hora de trabalho? ");
        valor_hora = input.nextDouble();
        System.out.print("Quantas horas você trabalha em um mês? ");
        horas_trabalhadas = input.nextInt();

        salario_liquido = (valor_hora * horas_trabalhadas) * 0.91 ;

        System.out.printf("Ganhando R$ %2.2f por hora, trabalhando %d horas por mês\n você receberá R$ %2.2f por mês com desconto do Inss.", valor_hora, horas_trabalhadas, salario_liquido);

    }
    
}
