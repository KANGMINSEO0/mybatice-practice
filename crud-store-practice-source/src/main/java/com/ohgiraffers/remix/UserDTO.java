package com.ohgiraffers.remix;

public class UserDTO {

    private int userId;
    private String userName;
    private String userPhone;
    private String buyDate;
    private int buyAmount;
    private int itemId;

    public UserDTO() {}

    public UserDTO(int userId, String userName, String userPhone, String buyDate, int buyAmount, int itemId) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.buyDate = buyDate;
        this.buyAmount = buyAmount;
        this.itemId = itemId;
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

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", buyDate='" + buyDate + '\'' +
                ", buyAmount=" + buyAmount +
                ", itemId=" + itemId +
                '}';
    }
}
