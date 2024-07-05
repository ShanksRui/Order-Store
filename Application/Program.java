package Application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Order order = new Order();
		order.setMoment(LocalDateTime.now());
		
		System.out.println("Enter client data:");
		System.out.print("Name:");
		String clientname = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.print("Birth Date(DD/MM/YYYY):");
		String dateSdr = sc.nextLine();
		LocalDate date = LocalDate.parse(dateSdr,Order.f2);
	    Client client = new Client(clientname, email, date);
        order.setClient(client);
	
		System.out.println("Enter order data ");
		System.out.print("How many items to this  order:");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1 ;i <= n; i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name:");
			String name1 = sc.nextLine();
			System.out.print("Product price:");
			Double price = sc.nextDouble();
			sc.nextLine();
			System.out.print("Quantity:");
			int quantity = sc.nextInt();
			sc.nextLine();
			OrderItem orderitem = new OrderItem(quantity, new Product(name1, price));
			order.addItem(orderitem);    
		}
		System.out.print("Order Status:");
		String status = sc.next();
		order.setStatus(OrderStatus.valueOf(status));
		
		System.out.println();
		System.out.println("ORDER SUMARY:");
		System.out.println(order);
	   
	}


}
