<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("gjjvhjvjv", "Rati Ratiani", 123);
        book1.displayBookInfo();
        Book book2 = new Book("ssfdsfsfdf", "Jumber Tyabladze");
        book2.displayBookInfo();
        Rectangle rect1 = new Rectangle(10.0, 17.0);
        System.out.println("Perimeter: " + rect1.perimeter());
        System.out.println("Area: " + rect1.area());
        System.out.println("Diagonal: " + rect1.diagonal());
        System.out.println("Is Square?: " + rect1.isSquare());
        Rectangle rect2 = new Rectangle(5.0, 5.0);
        System.out.println("Is Square?: " + rect2.isSquare());
        Time time = new Time(24, 59, 59);
        time.displayTime();
=======
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Weatherforecast forecast = new Weatherforecast("Tbilisi", 15, 20, true);
        forecast.displayForecast();
        System.out.println("Recommended for a walk: " + forecast.recommendWalk());
        Student[] students = new Student[5];
        students[0] = new Student("jjxjx", "cnncnc", 20, 1, 3.8);
        students[1] = new Student("ndsnnf", "jdhdhd", 21, 3, 4.0);
        students[2] = new Student("dndndnd", "ndndndn", 22, 5, 3.5);
        students[3] = new Student("kkdjdjdj", "ndndnndnd", 20, 2, 3.9);
        students[4] = new Student("jjfhfhfh", "alalallala", 19, 1, 3.7);


        String topStudent = findTopStudent(students);
        System.out.println("Top Student: " + topStudent);
    }
    public static String findTopStudent(Student[] students) {
        double maxGpa = students[0].getGpa();
        String topStudentName = "";

        for (Student student : students) {
            if (student.getGpa() > maxGpa) {
                maxGpa = student.getGpa();
                topStudentName = student.getFirstName() + " " + student.getLastName();
            }
        }
        return topStudentName;

>>>>>>> d2425e0 (04.12.2024)
    }
}