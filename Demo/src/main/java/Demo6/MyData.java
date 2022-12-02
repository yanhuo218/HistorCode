package Demo6;

public class MyData {
    private String year;
    private String month;
    private String day;

    public MyData() {
    }

    public MyData(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || o.getClass() != this.getClass()){
            return  false;
        }
        MyData data = (MyData) o;
        if (year == data.year && month == data.month && day == data.day){
            return true;
        }
        return false;
    }
}
