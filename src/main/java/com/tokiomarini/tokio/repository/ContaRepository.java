package com.tokiomarini.tokio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tokiomarini.tokio.entity.Conta;

public interface ContaRepository {

	public interface ContaRepository extends JpaRepository<Conta, Long> {
	    Optional<Conta> findByNumeroConta(String numeroConta);
	}
	
	
}
