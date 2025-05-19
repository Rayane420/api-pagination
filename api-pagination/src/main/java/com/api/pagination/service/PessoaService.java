package com.api.pagination.service;

import com.api.pagination.dto.PessoaDto;
import com.api.pagination.model.Pessoa;
import com.api.pagination.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    public Page<PessoaDto> findAll(int pagina, int itens){

        Page<Pessoa> pessoas = pessoaRepository.findAll(PageRequest.of(pagina, itens));
        return pessoas.map(pessoa -> modelMapper.map(pessoa, PessoaDto.class));
    }
}
