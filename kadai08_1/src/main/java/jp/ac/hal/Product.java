package jp.ac.hal;

import java.io.Serializable;

public class Product implements Serializable{
	private String id;
	private String name;
	private String price;
	private int flags;
	public int getFlags() {
		return flags;
	}
	public void setFlags(int flags) {
		this.flags = flags;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Product() {}
	public Product(String id, String name, String price, int flags) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.flags = flags;
	}
	

}
