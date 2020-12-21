package br.com.atv02.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.atv02.dao.Repositorios;
import br.com.atv02.model.Cliente;
import br.com.atv02.model.Gerente;

public class teste {

	public static void main(String[] args) {
		Repositorios repositorios=  new Repositorios();
		Gerente gerente = new Gerente(repositorios);
		gerente.adicionarCliente(new Cliente("a", 1, "endereco", 14 ,'s'));
		gerente.adicionarCliente(new Cliente("b", 2, "endereco", 2 ,'s'));
		//gerente.listarClientes();
		gerente.procurarCliente(2);
		LocalDate dataSaida = LocalDate.now();
		LocalDate dataPrevistaEntrega = dataSaida.plusDays(2);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dataPrevistaEntrega.format(formatter));
	}
}
