package com.bridgelabz.AddressBook.Day10;
import java.util.ArrayList;
import java.util.Scanner;
public class Collection
{
    private String first;
    private String last;
    private String add;
    private String city;
    private String state;
    private int zip;
    private long phoneNo;
    private String email;
    static ArrayList<AddressBookUc1> contactBook = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void readData()
    {
        int i ;
        boolean b= false;
        System.out.println("Enter the first name: ");
        first = sc.next();
        System.out.println("Enter the last name: ");
        last = sc.next();
        System.out.println("Enter the address: ");
        add = sc.next();
        System.out.println("Enter the city: ");
        city = sc.next();
        System.out.println("Enter the state: ");
        state = sc.next();
        System.out.println("Enter the zip code: ");
        zip = sc.nextInt();
        System.out.println("Enter the phone number: ");
        phoneNo = sc.nextLong();
        System.out.println("Enter the email: ");
        email = sc.next();

        for(i=0;i<contactBook.size();i++)
        {
            if(contactBook.get(i).getFirstName().equals(first)&&contactBook.get(i).getLastName().equals(last))
            {
                System.out.println("Entered name is exist");
                b = true;
                break;
            }
        }
        if(b== false) {
            AddressBookUc1 contact = new AddressBookUc1(first , last , add , city , state , zip , phoneNo , email);
            contactBook.add(contact);
            System.out.println("\nContact added Successfully.");
        }

    }

    public void editData()
    {
        int i,ans;
        System.out.println("\nEnter first name to edit :- ");
        String name = sc.next();
        for(i=0;i<contactBook.size();i++) {
            if(contactBook.get(i).getFirstName().equals(name))
            {
                do {
                    System.out.print("\nSelect option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
                    int cl = sc.nextInt();
                    switch(cl) {
                        case 1:
                            System.out.print("Enter new first name :- ");
                            contactBook.get(i).setFirstName(sc.next());
                            System.out.println("First name is updated.");
                            break;
                        case 2:
                            System.out.print("Enter new last name :- ");
                            contactBook.get(i).setLastName(sc.next());
                            System.out.println("Last name is updated.");
                            break;
                        case 3:
                            System.out.print("Enter new address :- ");
                            contactBook.get(i).setAddress(sc.next());
                            System.out.println("Address is updated.");
                            break;
                        case 4:
                            System.out.print("Enter new city :- ");
                            contactBook.get(i).setCity(sc.next());
                            System.out.println("City is updated.");
                            break;
                        case 5:
                            System.out.print("Enter new state :- ");
                            contactBook.get(i).setState(sc.next());
                            System.out.println("State is updated.");
                            break;
                        case 6:
                            System.out.print("Enter new zip code :- ");
                            contactBook.get(i).setZip(sc.nextInt());
                            System.out.println("Zip code is updated.");
                            break;
                        case 7:
                            System.out.print("Enter new phone number :- ");
                            contactBook.get(i).setPhoneNo(sc.nextLong());
                            System.out.println("Phone number is updated.");
                            break;
                        case 8:
                            System.out.print("Enter new email :- ");
                            contactBook.get(i).setEmail(sc.next());
                            System.out.println("Email is updated.");
                            break;
                    }
                    System.out.println("Enter 1 if you want to continue");
                    ans = sc.nextInt();
                }while(ans == 1);
            }
            else
                System.out.println("please enter the correct first name");
        }

    }

    public void deleteData()
    {
        int i;
        System.out.println("\nEnter first name to delete : ");
        String name = sc.next();
        for(i=0;i<contactBook.size();i++) {
            if(contactBook.get(i).getFirstName().equals(name))
            {
                contactBook.remove(i);
                System.out.println("deleted");
            }
            else
            {
                System.out.println("not deleted");
            }
        }
    }
    public void DisplayContacts()
    {
        System.out.println("\nContacts Present in Address Book:");
        for(int i=0;i<contactBook.size();i++) {
            System.out.println(contactBook.get(i));
        }
    }
}