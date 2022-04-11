package ConexaoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class SingleConnection {

	
	private static String url =  "jdbc:postgresql://localhost:5432/posjava";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection;;
	
	public static void conectar() {
		try {
			
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, user, password);
				System.out.println("Connect");


			
		}catch(Exception e){
			e.printStackTrace();
		}
		
}
	static {
		conectar();
	}
	public SingleConnection() {
		conectar();
	}
	public static Connection getConnection() {
		return connection;
	}
	
}
