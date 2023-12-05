package com.tokiomarini.tokio.entity;

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

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Conta getOrigem() {
			return origem;
		}

		public void setOrigem(Conta origem) {
			this.origem = origem;
		}

		public Conta getDestino() {
			return destino;
		}

		public void setDestino(Conta destino) {
			this.destino = destino;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public LocalDateTime getDataAgendamento() {
			return dataAgendamento;
		}

		public void setDataAgendamento(LocalDateTime dataAgendamento) {
			this.dataAgendamento = dataAgendamento;
		}

	    // Getters e Setters
	    
}
