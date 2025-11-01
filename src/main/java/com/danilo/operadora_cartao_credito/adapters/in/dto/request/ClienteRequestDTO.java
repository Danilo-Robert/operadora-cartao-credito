package com.danilo.operadora_cartao_credito.adapters.in.dto.request;


public record ClienteRequestDTO (String nome,
                              String email,
                              Integer idade,
                              String cpf,
                              EnderecoRequestDTO endereco,
                              double rendaMensal,
                              String dataVencimentoFatura){}



