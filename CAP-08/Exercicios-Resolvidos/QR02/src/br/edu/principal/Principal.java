package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		/*
		 Quest�o 2. Fa�a um programa contendo uma sub-rotina que receba dois n�meros positivos por par�metro e retorne 
		a soma dos N n�meros inteiros existentes entre eles.
		*/
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite o primeiro n�mero positivo: ");
		        int num1 = scanner.nextInt();
		        System.out.print("Digite o segundo n�mero positivo: ");
		        int num2 = scanner.nextInt();
		        
		        int soma = calcularSomaEntreNumeros(num1, num2);
		        System.out.println("A soma dos n�meros inteiros entre " + num1 + " e " + num2 + " �: " + soma);
		        
		        scanner.close();
		    }
		    
		    public static int calcularSomaEntreNumeros(int num1, int num2) {
		        int soma = 0;
		        for (int i = num1 + 1; i < num2; i++) {
		            soma += i;
		        }
		        return soma;
		    }
		}


	
