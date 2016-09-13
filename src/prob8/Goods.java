package prob8;

import java.util.Scanner;

public class Goods {
	public static void main(String[] args) {
		// Goods[] goodsArray = new Goods[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String line = sc.nextLine();
			String []infos = line.split(" ");
			
			String name = infos[0];
			int prics = Integer.parseInt(infos[1]);
			int countStock = Integer.parseInt(infos[2]);
			
			System.out.println(name);
			System.out.println(prics);
			System.out.println(countStock);
		}
		sc.close();
	}
}
