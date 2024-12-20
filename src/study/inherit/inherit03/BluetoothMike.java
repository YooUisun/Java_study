package study.inherit.inherit03;

public class BluetoothMike extends Mike {
		
		boolean isConnect;
		
		//부모클래스 생성자 super();
		
		public void connect() {
			
		}
		
		public int volumeUp(String s) {
			System.out.println("String 매개변수 있는 볼륨 업");
			return 0;
		}
		
		//super 안 쓰고 volumeUp 만 쓰면 재귀함수 오류남.
		public void volumeUp() {
//			super.volumeUp(); 부모 클래스 함수 호출 
			System.out.println("BluetoothMike 볼륨 업 재정의");
		}

		public String toString() {
			String s= "나는 BluetoothMike 입니다.";
			return s;
		}
		//무선 마이크 속성
		//무선 마이크 기능
		
//		Mike 부모클래스에 이미 로직함
//		String type;
//		String model;
//		int price;
//		
//		public void check() {
//			//추가
//		}
//		
//		public void volumUp() {
//			//추가로직
//			//추가로직 222
//			//추가로직 333
//		}
//		
//		//...다른 각종 기능
//		//...다른 각종 기능
}
