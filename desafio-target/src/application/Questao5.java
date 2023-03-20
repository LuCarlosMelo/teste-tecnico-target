package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a palavra que deseja inverter: ");
		String palavra = sc.next();
		System.out.println("=====================================");

		String[] vetor = palavra.split("");

		List<String> list = new ArrayList<>();
		
		
		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.print(vetor[i]);
		}

		sc.close();
	}

}
