package com.bridgelabz.AddressBook.Day10;
import java.util.Scanner;

public class AddressBookUc5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cl;
        int ans;
        Collection collection = new Collection();
        do {
            System.out.println("Enter the choice : ");
            System.out.println("1.Add ");
            System.out.println("2.Display");
            System.out.println("3.Edit");
            System.out.println("4.Delete");
            cl= sc.nextInt();
            switch(cl) {
                case 1:
                    collection.readData();
                    break;
                case 2:
                    collection.DisplayContacts();
                    break;
                case 3:
                    collection.editData();
                    break;
                case 4:
                    collection.deleteData();
                    break;

            }System.out.println("Do you want to continue....if yes then press '1' ");
            ans = sc.nextInt();
        }while(ans == 1);

    }
}