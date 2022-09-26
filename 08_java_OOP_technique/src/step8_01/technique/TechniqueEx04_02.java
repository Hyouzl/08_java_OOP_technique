package step8_01.technique;

//생성자를 이용한 멤버변수 초기화

class GoodDto {
	String goodsCode;
	String goodsName;
	int goodsPrice;
	
	
	// 생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields..
	public GoodDto(String goodsCode, String goodsName, int goodsPrice) {
		super();
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}
	
	
//	void setData(String goodsCode, String goodsName, int goodsPrice) {
//		this.goodsCode = goodsCode;
//		this.goodsName = goodsName;
//		this.goodsPrice = goodsPrice;
//	}
	

	void printData() {
		System.out.println(this.goodsCode + " / " + this.goodsName + " / " + this.goodsPrice);
	}
 	

}

public class TechniqueEx04_02 {

	public static void main(String[] args) {

		GoodDto g1 = new GoodDto("0x001", "맨투맨", 4000);
		GoodDto g2 = new GoodDto("0x001", "조거팬츠", 5000);
		GoodDto g3 = new GoodDto("0x001", "바람막이", 7000);
		
		g1.printData();
		g2.printData();
		g3.printData();
		
	}
	
	
}
