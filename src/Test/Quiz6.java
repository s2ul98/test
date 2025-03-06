package Test;

public class Quiz6 {
	public static void main(String[] args) {
		
		BollPen bollPen = new BollPen(3,"100% ","파랑");
		ManNyun manNyun = new ManNyun(3, "80%", " 몽블랑");
		
		System.out.println("볼펜의 굵기" + bollPen.gul +","+ "남은 양:" +bollPen.yang +","+ "볼펜의 색:" +bollPen.color) ;
		System.out.println("만년필의 굵기" + manNyun.gul +","+ "남은 양:" +manNyun.yang +","+ "브랜드:" +manNyun.brand);
	}

}
class Pen {
	int gul;
	String yang;
	public Pen(int gul, String yang) {
		this.gul = gul;
		this.yang = yang;
	}
	
	
}
class BollPen extends Pen{
	String color;

	public BollPen(int gul, String yang, String color) {
		super(gul, yang);
		this.color = color;
	}

	
}
class ManNyun extends Pen{
	String brand;

	public ManNyun(int gul, String yang, String brand) {
		super(gul, yang);
		this.brand = brand;
	}
	
	
}