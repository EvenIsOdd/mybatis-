package com.sinosoft;

public class ChargeBank {
//	+-----------+--------------+------+-----+---------+----------------+
//	| Field     | Type         | Null | Key | Default | Extra          |
//	+-----------+--------------+------+-----+---------+----------------+
//	| no        | int(11)      | NO   | PRI | NULL    | auto_increment |
//	| capacity  | int(11)      | YES  |     | NULL    |                |
//	| price     | int(11)      | YES  |     | NULL    |                |
//	| usb       | varchar(20)  | YES  |     | NULL    |                |
//	| brand     | varchar(100) | YES  |     | NULL    |                |
//	| store     | varchar(100) | YES  |     | NULL    |                |
//	| length    | int(11)      | YES  |     | NULL    |                |
//	| width     | int(11)      | YES  |     | NULL    |                |
//	| thickness | int(11)      | YES  |     | NULL    |                |
//	| mass      | int(11)      | YES  |     | NULL    |                |
//	+-----------+--------------+------+-----+---------+----------------+
	private Integer no;
	private Integer capacity;
	private Integer price;
	private String usb;
	private String brand;
	private String store;
	private Integer length;
	private Integer width;
	private Integer thickness;
	private Integer mass;
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getUsb() {
		return usb;
	}
	public void setUsb(String usb) {
		this.usb = usb;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getThickness() {
		return thickness;
	}
	public void setThickness(Integer thickness) {
		this.thickness = thickness;
	}
	public Integer getMass() {
		return mass;
	}
	public void setMass(Integer mass) {
		this.mass = mass;
	}
	@Override
	public String toString() {
		return "ChargeBank [no=" + no + ", capacity=" + capacity + ", price=" + price + ", usb=" + usb + ", brand="
				+ brand + ", store=" + store + ", length=" + length + ", width=" + width + ", thickness=" + thickness
				+ ", mass=" + mass + "]";
	}

}
