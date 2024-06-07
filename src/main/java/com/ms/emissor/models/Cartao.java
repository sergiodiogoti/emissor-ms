package com.ms.emissor.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "cartao")
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDateTime dataHoraRegistro;

    @NotBlank
    @NotNull
    private String numeroCartao;

    @NotNull
    private BigDecimal limite;

    @NotNull
    private String nomeCliente;

    @NotNull
    private String email;

    @NotBlank
    @NotNull
    private String validade;

    @NotNull
    private Integer ccv;
}
