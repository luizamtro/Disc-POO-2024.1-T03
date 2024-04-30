package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		/*
		 Quest�o 3. Fa�a um programa contendo uma sub-rotina que receba tr�s n�meros inteiros a, b e c, sendo a maior 
		que 1. A sub-rotina dever� somar todos os inteiros entre b e c que sejam divis�veis por a (inclusive b e 
		c) e retornar o resultado para ser impresso.
		*/
		

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite o valor de a (maior que 1): ");
		        int a = scanner.nextInt();
		        System.out.print("Digite o valor de b: ");
		        int b = scanner.nextInt();
		        System.out.print("Digite o valor de c: ");
		        int c = scanner.nextInt();
		        
		        int soma = somarDivisiveisPorA(a, b, c);
		        System.out.println("A soma dos n�meros divis�veis por " + a + " entre " + b + " e " + c + " �: " + soma);
		        
		        scanner.close();
		    }
		    
		    public static int somarDivisiveisPorA(int a, int b, int c) {
		        int soma = 0;
		        for (int i = b; i <= c; i++) {
		            if (i % a == 0) {
		                soma += i;
		            }
		        }
		        return soma;
		    }
		}


	