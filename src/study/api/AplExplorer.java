package study.api;

import java.io.IOException;
import java.util.List;

public class AplExplorer {
	
		public static void main(String[] args) {
			
			List<ArplInfo> arplList;
			try {
				arplList = ArplApiService.forecastDustArplInfoList("2024-12-11");
				
				fir(arplInfo info : arplList) {
					System.out.println( info.toString() );
				}
			} catch (IOException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//ArplInfo 객체 -> DB 저장
			
			//ArplDAO
		}

}
