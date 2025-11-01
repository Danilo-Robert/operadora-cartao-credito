package com.danilo.operadora_cartao_credito.adapters.in.dto.response;


public record ClienteResponseDTO(String nome,
                                 String email,
                                 Integer idade,
                                 String cpf,
                                 CartaoResponseDTO cartao){}



