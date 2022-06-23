package br.com.magnasistemas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magnasistemas.dao.UserDao;
import br.com.magnasistemas.entity.UserEntity;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public UserEntity buscaUsuarioPorid(int id) {

		return userDao.findById(id);
	}

	public List<UserEntity> buscaTodosUsuarios() {

		return userDao.findAll();
	}

	public int deletar(int id) {

		return userDao.deleteById(id);
	}

	public int salvar(UserEntity user) {

		return userDao.save(user);
	}

	public int alterar(UserEntity user, int id) {
		return userDao.update(user, id);
	}
}
