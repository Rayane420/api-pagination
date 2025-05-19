package com.api.pagination.entity;

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
}
