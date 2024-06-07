package com.ms.emissor.service;

import com.ms.emissor.dto.CartaoDTO;
import com.ms.emissor.models.Cartao;

public interface EmailService {
    void enviarEmail(Cartao cartao);
}
