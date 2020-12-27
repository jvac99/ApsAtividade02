package br.com.atv02.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Locacoes {
	private String codigoProduto;
	private int matriculaCliente;
	private LocalDate dataSaida;
	private LocalDate dataPrevistaEntrega;

	public Locacoes() {
		dataSaida = LocalDate.now();
		dataPrevistaEntrega = dataSaida.plusDays(2);
	}

	public Locacoes(String codigo, int matricula) {
		dataSaida = LocalDate.now();
		dataPrevistaEntrega = dataSaida.plusDays(2);
		matriculaCliente = matricula;
		codigoProduto = codigo;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public int getMatriculaCliente() {
		return matriculaCliente;
	}

	public LocalDate getDataSaida(){
		return dataSaida;
	}

	public LocalDate getDataPrevistaEntrega(){
		return dataPrevistaEntrega;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public void setMatriculaCliente(int matriculaCliente) {
		this.matriculaCliente = matriculaCliente;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Locacoes [codigoProduto=" + codigoProduto + ", matriculaCliente=" + matriculaCliente + ", dataSaida="
				+ dataSaida.format(formatter) + ", dataPrevistaEntrega=" + dataPrevistaEntrega.format(formatter) + "]";
	}

}
