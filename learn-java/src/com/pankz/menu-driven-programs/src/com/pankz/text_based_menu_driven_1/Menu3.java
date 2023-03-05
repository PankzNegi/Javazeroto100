package com.pankz.text_based_menu_driven_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Menu3 {
    public static void displayMenu(ArrayList<MenuItem>items) {
        System.out.println("M E N U");
        System.out.println("==========");
        for (int i = 0;i< items.size(); i++) {
            MenuItem item=items.get(i);
            System.out.printf("%d. %s \t %.2f\n", i+1, item.getName(),item.getPrice());
        }
        System.out.printf("%d.Exit \n",items.size()+1);//printing exit option

        System.out.println("================");


    }
    private static void completeTransaction(int choice, ArrayList<MenuItem> items) {
        MenuItem item=items.get(choice-1);
        System.out.printf("Here is your %s coffee worth %.2f\n",item.getName(),item.getPrice());

    }
    public static void readInventoryFile(String fileName,ArrayList<MenuItem>items)
    {
        try
        {
            FileReader fr=new FileReader(fileName);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null)
            {
                String tokens[]=line.split(",");
                String name=tokens[0];
                double price=Double.parseDouble(tokens[1]);
                items.add(new MenuItem(name,price));

            }
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("Error-can't read from file"+fileName);
        }
    }

    public static void main(String[] args) {
        int choice;

        ArrayList<MenuItem> menuItems=new ArrayList<>();
       //Read inventory.txt and create menuitems
       readInventoryFile("Inventory.txt",menuItems);


        int EXIT = menuItems.size()+1;
        //Creating keyboard object for input validation
        Keyboard key=new Keyboard();
        displayMenu(menuItems);

        Scanner sc = new Scanner(System.in);
        choice = key.readInteger("Enter choice","Error:invalid input",1,EXIT);
        while (choice != EXIT) {
           completeTransaction(choice,menuItems);
            displayMenu(menuItems);
          choice = key.readInteger("Enter choice","Error:invalid input",1,EXIT);
        }
        System.out.println("Call again");

    }



}
