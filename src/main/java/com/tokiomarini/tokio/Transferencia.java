package com.tokiomarini.tokio;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Transferencia {

	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    private Conta origem;

	    @ManyToOne
	    private Conta destino;

	    private double valor;

	    private LocalDateTime dataAgendamento;

	    // Getters e Setters
}
