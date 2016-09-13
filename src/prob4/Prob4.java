package prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		/* 구현코드 */
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");

		int money = sc.nextInt();
		int[] won = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] sum = new int[10];
		for (int i = 0; i < 10; i++) {
			if (money >= won[i]) {
				sum[i] = money / won[i];
				money -= won[i] * sum[i];
			}
			else{
				sum[i]=0;	
			}
			System.out.println(won[i] + "원 : " + sum[i] + "개");
		}

		sc.close();
	}
}
