package view;

import controller.ControllerPares;
import java.util.Scanner;

public class MainPares {

	public static void main(String[] args) {

		ControllerPares pares = new ControllerPares();
		Scanner scanner = new Scanner(System.in);

		int[] vetor = { 2, 6, 5, 8, 9 };
		int tamanho = vetor.length - 1;
		int res;

		res = pares.Pares(vetor, tamanho, 0);

		System.out.println("Quantidade de números pares:" + res);

	}

}
