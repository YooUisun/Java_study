package study.Test.Test5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // WeatherApiService 객체 생성
        WeatherApiService weatherApiService = new WeatherApiService();
        
        // API에서 데이터 가져오기
        String baseDate = "2025-01-06";
        String baseTime = "0600";
        String jsonData = weatherApiService.getWeatherData(baseDate, baseTime);
        
        // JSON 데이터를 파싱하여 WeatherData 객체 리스트 반환
        List<WeatherData> weatherDataList = weatherApiService.parseWeatherData(jsonData);
        
        // 파싱된 데이터를 출력
        if (weatherDataList.isEmpty()) {
            System.out.println("No weather data available after parsing.");
        } else {
            for (WeatherData weatherData : weatherDataList) {
                System.out.println(weatherData);
            }
        }
    }
}
