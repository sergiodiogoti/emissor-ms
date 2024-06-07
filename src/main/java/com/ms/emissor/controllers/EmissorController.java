package com.ms.emissor.controllers;

import com.ms.emissor.dto.CartaoDTO;
import com.ms.emissor.service.EmailService;
import com.ms.emissor.service.EmissorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emissor")
public class EmissorController {

    @Autowired
    private EmailService emailService;

    @Autowired
    private EmissorService emissorService;

    @PostMapping
    public ResponseEntity<String> emitirCartao(@RequestBody @Valid CartaoDTO cartaoDTO) {
        emissorService.EmitirCartoes(cartaoDTO);
        return ResponseEntity.ok().build();
    }
}
