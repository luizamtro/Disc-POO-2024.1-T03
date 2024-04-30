package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		/*
		Quest�o 5. Crie um programa que receba os valores antigo e atual de um produto. Chame uma sub-rotina que 
		determine o percentual de acr�scimo entre esses valores. O resultado dever� ser mostrado no programa 
		principal.
		*/
		

	
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Digite o valor antigo do produto: ");
		        double antigo = scanner.nextDouble();
		        System.out.print("Digite o valor atual do produto: ");
		        double atual = scanner.nextDouble();
		        
		        double aumento = calcularAumento(antigo, atual);
		        
		        System.out.printf("O percentual de aumento �: %.2f%%\n", aumento);
		        
		        scanner.close();
		    }
		    
		    public static double calcularAumento(double antigo, double atual) {
		        double aumento = ((atual - antigo) / antigo) * 100;
		        return aumento;
		    }
		}
