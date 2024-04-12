package com.ohgiraffers.remix;

import java.util.List;

public interface StoreMapper {
    List<ItemDTO> selectAllItem();

    ItemDTO selectItemById(int itemId);

    int insertItem(ItemDTO item);

    int updateItem(ItemDTO item);

    int deleteItem(int itemId);

    List<UserDTO> selectUserByItemId();
}
