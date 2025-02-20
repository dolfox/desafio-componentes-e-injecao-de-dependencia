package com.abrantes.calculo_valortotal_pedido.services;

import org.springframework.stereotype.Service;

import com.abrantes.calculo_valortotal_pedido.entities.Order;

@Service
public class ShipingService {

	public double shipment(Order order) {

		double basic = order.getBasic();

		if (basic > 0 && basic <= 100) {
			return 20.0;
		} else if (basic > 100 && basic <= 200) {
			return 12.0;
		} else {
			return 0.0;
		}
	}
}
