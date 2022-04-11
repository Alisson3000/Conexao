package pos_java_jdbc.pos_java_jdbc;

import java.util.Scanner;

import model.Userposjava;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		Userposjava user =  new Userposjava();
		try {
			System.out.println("id");
		Long id = sc.nextLong();
		String nome = sc.nextLine();
		String email = sc.nextLine();
		
		user.setId(id);
		user.setNome(nome);
		user.getEmail();
		}catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
