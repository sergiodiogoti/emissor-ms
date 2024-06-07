package com.ms.emissor.service.impl;

import com.ms.emissor.dto.CartaoDTO;
import com.ms.emissor.models.Cartao;
import com.ms.emissor.repositories.EmissorRepository;
import com.ms.emissor.service.EmailService;
import com.ms.emissor.service.EmissorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmissorServiceImpl implements EmissorService {

    @Autowired
    private EmailService emailService;
    @Autowired
    private EmissorRepository emissorRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void EmitirCartoes(CartaoDTO cartaoDTO) {
        Cartao cartao = modelMapper.map(cartaoDTO, Cartao.class);
        cartao.setDataHoraRegistro(LocalDateTime.now());
        emissorRepository.save(cartao);

        if(cartao.getId() != null){
            emailService.enviarEmail(cartao);
        }
    }
}
