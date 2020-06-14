package com.vbsoft.project001.resourcer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vbsoft.project001.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping // Mostra que responde uma requisição do tipo get do http
	public ResponseEntity<User> findAll() {
		User u = new User(1L,"Maria","maria@gmail.com","999999","12345");
		return ResponseEntity.ok().body(u);
		
	}
	

}
