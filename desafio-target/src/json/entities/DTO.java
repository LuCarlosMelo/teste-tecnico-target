package json.entities;

import java.math.BigDecimal;

public class DTO {

	private String dia;
	private BigDecimal valor;

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
