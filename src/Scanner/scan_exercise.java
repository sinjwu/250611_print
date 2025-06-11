package Scanner;

import java.util.Scanner;

public class scan_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        String Item = ""; //변수를 입력하고 default 과정 충족 시 ERROR 밑에 1 출력
                //입력한 값에 따른 조건문
        switch (choice) {
            case 1:
                Item = "메론소다";
                break;
            case 2:
                Item = "코카콜라";
                break;
            case 3:
                Item = "라무네";
                break;
            case 4:
                Item = "밀키스";
                break;
            case 5:
                Item = "맥콜";
                break;
            default:
                System.out.println("ERROR");
        }
        System.out.println(Item);
    }
}
