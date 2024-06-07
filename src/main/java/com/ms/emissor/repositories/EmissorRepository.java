package com.ms.emissor.repositories;

import com.ms.emissor.models.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmissorRepository extends JpaRepository<Cartao, Long> {
}
