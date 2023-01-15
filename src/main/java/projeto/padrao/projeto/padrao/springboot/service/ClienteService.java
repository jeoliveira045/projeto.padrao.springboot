package projeto.padrao.projeto.padrao.springboot.service;

import projeto.padrao.projeto.padrao.springboot.entity.Cliente;

public interface ClienteService {
        Iterable<Cliente> buscarTodos();

        Cliente buscarPorId(Long id);

        void inserir(Cliente cliente);

        void atualizar(Long id, Cliente cliente);

        void deletar(Long id);
}
