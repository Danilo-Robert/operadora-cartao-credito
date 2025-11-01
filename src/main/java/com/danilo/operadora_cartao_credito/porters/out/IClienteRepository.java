package com.danilo.operadora_cartao_credito.porters.out;

import com.danilo.operadora_cartao_credito.application.domain.CartaoDomain;
import com.danilo.operadora_cartao_credito.application.domain.ClienteDomain;

import java.util.Optional;

public interface IClienteRepository {

    ClienteDomain salvar(ClienteDomain clienteDomain);

    Boolean buscarUsuarioPorEmail(String email);

    Optional<ClienteDomain> buscarUsuarioPorCpf(String cpf);

    CartaoDomain buscaCartao(CartaoDomain cartaoDomain);
}