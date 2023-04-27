package drcode.gof.service;

import drcode.gof.model.Cliente;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
