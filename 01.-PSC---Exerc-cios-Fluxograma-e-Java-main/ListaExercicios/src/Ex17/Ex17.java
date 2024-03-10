
package Ex17;

/*
 *Faça um programa para o seguinte problema: Compraram-se N canetas iguais,
 *que foram pagas com uma nota de Z reais, obtendo-se Y reais como troco. Quanto custou cada caneta? 
 */
import java.util.Scanner;
public class Ex17 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double numero_canetas, valor_pago, troco, valor_caneta;

        System.out.print("Quantas canetas foram adquiridas? ");
        numero_canetas = input.nextDouble();
        System.out.print("Qual nota foi utilizada para pagar? ");
        valor_pago = input.nextDouble();
        System.out.print("Qual foi o troco recebido? ");
        troco = input.nextDouble();

        valor_caneta = (valor_pago - troco) / numero_canetas;

        System.out.printf("O valor pago por cada caneta foi de R$ %2.2f.", valor_caneta);


        
    }
    
}
