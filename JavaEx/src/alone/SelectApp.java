package alone;

public class SelectApp {

	public static void main(String[] args) {
	 Select a = new Select();
	 Select b = new Select();
	 
	 a.setX(8);
	 a.setY(18);
	 
	 b.setX(5);
	 b.setY(18);
	 
	 
	 System.out.printf("%d월 %d일을 선택하셨습니다.%n", b.getX(), b.getY());
	 
	 a.selectDate();
	}

}
