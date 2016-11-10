package com.company;

/**
 * Created by fs279 on 11/10/16.
 */
public class Code {
    private String myCode;
    private String h;
    private int r1;
    private int r2;
    private char [] le;
    private String mi = "";
    public Code(String code){
        myCode = code;
    }
    public String getCode(){
        return myCode;
    }
    public void hide(int p1, int p2){
        h = myCode.substring(p1,p2);
        r1 = p1;
        r2 = p2;
        le = new char[h.length()];
        for(char x: le)
            mi = mi + "X";
        myCode = myCode.substring(0,p1) + mi + myCode.substring(p2,myCode.length());
    }
    public void recover(int p1, int p2){
        myCode = myCode.substring(0,r1) + h + myCode.substring(r2, myCode.length());
    }
}
