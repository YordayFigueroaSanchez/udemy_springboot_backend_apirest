package com.yfsanchez.springboot.backend.apirest.models.service;

import java.util.List;

import com.yfsanchez.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
}
