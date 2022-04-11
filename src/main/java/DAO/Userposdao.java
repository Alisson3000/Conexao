package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConexaoJdbc.SingleConnection;
import model.Userposjava;

public class Userposdao {
    
	private PreparedStatement st;
	private Connection conn ;
	
	public void UserPosDao() {
		conn = SingleConnection.getConnection();
	}
	
	public void salvar (Userposjava users ) {
		try {
		String sql = "insert into userposjava (id, nome, email)" 
				+"values (?,?,?)";
		
			    st = conn.prepareStatement(sql);
				st.setLong(1,users.getId());
				st.setString(2, users.getNome());
				st.setString(3, users.getEmail());
				st.execute();
				//st.close();
				conn.commit(); //salvar no banco
		}catch( Exception e) {
			
		
		e.printStackTrace();
		System.out.println(e.getMessage());
	
		}
	}
}
