package net.codejava.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import net.codejava.spring.model.Login;

@Repository
public class LoginDAO {
		
	private JdbcTemplate jdbcTemplate; 
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Login recuperaLogin(String usuario) {
		String sql = "SELECT * FROM login WHERE usuario = ?";
		
		try {
			return jdbcTemplate.queryForObject(sql, new RowMapper<Login>() {
				
				@Override
				public Login mapRow (ResultSet rs, int index) throws SQLException {
					
						Login login = new Login ();
						
						login.setUsuario(rs.getString(1));
						login.setSenha(rs.getString(2));
						
						return login;
				}
				
			}, usuario);
		}
		catch(Exception e) {
			
			return new Login();
		}
	}
}
	
