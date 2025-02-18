package controller;

public class ControllerPares {

	public int Pares(int[] vetor, int tamanho, int pares) {

		if (tamanho < 0) {

			return pares;
		}

		if (vetor[tamanho] % 2 == 0) {

			pares = pares + 1;

		}

		return Pares(vetor, tamanho - 1, pares);
	}

}