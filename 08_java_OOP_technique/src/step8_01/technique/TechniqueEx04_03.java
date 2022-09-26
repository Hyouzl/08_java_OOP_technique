package step8_01.technique;

/*
 * 
 * # 생성자 오버로딩
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * 
 * */

class GoodsVO {
	
	String goodsCode;
	String goodsName;
	int goodsPrice;
	
	
	//생성자 오버로딩
	GoodsVO() {
		this.goodsCode = "없음";
		this.goodsName = "없음";
		this.goodsPrice = -1;
	}
	
	//생성자 오버로딩
	GoodsVO (String goodsCode) {
		this.goodsCode = "없음";
		this.goodsName = "없음";
		this.goodsPrice = -1;
	}
	
	
	//생성자 오버로딩
	GoodsVO (String goodsCode, String goodsName) {
		this.goodsCode = "없음";
		this.goodsName = "없음";
		this.goodsPrice = -1;
	}
	
	//생성자 오버로딩
	GoodsVO (String goodsCode, String goodsName, int goodsPrice) {
		this.goodsCode = "없음";
		this.goodsName = "없음";
		this.goodsPrice = -1;
	}
	

	void printData() {
		System.out.println(this.goodsCode + " / " + this.goodsName + " / " + this.goodsPrice);
	}
	
	
}


public class TechniqueEx04_03 {
	
	public static void main(String[] args) {
		
		new GoodsVO().printData();
		new GoodsVO("0x001" , "기계식 키보드").printData();
	}

}
