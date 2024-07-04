package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private Product product;	

    
       
	public OrderItem(Integer quantity,Product product) {
		this.quantity = quantity;
		this.setProduct(product);
	}
	public OrderItem(int quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double subTotal() {
		return (double)quantity * product.getPrice();
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
