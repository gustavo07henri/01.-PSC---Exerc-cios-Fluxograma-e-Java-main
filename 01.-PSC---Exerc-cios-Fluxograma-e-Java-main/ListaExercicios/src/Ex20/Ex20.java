
package Ex20;

import java.util.Scanner;

/*
 * Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no 
 * valor das peças - o código da peça 1, valor unitário da peça 1, 
 * quantidade de peças 1 - o código da peça 2, valor unitário da peça 2,
 * quantidade de peças 2. O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
 */
public class Ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String codigo_1, codigo_2;
        double ipi, preco_1, preco_2, total_pagar, total_peca_1, total_peca_2;
        int quantidade_1, quantidade_2;

        System.out.print("Insira a porcentagem do IPI: ");
        ipi = input.nextDouble();
        System.out.print("Insira o código da primeira peça: ");
        codigo_1 = input.next();
        System.out.print("Insira a quantidade desta peça: ");
        quantidade_1 = input.nextInt();
        System.out.print("Insira o valor da mesma: ");
        preco_1 = input.nextDouble();

        System.out.print("Insira o código da segunda peça: ");
        codigo_2 = input.next();
        System.out.print("Insira a quantidade desta peça: ");
        quantidade_2 = input.nextInt();
        System.out.print("Insira o valor da mesma: ");
        preco_2 = input.nextDouble();

        total_peca_1 = (ipi/100 + 1) * (preco_1 * quantidade_1);
        total_peca_2 = (ipi/100 + 1) * (preco_2 * quantidade_2);
        total_pagar = total_peca_1 + total_peca_2;

        System.out.printf("%s: %d de peças a R$ %2.2f cada gera um total de R$ %2.2f já acrescido do IPI \n", codigo_1, quantidade_1, preco_1, total_peca_1);
        System.out.printf("%s: %d de peças a R$ %2.2f cada gera um total de R$ %2.2f já acrescido do IPI \n", codigo_2, quantidade_2, preco_2, total_peca_2);
        System.out.printf("O valor total a pagar pela compra dos dois tipos de peça será de R$ %2.2f já acrescido do IPI.", total_pagar);
    }
    
}
