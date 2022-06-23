package br.com.magnasistemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magnasistemas.entity.UserEntity;
import br.com.magnasistemas.service.UserService;

@RestController
@RequestMapping("/springboot-rest-api-jdbc")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/user")
	public List<UserEntity> findAll() {
		return userService.buscaTodosUsuarios();
	}

	@GetMapping("/user/{id}")
	public UserEntity findById(@PathVariable int id) {
		return userService.buscaUsuarioPorid(id);
	}

	@PostMapping("/user")
	public String save(@RequestBody UserEntity user) {
		return userService.salvar(user) + " Usuario salvo com successo";
	}

	@DeleteMapping("/user/{id}")
	public String deleteById(@PathVariable int id) {
		return userService.deletar(id) + " Usuario deletado em banco de dados";
	}

	@PutMapping("/user/{id}")
	public String update(@RequestBody UserEntity user, @PathVariable int id) {
		return userService.alterar(user, id) + " Usuario atualizado com sucesso";
	}

}
