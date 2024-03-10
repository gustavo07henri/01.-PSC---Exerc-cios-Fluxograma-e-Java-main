/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex16;
import java.util.Scanner;
/*
 * Faça um programa que receba de entrada a distância total (em km) percorrida por um 
 * automóvel e a quantidade de combustível (em litros) consumida para percorrê-la, 
 * calcule e imprima o consumo médio de combustível. Fórmula: distância/litro.
 */
public class Ex16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distancia, combustivel, consumo;

        System.out.print("Digite a distancia em Km que percorreu com seu carro: ");
        distancia = input.nextDouble();
        System.out.print("Digite a quantidade de litros de combustivel gasta para percorrer essa distancia: ");
        combustivel = input.nextDouble();

        consumo = distancia / combustivel;

        System.out.printf("Percorrendo %1.2f Km consumindo %1.2f litros de cobustivel você tera um consumo médio de %.2f Km/l.", distancia, combustivel, consumo);

    }
}
