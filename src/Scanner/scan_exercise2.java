package Scanner;

import java.util.Scanner;

public class scan_exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 자판기 메뉴 ===");
        System.out.println("1. 닥터페퍼 (1800원)");
        System.out.println("2. 코카콜라 (2400원)");
        System.out.println("3. 칠성사이다 (2200원)");
        System.out.println("4. 조니워커 블루라벨 (600,000원)");
        System.out.println("5. 닷사이 23 (250,000원)");

        int choice = scanner.nextInt();
        String item = "";
        int price = 0;

        switch(choice) {
            case 1:
                item = "닥터페퍼";
                price = 1800;
                break;
            case 2:
                item = "코카콜라";
                price = 2400;
                break;
            case 3:
                item = "칠성사이다";
                price = 2200;
                break;
            case 4:
                item = "조니워커 블루라벨";
                price = 600000;
                break;
            case 5:
                item = "닷사이 23";
                price = 250000;
                break;
            default:
                System.out.println("다시 선택해 주세요");
                return;
        }
        System.out.printf("%s을(를) 선택하셨습니다. 금액 %d원을 넣어주세요.", item, price);
        int totalMoney = 0;
        while (totalMoney < price) {
            System.out.printf("%d원이 투입되었습니다. 금액을 보충해주세요: ", totalMoney);
            int insertedMoney = scanner.nextInt();
            totalMoney += insertedMoney;
            if (totalMoney < price) {
                System.out.printf("금액이 부족합니다. %d원이 더 필요합니다.", price - totalMoney);
            }
        }

        int change = totalMoney - price;
        System.out.printf("%s이(가) 나왔습니다. 잔돈은 %d원입니다.", item, change);
    }
}
