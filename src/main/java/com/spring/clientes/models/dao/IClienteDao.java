package com.spring.clientes.models.dao;

import com.spring.clientes.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
