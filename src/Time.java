public class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
   void displayTime() {
        System.out.println(hour+":"+minute+":"+second);
    }
}
