package com.ohgiraffers.remix;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.remix.Template.getSqlSession;

public class StoreService {
    public List<ItemDTO> selectAllItem() {

        SqlSession sqlSession = getSqlSession();

        StoreMapper storeMapper = sqlSession.getMapper(StoreMapper.class);

        List<ItemDTO> itemList = storeMapper.selectAllItem();

        sqlSession.close();

        return itemList;
    }

    public ItemDTO selectItemById(int itemId) {

        SqlSession sqlSession = getSqlSession();

        StoreMapper storeMapper = sqlSession.getMapper(StoreMapper.class);

        ItemDTO item = storeMapper.selectItemById(itemId);

        sqlSession.close();

        return item;
    }

    public boolean registItem(ItemDTO item) {

        SqlSession sqlSession = getSqlSession();

        StoreMapper storeMapper = sqlSession.getMapper(StoreMapper.class);

        int result = storeMapper.insertItem(item);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0? true: false;
    }

    public boolean modifyItem(ItemDTO item) {

        SqlSession sqlSession = getSqlSession();

        StoreMapper storeMapper = sqlSession.getMapper(StoreMapper.class);

        int result = storeMapper.updateItem(item);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0? true: false;
    }

    public boolean deleteItem(int itemId) {

        SqlSession sqlSession = getSqlSession();

        StoreMapper storeMapper = sqlSession.getMapper(StoreMapper.class);

        int result = storeMapper.deleteItem(itemId);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0? true: false;
    }

    public List<UserDTO> selectUserByItemId(int itemId) {

        SqlSession sqlSession = getSqlSession();

        StoreMapper storeMapper = sqlSession.getMapper(StoreMapper.class);

        List<UserDTO> userList = storeMapper.selectUserByItemId();

        sqlSession.close();

        return userList;
    }
}
