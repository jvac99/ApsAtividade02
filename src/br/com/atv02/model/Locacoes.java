package br.com.atv02.model;

import java.util.Calendar;
import java.util.Date;

public class Locacoes {
	private String codigoProduto;
	private int matriculaCliente;
	private Date dataSaida;
	private Date dataPrevistaEntrega;

	public Locacoes() {
		dataSaida = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataSaida);
		calendar.add(Calendar.DAY_OF_MONTH, 2);
		dataPrevistaEntrega = calendar.getTime();
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public int getMatriculaCliente() {
		return matriculaCliente;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public void setMatriculaCliente(int matriculaCliente) {
		this.matriculaCliente = matriculaCliente;
	}

	@Override
	public String toString() {
		return "Locacoes [codigoProduto=" + codigoProduto + ", matriculaCliente=" + matriculaCliente + ", dataSaida="
				+ dataSaida + ", dataPrevistaEntrega=" + dataPrevistaEntrega + "]";
	}
	
}
