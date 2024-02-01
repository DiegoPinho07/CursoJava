package entidades;

import java.util.Date;

import entidades.enums.OrderStatus;

public class Programa {

	public static void main(String[] args) {
		
	 Pedidos pedidos = new Pedidos(1000, new Date(), OrderStatus.DELIVERED);
		
		System.out.println(pedidos);
		
		OrderStatus os1 = OrderStatus.SHIPPED;
		OrderStatus os2 = OrderStatus.valueOf("SHIPPED");
		
		System.out.println(os1);
		System.out.println(os2);

				
	}

}
