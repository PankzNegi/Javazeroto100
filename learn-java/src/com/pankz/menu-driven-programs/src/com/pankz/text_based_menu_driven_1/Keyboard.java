package com.pankz.text_based_menu_driven_1;

import java.util.Scanner;

public class Keyboard {
    private Scanner in;
    Keyboard() {
        in = new Scanner(System.in);
    }
    public int readInteger(String propmtMsg,String errorMsg,int low,int high)
    {
        int num=0;
        String strInput;
        boolean valid=false;
        while(valid==false)
        {
            System.out.println(propmtMsg);
            strInput=in.nextLine();

        try
        {
            num=Integer.parseInt(strInput);
            if(num>=low&& num<=high)
                valid=true;
            else System.out.println(errorMsg);
        }
        catch(NumberFormatException e)
        {
            System.out.println(errorMsg);
        }
    }
    return num;
}}
