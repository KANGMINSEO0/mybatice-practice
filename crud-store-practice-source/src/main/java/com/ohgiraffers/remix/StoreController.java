package com.ohgiraffers.remix;

import java.util.List;
import java.util.Map;

public class StoreController {

    private final PrintResult printResult;
    private final StoreService storeService;
    public StoreController() {
        printResult = new PrintResult();
        storeService = new StoreService();
    }
    public void selectAllItem() {

        List<ItemDTO> itemList = storeService.selectAllItem();

        if (itemList != null) {
            printResult.printItemList(itemList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectItemById(Map<String, String> parameter) {

        int itemId = Integer.parseInt(parameter.get("itemId"));

        ItemDTO item = storeService.selectItemById(itemId);

        if (item != null) {
            printResult.printItem(item);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registItem(Map<String, String> parameter) {

        String itemName = parameter.get("itemName");
        int itemPrice = Integer.parseInt(parameter.get("itemPrice"));
        int itemAmount = Integer.parseInt(parameter.get("itemAmount"));
        String itemDate = parameter.get("itemDate");

        ItemDTO item = new ItemDTO();
        item.setItemName(itemName);
        item.setItemPrice(itemPrice);
        item.setItemAmount(itemAmount);
        item.setItemDate(itemDate);

        if (storeService.registItem(item)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyItem(Map<String, String> parameter) {

        int itemId = Integer.parseInt(parameter.get("itemId"));
        String itemName = parameter.get("itemName");
        int itemPrice = Integer.parseInt(parameter.get("itemPrice"));
        int itemAmount = Integer.parseInt(parameter.get("itemAmount"));

        ItemDTO item = new ItemDTO();
        item.setItemId(itemId);
        item.setItemName(itemName);
        item.setItemPrice(itemPrice);
        item.setItemAmount(itemAmount);

        ItemDTO modifyItem = storeService.selectItemById(itemId);

        if (storeService.modifyItem(item)) {
            printResult.printItem(modifyItem);
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }

    }

    public void deleteItem(Map<String, String> parameter) {

        int itemId = Integer.parseInt(parameter.get("itemId"));

        ItemDTO item = storeService.selectItemById(itemId);

        if (storeService.deleteItem(itemId)) {
            printResult.printItem(item);
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }

    public void selectUserByItemId(Map<String, String> parameter) {

        int itemId = Integer.parseInt(parameter.get("itemId"));

        List<UserDTO> userList = storeService.selectUserByItemId(itemId);

        if (userList != null) {
            printResult.printUserList(userList);
        } else {
            printResult.printErrorMessage("selectUserByItemId");
        }


    }
}
