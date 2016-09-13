package prob8;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Goods[] goodsArray = new Goods[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String line = sc.nextLine();
			String[] infos = line.split(" ");
			
			goodsArray[i] = new Goods();

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
