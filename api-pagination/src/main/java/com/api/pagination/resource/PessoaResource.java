package com.api.pagination.resource;

import com.api.pagination.dto.ApiResponse;
import com.api.pagination.dto.PaginationResponseDTO;
import com.api.pagination.dto.PessoaDto;
import com.api.pagination.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/pessoa")
public class PessoaResource {

    private final PessoaService pessoaService;

    @GetMapping("/lista-todos")
    public ResponseEntity<ApiResponse<PessoaDto>> buscarPessoas(@RequestParam int pagina,
                                                                @RequestParam int itens){
        var body = pessoaService.findAll(pagina, itens);
        return ResponseEntity.ok(new ApiResponse<>(
                body.getContent(),
                PaginationResponseDTO.fromPage(body)
        ));
    }
}
