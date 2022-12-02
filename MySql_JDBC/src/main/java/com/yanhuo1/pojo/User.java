package com.yanhuo1.pojo;


/**
 * @author 付秋垚
 */
public class User {
    private Integer id;
    private String account;
    private String password;
    private Integer detailed_information;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDetailed_information() {
        return detailed_information;
    }

    public void setDetailed_information(Integer detailed_information) {
        this.detailed_information = detailed_information;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", accounts='" + account + '\'' +
                ", password='" + password + '\'' +
                ", detailed_information='" + detailed_information + '\'' +
                '}';
    }
}
