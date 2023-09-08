package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {
	Scanner sc = new Scanner(System.in);

	public Consola() {

	}

	public void imprimir(String txt) {
		System.out.println(txt);
	}

	public String leerString() {
		String a = sc.nextLine();
		return a;
	}
	public int leerInt() {
		int num = sc.nextInt();
		return num;
	}
}
