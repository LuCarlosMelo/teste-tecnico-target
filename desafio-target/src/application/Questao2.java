package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int termos = 20;
		Integer a = 0;
		int b = 1;
		
		List<Integer> list = new ArrayList<>();
		
		
		System.out.println("Digite o numero desejado?");
		int x = sc.nextInt();
		
		for (int i = 1; i <= termos; i++) {
			int c = a + b;
			a = b;
			b = c;
			
			list.add(a);
		}
		
		if(	list.contains(x)) {
			System.out.println("O numero pertence a sequencia de Fibonacci");
		} else {
			System.out.println("O numero NAO pertence a sequencia de Fibonacci");
		}
		
		sc.close();
	}

}
