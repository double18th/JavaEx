package alone;

public class DrinkApp {

	public static void main(String[] args) {
		Drink a = new Drink();	//  선언
		Drink b = new Drink();
		Drink c = new Drink();
		
		a.setMaker("투썸");
		a.setName("로얄 밀크티쉐이크");
		a.setPrice(6500);
		
		b.setMaker("스타벅스");
		b.setName("쿨라임 피지오");
		b.setPrice(5900);
		
		c.setMaker("흑화당");
		c.setName("곤약버블 자몽에이드");
		c.setPrice(4800);
		
		
		a.showInfo();
		
		System.out.printf("브랜드 : %s%n제품명 : %s%n가격 : %d원%n", 
				b.getMaker(), b.getName(), b.getPrice());
	}

}
