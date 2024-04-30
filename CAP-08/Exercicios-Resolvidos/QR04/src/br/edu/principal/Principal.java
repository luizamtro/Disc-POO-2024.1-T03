package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/*
		Quest�o 4. Fa�a uma sub-rotina que receba um �nico valor representando segundos. Essa sub-rotina dever� converter
		o valor de segundos para horas, minutos e segundos. Todas as vari�veis devem ser passadas como par�metro,
		n�o havendo vari�veis globais.
		*/
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite o valor em segundos: ");
		        int segundos = scanner.nextInt();
		        scanner.close();
		        
		        int[] tempo = converterSegundos(segundos);
		        System.out.println("Horas: " + tempo[0]);
		        System.out.println("Minutos: " + tempo[1]);
		        System.out.println("Segundos: " + tempo[2]);
		    }
		    
		    public static int[] converterSegundos(int segundos) {
		        int[] tempo = new int[3];
		        tempo[0] = segundos / 3600; // Horas
		        segundos %= 3600;
		        tempo[1] = segundos / 60; // Minutos
		        tempo[2] = segundos % 60; // Segundos
		        return tempo;
		    }
		}

