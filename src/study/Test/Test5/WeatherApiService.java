package study.Test.Test5;

import java.util.ArrayList;
import java.util.List;

public class WeatherApiService {

    // API 호출 메서드 (날짜와 시간 파라미터를 받아서 요청)
    public String getWeatherData(String baseDate, String baseTime) {
        String apiKey = "your_api_key"; // 실제 API 키로 교체
        
        String apiUrl = "https://api.weather.com/v3/weather/conditions?baseDate=" + baseDate + "&baseTime=" + baseTime + "&apikey=" + apiKey;
        
        // 실제 API 호출 및 데이터를 반환하는 부분은 생략
        return "{\"response\":{\"header\":{\"resultCode\":\"00\",\"resultMsg\":\"NORMAL_SERVICE\"},\"body\":{\"totalCount\":2,\"numOfRows\":10,\"pageNo\":1,\"items\":{\"item\":[{\"baseDate\":\"" 
            + baseDate + "\",\"baseTime\":\"" + baseTime + "\",\"category\":\"TMP\",\"obsrValue\":\"5\",\"nx\":55,\"ny\":127,\"categoryCode\":\"01\",\"publishDate\":\"2025-01-06\",\"publishTime\":\"0600\"},{\"baseDate\":\"" 
            + baseDate + "\",\"baseTime\":\"" + baseTime + "\",\"category\":\"PTY\",\"obsrValue\":\"0\",\"nx\":55,\"ny\":127,\"categoryCode\":\"02\",\"publishDate\":\"2025-01-06\",\"publishTime\":\"0600\"}]}}}";
    }

    // JSON 데이터를 직접 파싱하여 WeatherData 객체의 List 반환
    public List<WeatherData> parseWeatherData(String jsonData) {
        List<WeatherData> weatherDataList = new ArrayList<>();

        try {
            // 간단한 파싱 로직: JSON의 "item" 부분을 찾아서 각 데이터 추출
            String bodyData = jsonData.split("\"body\":\\{")[1].split("\"items\":")[1].split("\\]}}}")[0];
            String[] items = bodyData.split("\\},\\{");

            for (String itemData : items) {
                WeatherData weatherData = new WeatherData();

                // 각 필드 추출 (정규 표현식을 사용하여 파싱)
                weatherData.setBaseDate(extractValue(itemData, "baseDate"));
                weatherData.setBaseTime(extractValue(itemData, "baseTime"));
                weatherData.setCategory(extractValue(itemData, "category"));
                weatherData.setObsrValue(extractValue(itemData, "obsrValue"));
                
                // 숫자 값이 비어있는 경우 0으로 설정 (빈 문자열 방지)
                String nxValue = extractValue(itemData, "nx");
                String nyValue = extractValue(itemData, "ny");
                weatherData.setNx(isValidInteger(nxValue) ? Integer.parseInt(nxValue) : 0);
                weatherData.setNy(isValidInteger(nyValue) ? Integer.parseInt(nyValue) : 0);

                weatherData.setCategoryCode(extractValue(itemData, "categoryCode"));
                weatherData.setPublishDate(extractValue(itemData, "publishDate"));
                weatherData.setPublishTime(extractValue(itemData, "publishTime"));

                // 결과 코드 및 메시지 등
                weatherData.setResultCode(extractValue(jsonData, "resultCode"));
                weatherData.setResultMsg(extractValue(jsonData, "resultMsg"));
                
                // 추가적인 정보
                weatherData.setTotalCount(isValidInteger(extractValue(jsonData, "totalCount")) ? Integer.parseInt(extractValue(jsonData, "totalCount")) : 0);
                weatherData.setNumOfRows(isValidInteger(extractValue(jsonData, "numOfRows")) ? Integer.parseInt(extractValue(jsonData, "numOfRows")) : 0);
                weatherData.setPageNo(isValidInteger(extractValue(jsonData, "pageNo")) ? Integer.parseInt(extractValue(jsonData, "pageNo")) : 0);
                weatherData.setDataType("JSON");

                weatherDataList.add(weatherData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return weatherDataList;
    }

    private String extractValue(String data, String key) {
        String pattern = "\"" + key + "\":\"([^\"]+)\"";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
        java.util.regex.Matcher m = r.matcher(data);
        if (m.find()) {
            return m.group(1);
        }
        return ""; // 빈 문자열 반환
    }

    private boolean isValidInteger(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
} // Added closing brace for the class
