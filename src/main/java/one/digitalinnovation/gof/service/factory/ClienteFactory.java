package one.digitalinnovation.gof.service.factory;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;

public interface ClienteFactory {
    Cliente criar (String nome, Endereco endereco);
}
