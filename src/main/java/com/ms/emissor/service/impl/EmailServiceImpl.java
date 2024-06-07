package com.ms.emissor.service.impl;

import com.ms.emissor.models.Cartao;
import com.ms.emissor.service.EmailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    final JavaMailSender emailSender;

    public EmailServiceImpl( JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Value("${spring.mail.username}")
    private String emailFrom;

    public void enviarEmail(Cartao cartao) {
        try {
            String email = cartao.getEmail();
            String assunto = "Emissão de Cartão de Crédito Banco do Nordeste";
            String texto = String.format("Olá %s Parabéns,\n\nSeu cartão de crédito foi emitido com sucesso!\n\nNúmero do Cartão: %s\nLimite: %s",
                    cartao.getNomeCliente(), cartao.getNumeroCartao(), cartao.getLimite());

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(email);
            message.setSubject(assunto);
            message.setText(texto);
            emailSender.send(message);

        } catch (MailException e) {

        }
    }
}

