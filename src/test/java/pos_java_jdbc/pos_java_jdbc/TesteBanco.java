package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import ConexaoJdbc.SingleConnection;
import DAO.Userposdao;
import model.Userposjava;

public class TesteBanco {

	@Test
	public void initBanco() {
		SingleConnection.getConnection();

		Userposdao dao = new Userposdao();
		Userposjava user = new Userposjava();

		user.setId(6L);
		user.setNome("joao");
		user.setEmail("joao@hotmail.com");

		dao.salvar(user);

	}
}
