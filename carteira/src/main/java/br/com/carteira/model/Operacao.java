package br.com.carteira.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operacao")
public class Operacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ativo;
	private String tipo;
	private Calendar data;
	private BigDecimal valorUnitario;
	private int quantidade;
	
	public Operacao() {
	}
	
	public Operacao(String ativo, String tipo, Calendar data, BigDecimal valorUnitario, int quantidade) {
		this.ativo = ativo;
		this.tipo = tipo;
		this.data = data;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Operacao[id: " + this.getId() + " ativo: " + this.getAtivo() + " qtde: " + this.getQuantidade() + " " + this.getTipo() + " data: " + this.getData().getTime() + " valor unitário: " + this.getValorUnitario() + "]";
	}
	

}
