package com.devsuperior.desafio01;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Exemplo 01:
		exibeSaidaExemplo(1034,150.0,20.0);

		//Exemplo 02:
		exibeSaidaExemplo(2282,800.0,10.0);

		//Exemplo 03:
		exibeSaidaExemplo(1309,95.90,0.0);
	}

	private void exibeSaidaExemplo(Integer code, Double basic, Double discount) {
		Order order = new Order(code, basic, discount);
		System.out.println("\n\nPedido código " + order.getCode()
				+ "\nValor Total: R$ "
				+  String.format("%.2f", orderService.total(order))
				+ "\n\n");
	}
}
