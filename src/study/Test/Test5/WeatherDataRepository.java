package study.Test.Test5;

import java.sql.*;
import java.util.List;

public class WeatherDataRepository {

    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl"; // Update with your database URL
    private static final String DB_USER = "scott"; // Database username
    private static final String DB_PASSWORD = "tiger"; // Database password

    // DB에 데이터를 저장하는 메서드
    public void saveWeatherData(List<WeatherData> weatherDataList) {
        // Connect to the database
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String insertSQL = "INSERT INTO weather_data (baseDate, baseTime, category, obsrValue, nx, ny, categoryCode, publishDate, publishTime, resultCode, resultMsg, totalCount, numOfRows, pageNo, dataType) "
                               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement statement = connection.prepareStatement(insertSQL)) {
                for (WeatherData data : weatherDataList) {
                    statement.setString(1, data.getBaseDate());
                    statement.setString(2, data.getBaseTime());
                    statement.setString(3, data.getCategory());
                    statement.setString(4, data.getObsrValue());
                    statement.setInt(5, data.getNx());
                    statement.setInt(6, data.getNy());
                    statement.setString(7, data.getCategoryCode());
                    statement.setString(8, data.getPublishDate());
                    statement.setString(9, data.getPublishTime());
                    statement.setString(10, data.getResultCode());
                    statement.setString(11, data.getResultMsg());
                    statement.setInt(12, data.getTotalCount());
                    statement.setInt(13, data.getNumOfRows());
                    statement.setInt(14, data.getPageNo());
                    statement.setString(15, data.getDataType());
                    
                    // Execute the insert query
                    statement.executeUpdate();
                    System.out.println("Saved weather data: " + data);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
