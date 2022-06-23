package br.com.magnasistemas.dao;

import java.util.List;

import br.com.magnasistemas.entity.UserEntity;

public interface UserDao {

	public List<UserEntity> findAll();

	public UserEntity findById(int id);

	public int deleteById(int id);

	public int save(UserEntity user);

	public int update(UserEntity user, int id);

}
