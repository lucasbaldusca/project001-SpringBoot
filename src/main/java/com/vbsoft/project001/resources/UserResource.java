package com.vbsoft.project001.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vbsoft.project001.entities.User;
import com.vbsoft.project001.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired // realiza a injeção de dependencia automatica
	private UserService service; // dependencia pra o service

	@GetMapping // Mostra que responde uma requisição do tipo get do http
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

	}

}