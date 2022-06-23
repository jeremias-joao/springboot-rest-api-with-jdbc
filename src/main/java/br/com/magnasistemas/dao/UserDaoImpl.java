package br.com.magnasistemas.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.magnasistemas.entity.UserEntity;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<UserEntity> findAll() {
		return jdbcTemplate.query("SELECT * FROM TB_USER", new BeanPropertyRowMapper<UserEntity>(UserEntity.class));
	}
	
	@Override
	public UserEntity findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM TB_USER WHERE id=?", new BeanPropertyRowMapper<UserEntity>(UserEntity.class), id);
	}

	@Override
	public int save(UserEntity user) {
		return jdbcTemplate.update("INSERT INTO TB_USER (nome, email, cidade, uf, dataNascimento) VALUES (?, ?, ?, ?, ?)", 
				new Object[] {user.getNome(), user.getEmail(), user.getCidade(), user.getUf(), user.getDataNascimento()});
	}
	@Override
	public int update(UserEntity user, int id) {
		return jdbcTemplate.update("UPDATE TB_USER SET nome = ?, email = ?, cidade = ?,  uf = ?, dataNascimento = ? WHERE id = ?", 
				new Object[] {user.getNome(), user.getEmail(), user.getCidade(), user.getUf(), user.getDataNascimento(), id});
	}
	
	@Override
	public int deleteById(int id) {
		return jdbcTemplate.update("DELETE FROM TB_USER WHERE id=?", id);
	}

}
