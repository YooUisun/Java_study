package study.Test.Test5;

public class WeatherData {
    private String baseDate;
    private String baseTime;
    private String category;
    private String obsrValue;
    private int nx;
    private int ny;
    private String categoryCode;
    private String publishDate;
    private String publishTime;
    private String resultCode;
    private String resultMsg;
    private int totalCount;
    private int numOfRows;
    private int pageNo;
    private String dataType;

    // Getter and Setter methods

    public String getBaseDate() {
        return baseDate;
    }

    public void setBaseDate(String baseDate) {
        this.baseDate = baseDate;
    }

    public String getBaseTime() {
        return baseTime;
    }

    public void setBaseTime(String baseTime) {
        this.baseTime = baseTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getObsrValue() {
        return obsrValue;
    }

    public void setObsrValue(String obsrValue) {
        this.obsrValue = obsrValue;
    }

    public int getNx() {
        return nx;
    }

    public void setNx(int nx) {
        this.nx = nx;
    }

    public int getNy() {
        return ny;
    }

    public void setNy(int ny) {
        this.ny = ny;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(int numOfRows) {
        this.numOfRows = numOfRows;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "baseDate='" + baseDate + '\'' +
                ", baseTime='" + baseTime + '\'' +
                ", category='" + category + '\'' +
                ", obsrValue='" + obsrValue + '\'' +
                ", nx=" + nx +
                ", ny=" + ny +
                ", categoryCode='" + categoryCode + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", resultCode='" + resultCode + '\'' +
                ", resultMsg='" + resultMsg + '\'' +
                ", totalCount=" + totalCount +
                ", numOfRows=" + numOfRows +
                ", pageNo=" + pageNo +
                ", dataType='" + dataType + '\'' +
                '}';
    }
}
