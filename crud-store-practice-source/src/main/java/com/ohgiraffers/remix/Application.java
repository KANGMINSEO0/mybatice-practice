package com.ohgiraffers.remix;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StoreController storeController = new StoreController();

        do {
            System.out.println("========= 스토어 관리 메뉴 =========");
            System.out.println("1. 상품 관리");
            System.out.println("2. 고객 관리");
            System.out.println("3. 상품별 구매고객 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("관리 메뉴의 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : itemMenu(); break;
//                case 2 : userMenu(); break;
                case 3 : storeController.selectUserByItemId(inputItemId());
                case 9 : break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
            if (no == 9) {
                System.out.println("스토어 관리 프로그램을 종료합니다.");
                break;
            }
        } while (true);

    }

    private static void itemMenu() {

        Scanner sc = new Scanner(System.in);
        StoreController storeController = new StoreController();

        do {
            System.out.println("========= 상품 관리 메뉴 =========");
            System.out.println("1. 상품 전체 조회");
            System.out.println("2. 상품 상세 조회");
            System.out.println("3. 상품 추가");
            System.out.println("4. 상품 수정");
            System.out.println("5. 상품 삭제");
            System.out.println("9. 이전 메뉴");
            System.out.print("상품 관리 메뉴의 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : storeController.selectAllItem(); break;
                case 2 : storeController.selectItemById(inputItemId()); break;
                case 3 : storeController.registItem(inputItem()); break;
                case 4 : storeController.modifyItem(inputModifyItem()); break;
                case 5 : storeController.deleteItem(inputItemId()); break;
                case 9 : return;
            }
        } while (true);
    }

    private static Map<String, String> inputModifyItem() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 상품 ID를 입력하세요 : ");
        String itemId = sc.nextLine();
        System.out.print("수정할 상품 이름을 입력하세요 : ");
        String itemName = sc.nextLine();
        System.out.print("수정할 상품 가격을 입력하세요 : ");
        String itemPrice = sc.nextLine();
        System.out.print("수정할 상품 수량을 입력하세요 : ");
        String itemAmount = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("itemId", itemId);
        parameter.put("itemName", itemName);
        parameter.put("itemPrice", itemPrice);
        parameter.put("itemAmount", itemAmount);

        return parameter;
    }

    private static Map<String, String> inputItem() {

        Scanner sc = new Scanner(System.in);
        System.out.print("상품 이름을 입력하세요 : ");
        String itemName = sc.nextLine();
        System.out.print("상품 가격을 입력하세요 : ");
        String itemPrice = sc.nextLine();
        System.out.print("상품 수량을 입력하세요 : ");
        String itemAmount = sc.nextLine();

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String itemDate = sdf.format(date);

        Map<String, String> parameter = new HashMap<>();
        parameter.put("itemName", itemName);
        parameter.put("itemPrice", itemPrice);
        parameter.put("itemAmount", itemAmount);
        parameter.put("itemDate", itemDate);

        return parameter;
    }

    private static Map<String, String> inputItemId() {

        Scanner sc = new Scanner(System.in);
        System.out.print("상품 ID를 입력하세요 : ");
        String itemId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("itemId", itemId);
        return parameter;
    }

    private static void userMenu() {
    }

}
