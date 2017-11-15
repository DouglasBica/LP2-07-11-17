package Calculadora;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;

public class CalculadoraEntity {
	@Id
	@Column(name = "expressao")
	
	//@GeneratedValue
	//valor auto gerado
	
	protected String expressao;

	@Column(name = "valor")
	protected double valor;

	@Column(name = "criado_em")
	protected Date criadoEm;

	public String getExpressao() {
		return expressao;
	}

	public void setExpressao(String expressao) {
		this.expressao = expressao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
}
