package com.ohgiraffers.remix;

import java.util.List;

public class PrintResult {
    public void printItemList(List<ItemDTO> itemList) {

        for (ItemDTO item : itemList) {
            System.out.println(item);
        }
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectList" : errorMessage = "상품 목록 조회를 실패하셨습니다."; break;
            case "selectOne" : errorMessage = "상품 상세 조회를 실패하셨습니다."; break;
            case "insert" : errorMessage = "상품 추가를 실패하셨습니다."; break;
            case "update" : errorMessage = "상품 수정을 실패하셨습니다."; break;
            case "delete" : errorMessage = "상품 삭제를 실패하셨습니다."; break;
            case "selectUserByItemId" : errorMessage = "해당 상품을 구매한 고객 목록 조회를 실패하셨습니다."; break;
        }
        System.out.println(errorMessage);
    }

    public void printItem(ItemDTO item) {

        System.out.println(item);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "상품 추가를 성공하셨습니다."; break;
            case "update" : successMessage = "상품 수정을 성공하셨습니다."; break;
            case "delete" : successMessage = "상품 삭제를 성공하셨습니다."; break;
        }
        System.out.println(successMessage);
    }

    public void printUserList(List<UserDTO> userList) {

        for (UserDTO user : userList) {
            System.out.println(user);
        }
    }
}
