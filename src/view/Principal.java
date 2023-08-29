package view;

import quickSort.Quick_Sort;

public class Principal {

	public static void main(String[] args) {
		Quick_Sort pc = new Quick_Sort();
		int[] vetorex1 = {74,20,74,87,81,16,25,99,44,58};
		int tamanho1 = vetorex1.length;
		int[] vet1 = pc.QuickSort(vetorex1, 0, tamanho1 - 1);
		for(int i = 0; i < tamanho1; i++) {
			System.out.print(vet1[i] + " " );
		}
		System.out.println("");
		
		int[] vetorex2 = {44,43,42,41,40,39,38};
		int tamanho2 = vetorex2.length;
		int[] vet2 = pc.QuickSort(vetorex2, 0, tamanho2 - 1);
		for(int i = 0; i < tamanho2; i++) {
		System.out.print(vet2[i] + " " );
		}
		System.out.println("");
		
		int[] vetorex3 = {31,32,33,34,99,98,97,96};
		int tamanho3 = vetorex3.length;
		int[] vet3 = pc.QuickSort(vetorex3, 0, tamanho3 - 1);
		for(int i = 0; i < tamanho3; i++) {
			System.out.print(vet3[i] + " " );
	}
	}
}
