package com.tokiomarini.tokio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Conta {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String numeroConta;
	    private double saldo;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(String numeroConta) {
			this.numeroConta = numeroConta;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
	    // Getters e Setters
	}



