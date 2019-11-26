package alone;

public class Select {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void selectDate() {
		System.out.printf("%d월 %d일을 선택하셨습니다.%n", x, y);
	}
	
}
