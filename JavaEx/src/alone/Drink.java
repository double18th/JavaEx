package alone;

public class Drink {
	private String maker;
	private String name;
	private int price;
	
	
	//Getter와 Setter. Get은 return 값이 필요, Set은 인자가 필요
	// Getter
	public String getMaker() {
		return maker;
	}
	
	public String getName() {
		return name;
	}	
	
	public int getPrice() {
		return price;
	}
	
	
	// Setter
	public void setMaker(String maker) {
		this.maker = maker;
	}	
		
	public void setName(String name) {
		this.name = name;
	}
		
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
	System.out.println("브랜드 : " + maker);
	System.out.println("제품명 : " + name);
	System.out.printf("가격 : %d원%n", price);
	
	System.out.printf("*브랜드 : %s%n제품명 : %s%n가격 : %d원%n", 
			maker, name, price);
	}
	
	
}
