package com.ohgiraffers.dynamicsql;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=========== 동적 sql =========");
            System.out.println("1. if 태그 연습");
            System.out.println("2. choose 태그 연습");
            System.out.println("3. trim 태그 연습");
            System.out.println("9. 종료하기");
            System.out.print("메뉴를 선택하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : ifPractice(); break;
                case 9 :
                    System.out.println("시스템을 종료합니다."); return;
            }
        } while (true);


    }

    private static void ifPractice() {
        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        do {
            System.out.println("========= if 태그 연습 메뉴 =========");
            System.out.println("1. 입력한 금액만큼의 급여를 받고 있는 직원 목록 보여주기");
            System.out.println("2. 직급코드 or 부서코드 입력 받아서 해당 사원 목록 가져오기");
            System.out.println("9. 이전메뉴");
            System.out.print("메뉴를 선택하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : employeeService.selectEmployeeByPrice(inputPrice()); break;
                case 9 : return;
            }
        } while (true);
    }

    private static int inputPrice() {

        Scanner sc = new Scanner(System.in);
        System.out.print("검색하실 급여의 최대 금액을 입력해주세요 : ");
        int price = sc.nextInt();

        return price;
    }
}
