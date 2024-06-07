package com.ms.emissor.service;


import com.ms.emissor.dto.CartaoDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmissorService {

    void EmitirCartoes(CartaoDTO cartaoDTO);



}