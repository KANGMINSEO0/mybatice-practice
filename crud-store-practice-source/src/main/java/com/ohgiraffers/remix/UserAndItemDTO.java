package com.ohgiraffers.remix;

public class UserAndItemDTO {

    private int userId;
    private String userName;
    private String userPhone;
    private String buyDate;
    private int buyAmount;
    private ItemDTO item;

    public UserAndItemDTO() {}

    public UserAndItemDTO(int userId, String userName, String userPhone, String buyDate, int buyAmount, ItemDTO item) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.buyDate = buyDate;
        this.buyAmount = buyAmount;
        this.item = item;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public int getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(int buyAmount) {
        this.buyAmount = buyAmount;
    }

    public ItemDTO getItem() {
        return item;
    }

    public void setItem(ItemDTO item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", buyDate='" + buyDate + '\'' +
                ", buyAmount=" + buyAmount +
                ", item=" + item +
                '}';
    }
}
