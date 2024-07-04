	package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
     public static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	
	private LocalDateTime moment;
	private OrderStatus status;
	private OrderItem orderitem;
	private Client client;
	private Product product;
	
	List<OrderItem> items = new ArrayList<>();

	
	public Order (OrderStatus status) {
		this.status = status;
	}
	public Order(LocalDateTime moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	public LocalDateTime getMoment() {
		return moment;
	}
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;	
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public List<OrderItem> getItems() {
		return items;
	}
   public void addItem(OrderItem item){
	   items.add(item);
   }
   public void removeItem(OrderItem item) {
	   items.remove(item);
   } 
   public OrderItem getOrderitem() {
	return orderitem;
}
public void setOrderitem(OrderItem orderitem) {
	this.orderitem = orderitem;
	
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}

public void setClient(Client client) {
	this.client = client;
}
public Double total() {
	   double sum = 0;
	   for(OrderItem x :items) {
            sum += x.subTotal();  
   }return sum;
}

public String toString() {
   StringBuilder sb = new StringBuilder();
   sb.append("Order Momment: "+ moment.format(f1)+"\n");
   sb.append("Oder status: "+status+"\n");
   sb.append("Client: "+client+"\n");
   sb.append("Order Items:\n");
   for(OrderItem x: items) {
	   sb.append(x.getProduct().getName()+", "+String.format("%.2f",x.getProduct().getPrice())+
			   ", Quantity "+x.getQuantity()+",Subtotal: "+String.format("%.2f", x.subTotal()));
	   sb.append("\n");
        }
   sb.append(String.format("%.2f", total()));
return sb.toString();  
   }
   }	
	

