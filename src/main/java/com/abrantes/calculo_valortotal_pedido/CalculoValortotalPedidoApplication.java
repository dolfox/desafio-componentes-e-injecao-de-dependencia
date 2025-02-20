package com.abrantes.calculo_valortotal_pedido;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abrantes.calculo_valortotal_pedido.entities.Order;
import com.abrantes.calculo_valortotal_pedido.services.OrderService;

@SpringBootApplication
public class CalculoValortotalPedidoApplication implements CommandLineRunner {

	private OrderService orderService;

	public CalculoValortotalPedidoApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(CalculoValortotalPedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("---------------------------");
		Order exemplo1 = new Order(1034, 150.0, 20.0);
		System.out.println("Pedido Codigo " + exemplo1.getCode());
		System.out.println("Valor total: R$ " + orderService.total(exemplo1));
		System.out.println("---------------------------");
		
		Order exemplo2 = new Order(2282, 800.0, 10.0);
		System.out.println("Pedido Codigo " + exemplo2.getCode());
		System.out.println("Valor total: R$ " + orderService.total(exemplo2));
		System.out.println("---------------------------");
		
		Order exemplo3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido Codigo " + exemplo3.getCode());
		System.out.println("Valor total: R$ " + orderService.total(exemplo3));
		System.out.println("---------------------------");
	}

}
