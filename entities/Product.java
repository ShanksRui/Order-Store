package entities;

public class Product {

	private String name;
	private Double Pprice;
	
public Product() {
	}
	
public Product (String name, Double price) {
	this.name = name;
	this.Pprice = price;
}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(Double price) {
		this.Pprice = price;
	}
	public Double getPrice() {
		return Pprice;
	}
}
