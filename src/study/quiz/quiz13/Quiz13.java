package study.quiz.quiz13;

import org.json.simple.parser.ParseException;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		String jsonStr = OrderApiService.orderInfo(); // json 포맷 텍스트
		
		// 가공을 해서 >> parse (분석,분해,변환) (Integer.parseInt Double.parseDouble)
		
		try {
			CustomerDTO customerDTO = OrderApiService.orderInfo();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// DB 저장?
		OrderDAO orderDAO = new OrderDAO();
		
		// orderDAO 이거 저장해!
	}

}
