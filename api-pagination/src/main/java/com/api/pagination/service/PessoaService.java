package com.api.pagination.service;

import com.api.pagination.entity.Pessoa;
import com.api.pagination.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public List<Pessoa> findAll(int pagina, int itens){
        return pessoaRepository.findAll(PageRequest.of(pagina, itens));
    }
}
