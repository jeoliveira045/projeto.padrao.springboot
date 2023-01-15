package projeto.padrao.projeto.padrao.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import projeto.padrao.projeto.padrao.springboot.entity.Cliente;


public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
