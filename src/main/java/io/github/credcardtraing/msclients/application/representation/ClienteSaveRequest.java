package io.github.credcardtraing.msclients.application.representation;

import io.github.credcardtraing.msclients.domain.Cliente;
import lombok.Data;

@Data
public class ClienteSaveRequest {
    private String cpf;
    private Integer idade;
    private String nome;

    public Cliente toModel(){
        return new Cliente(cpf,nome,idade);
    }
}
