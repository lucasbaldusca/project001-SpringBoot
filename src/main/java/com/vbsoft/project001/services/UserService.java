package com.vbsoft.project001.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.vbsoft.project001.entities.User;
import com.vbsoft.project001.repositories.UserRepository;
import com.vbsoft.project001.services.exceptions.DatabaseException;
import com.vbsoft.project001.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id) );
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		try {
		repository.deleteById(id);
	} catch(EmptyResultDataAccessException e) {
		throw new ResourceNotFoundException(id);
	} catch(RuntimeException e) {
		throw new DatabaseException(e.getMessage());
	}
		
	}
	
	
	public User update(Long id, User obj) {
		try {
		User entity = repository.getOne(id); //prepara o entity para recebver os dados
		updateData(entity, obj); // atualiza os dados no entity baseado com o que chegou no obj
		return repository.save(entity);
		} catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
}
