package Print;

public class Main {
    public static void main(String[] args) {
    System.out.print("print 함수와");
    System.out.println(" println 함수의");
    System.out.print("차이는");
    System.out.println(" print는 줄을 바꾸지 않고");
    System.out.print("println 함수는");
    System.out.println(" 줄을 바꾼다");

    System.out.printf("printf함수는");
    System.out.printf("\n백슬래시n 을 넣어야 줄이 바뀐다");

    int age = 31;
    double pi = 3.14159;
    String name = "sinjwu";
        System.out.printf("\nName: %s, Age: %d, pi: %2f", name, age, pi);
    }
}