package com.api.pagination.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pessoa {
    @Id
    private Long id;

    private String nome;

    private int idade;

    private String cpf;
}
