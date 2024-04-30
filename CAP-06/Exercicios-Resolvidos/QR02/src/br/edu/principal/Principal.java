package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		/**
		 * Quest�o 2
		 * Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos.
		 * O vendedor recebe, mensalmente, sal�rio de R$ 545,00, acrescido de 5% do valor total de suas vendas.
		 * O valor unit�rio dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de 
		 * cada pe�a deve ficar em outro vetor, mas na mesma posi��o. Crie um programa que receba os pre�os 
		 * e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez). 
		 * Depois, determine e mostre:
		 * - um relat�rio contendo: quantidade vendida, valor unit�rio e valor total de cada objeto. Ao final, 
		 *   devere�o ser mostrados o valor geral das vendas e o valor da comiss�o que ser� paga ao vendedor; e
		 * - o valor do objeto mais vendido e sua posi��o no vetor (n�o se preocupe com empates).
		 */
		
		        Scanner scanner = new Scanner(System.in);

		        double[] precos = new double[10];
		        int[] quantidades = new int[10];

		        // Recebendo os pre�os e as quantidades vendidas
		        for (int i = 0; i < 10; i++) {
		            System.out.println("Informe o pre�o do objeto " + (i + 1) + ":");
		            precos[i] = scanner.nextDouble();

		            System.out.println("Informe a quantidade vendida do objeto " + (i + 1) + ":");
		            quantidades[i] = scanner.nextInt();
		        }

		        // Calculando o valor total de cada objeto e o valor total das vendas
		        double valorTotalVendas = 0;
		        for (int i = 0; i < 10; i++) {
		            double valorTotalObjeto = precos[i] * quantidades[i];
		            valorTotalVendas += valorTotalObjeto;

		            System.out.println("Relat�rio do objeto " + (i + 1) + ":");
		            System.out.println("Quantidade vendida: " + quantidades[i]);
		            System.out.println("Valor unit�rio: R$ " + precos[i]);
		            System.out.println("Valor total: R$ " + valorTotalObjeto);
		        }

		        // Calculando a comiss�o do vendedor (5% do valor total das vendas)
		        double comissao = valorTotalVendas * 0.05;

		        // Encontrando o objeto mais vendido e sua posi��o no vetor
		        int maisVendido = 0;
		        int posicaoMaisVendido = 0;
		        for (int i = 0; i < 10; i++) {
		            if (quantidades[i] > maisVendido) {
		                maisVendido = quantidades[i];
		                posicaoMaisVendido = i;
		            }
		        }

		        System.out.println("Valor geral das vendas: R$ " + valorTotalVendas);
		        System.out.println("Valor da comiss�o: R$ " + comissao);
		        System.out.println("Objeto mais vendido: Objeto " + (posicaoMaisVendido + 1) + " (Quantidade: " + maisVendido + ")");
		        
		        scanner.close();
		    }
		}


	
