package com.tokiomarini.tokio.repository;

import java.awt.List;
import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tokiomarini.tokio.entity.Transferencia;

public interface TransferenciaRepository {
	
	public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
	    List<Transferencia> findByDataAgendamentoBeforeAndRealizadaIsNull(LocalDateTime data);
	}

}
