package one.digitalinnovation.gof.service.factory;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;

public class ClientePadraoFactory implements ClienteFactory{
    @Override
    public Cliente criar(String nome, Endereco endereco) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        return cliente;
    }
}
