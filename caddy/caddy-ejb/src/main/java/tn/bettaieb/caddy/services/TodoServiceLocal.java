package tn.bettaieb.caddy.services;

import java.util.List;

import javax.ejb.Local;

import tn.bettaieb.caddy.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
