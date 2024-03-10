
package Ex05;
import java.util.Scanner;
    /**
     * Crie um algoritmo que lê um valor real em dólar, 
     * e converte o valor para reais. 
     * Considere que a cotação é US$ 1 = R$ 4,95.
     */
public class Ex05 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double dolar = 4.95, dolar_entrada, real_final;
        
        System.out.println("Digite o valor em Dolar para converter em Reais:");
        dolar_entrada = input.nextDouble();
        
        real_final = dolar_entrada * dolar;
        
        System.out.printf("Convertendo sua quantia de dolar para Real você teria R$ "+ real_final);
           
    }
    
}
