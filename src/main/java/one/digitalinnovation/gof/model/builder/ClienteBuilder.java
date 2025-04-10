package one.digitalinnovation.gof.model.builder;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;

public class ClienteBuilder {
    private final Cliente cliente;

    public ClienteBuilder() {
        cliente = new Cliente();
    }

    public ClienteBuilder comNome(String nome) {
        cliente.setNome(nome);
        return this;
    }

    public ClienteBuilder comEndereco(Endereco endereco) {
        cliente.setEndereco(endereco);
        return this;
    }

    public Cliente build() {
        return cliente;
    }
}
