public class Main {
    public static void main(String[] args) {
        MyTime time = new MyTime(11, 59, 00);

        System.out.println("Time: " + time.toString());

        time.tickBySecond();
        System.out.println(time.toString());

        time.tickByMinute();
        System.out.println(time.toString());

        time.tickByHour();
        System.out.println(time.toString());


    }
}
