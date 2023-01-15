package projeto.padrao.projeto.padrao.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import projeto.padrao.projeto.padrao.springboot.entity.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}
