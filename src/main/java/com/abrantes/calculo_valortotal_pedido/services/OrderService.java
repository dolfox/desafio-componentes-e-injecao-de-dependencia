package com.abrantes.calculo_valortotal_pedido.services;

import org.springframework.stereotype.Service;

import com.abrantes.calculo_valortotal_pedido.entities.Order;

@Service
public class OrderService {

	private ShipingService shipingService;

	public OrderService(ShipingService shipingService) {
		this.shipingService = shipingService;
	}

	public double total(Order order) {
		
		double basicAmount = order.getBasic();
	    double discount = order.getDiscount();
	    double shippingCost = this.shipingService.shipment(order);

	    double discountAmount = basicAmount * discount / 100;
	    return basicAmount + shippingCost - discountAmount;
	}
}
