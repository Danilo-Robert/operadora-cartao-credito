package com.danilo.operadora_cartao_credito.adapters.mapper;

import com.danilo.operadora_cartao_credito.adapters.in.dto.request.ClienteRequestDTO;
import com.danilo.operadora_cartao_credito.adapters.in.dto.response.ClienteResponseDTO;
import com.danilo.operadora_cartao_credito.adapters.out.entities.CartaoEntity;
import com.danilo.operadora_cartao_credito.adapters.out.entities.ClienteEntity;
import com.danilo.operadora_cartao_credito.application.domain.CartaoDomain;
import com.danilo.operadora_cartao_credito.application.domain.ClienteDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteEntity paraEntity(ClienteDomain clienteDomain);

    ClienteDomain paraDomain(ClienteEntity clienteEntity);

    @Mapping(target = "cartao", expression = "java(toCartaoDoamin(cliente))")
    ClienteDomain toDomain(ClienteRequestDTO cliente);

    ClienteResponseDTO toResponse(ClienteDomain cliente);

    @Mapping(source = "dataVencimentoFatura", target = "dataVencimentoFatura")
    CartaoDomain toCartaoDomain(ClienteRequestDTO clienteRequestDTO);
}
