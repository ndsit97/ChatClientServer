/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatmulticlient;

/**
 *
 * @author My Love
 */
public class thanhvien {
    private String UserName;
    private String PassWord;
    private String DisplayName;

    public thanhvien(String DisplayName) {
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.DisplayName = DisplayName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }
    
}
