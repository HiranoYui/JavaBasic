package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {


		Car car1=new Car();
		car1.color="赤";
		car1.gasoline=20;
		car1.run();


		Car car2=new Car();
		car2.color="白";
		car2.gasoline=15;
		car2.run();


		Car car3=new Car();
		car3.color="黒";
		car3.gasoline=30;
		car3.run();

		final int distance = 300;
		int runAlready = 0;


		while(distance>runAlready) {
			// hasiru
			int run = car1.run();
			runAlready=runAlready+run;

		if(run<0) {
			break;
		}
		}


		if(car1.gasoline<0) {
		System.out.println("目的地に到着できませんでした");

	}	else {
		int n=50-car1.gasoline;
		int x=car1.gasoline;

		System.out.println("目的地まで"+n+"時間かかりました。"+"残りのガソリンは"+x+"リットルです。");
	}

		while(distance>runAlready) {
			// hasiru
			int run = car2.run();
			runAlready=runAlready+run;

		if(run<0) {
			break;
		}
		}


		if(car2.gasoline<0) {
		System.out.println("目的地に到着できませんでした");

	}	else {
		int n=50-car2.gasoline;
		int x=car2.gasoline;

		System.out.println("目的地まで"+n+"時間かかりました。"+"残りのガソリンは"+x+"リットルです。");
	}
		while(distance>runAlready) {
			// hasiru
			int run = car3.run();
			runAlready=runAlready+run;

		if(run<0) {
			break;
		}
		}


		if(car3.gasoline<0) {
		System.out.println("目的地に到着できませんでした");

	}	else {
		int n=50-car3.gasoline;
		int x=car3.gasoline;

		System.out.println("目的地まで"+n+"時間かかりました。"+"残りのガソリンは"+x+"リットルです。");
		}


		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

	}
}
