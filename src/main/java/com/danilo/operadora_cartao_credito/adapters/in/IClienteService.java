package com.danilo.operadora_cartao_credito.adapters.in;

import com.danilo.operadora_cartao_credito.application.domain.ClienteDomain;

public interface IClienteService {

    ClienteDomain solicitarCartao(ClienteDomain cliente);

    ClienteDomain buscarPorCpf(String cpf);
}
