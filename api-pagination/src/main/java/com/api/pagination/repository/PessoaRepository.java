package com.api.pagination.repository;

import com.api.pagination.entity.Pessoa;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

    List<Pessoa> findAll(Pageable pageable);

}
