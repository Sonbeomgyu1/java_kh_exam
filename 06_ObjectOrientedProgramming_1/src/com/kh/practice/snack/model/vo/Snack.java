package com.kh.practice.snack.model.vo;

public class Snack {
	private String kind; //종류
	private String name; //이름
	private	String flavor; //맛
	private int numOf; //개수
	private int price; // 가격
	
	public Snack() { // 생성자
		
	}
	public Snack(String kind,String name,String flavor,
			int numOf,int price) {
		
	}
	
	@Override
	public String toString() {
		return "Snack [kind=" + kind + ", name=" + name + ", flavor=" + flavor + ", numOf=" + numOf + ", price=" + price
				+ "]";
	}
	
	public String information() {
		return kind+"("+name+" - "+flavor+") " +numOf+"개 "+price+"원";
	} //정보
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
	

