public class Date {
    private int month;
    private int day;
    private int year;

    public Date(){

    }

    public Date(int year){
        this.year = year;
    }

    public Date(int month, int year){
        this.year = year;
        this.month = month;
    }

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return String.format("Date: %d/%d/%d", getMonth(), getDay(), getYear());
    }
}
