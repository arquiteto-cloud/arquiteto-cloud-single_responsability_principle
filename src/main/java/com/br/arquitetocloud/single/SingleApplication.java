package com.br.arquitetocloud.single;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingleApplication.class, args);
		
		System.out.println("Início fluxo de Compra");
		
		Pedido pedido = new Pedido(); 		
		pedido.gerarNumeroPedido();
		Pagamento pagamento = new Pagamento();
		pagamento.validarPagamento();
		Estoque estoque = new Estoque();
		estoque.separarEstoque();
		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.emitirNotaFiscal();
				
		System.out.println("Início fluxo de Compra");
	}

}
