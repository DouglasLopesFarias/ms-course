package br.com.dgstecnologia.sli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dgstecnologia.sli.entities.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
