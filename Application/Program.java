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
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name:");
		String clientname = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.print("Birth Date(DD/MM/YYYY):");
		String dateSdr = sc.nextLine();
		LocalDate date = LocalDate.parse(dateSdr,f1);
	    Client client = new Client(clientname, email, date);

	
		System.out.println("Enter order data ");
		System.out.print("Status");
		String status = sc.next();
		System.out.print("How many items to this  order:");
		sc.nextLine();
		int n = sc.nextInt();
		Order order = new Order(OrderStatus.valueOf(status));
		sc.nextLine();
		order.setClient(client);
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
		LocalDateTime y = LocalDateTime.now();
		order.setMoment(y);
		
		System.out.println();
		System.out.println("ORDER SUMARY:");
		System.out.println(order);
	   
	}


}
