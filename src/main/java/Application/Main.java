package Application;

import java.util.Scanner;

import DAO.Userposdao;
import model.Userposjava;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
       Userposdao dao = new Userposdao();
		Userposjava user =  new Userposjava();
		
		/*
		Long id = sc.nextLong();
		String nome = sc.nextLine();
		String email = sc.nextLine();
		*/
		user.setId(6L);
		user.setNome("joao");
		user.setEmail("joao@hotmail.com");
		
	
		System.out.println(user.getNome());
		
		dao.salvar(user);
		
		
		sc.close();
	}

}
