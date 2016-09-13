package prob8;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Goods[] goodsArray = new Goods[3];//배열 공간만 생성(객체 생성은 안돼있음)
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String line = sc.nextLine();
			String[] infos = line.split(" ");
			
			goodsArray[i] = new Goods();//객체 선언을 따로 해줘어야 함.

			goodsArray[i].setName(infos[0]);
			goodsArray[i].setPrices(infos[1]);
			goodsArray[i].setCountStock(infos[2]);

		}
		for (int i = 0; i < 3; i++) {
			System.out.println(goodsArray[i].getName() + "(가격:" + 
							   goodsArray[i].getPrices() + "원)이 " + 
							   goodsArray[i].getCountStock() + "개 입고 되었습니다.");
		}
		sc.close();

	}
}
