package com.store.conv;

import Enums.Qualifications;
import Modules.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Applicant applicant1 = new Applicant(1, "Femi", "Famo","fem@gmail.com", 60, Qualifications.BSC);
        Applicant applicant2 =new Applicant(2, "Mercy", "Eke", "mercy@gmail.com", 90, Qualifications.SSCE);

        //Polymorphism
        List<Applicant> applicantList = new ArrayList<>();

        applicantList.add(applicant1);
        applicantList.add(applicant2);



        Manager manager = new Manager(1, "Tunde", "Makin", "tude@gmail.com", 1);

        System.out.println(manager.hireApplicant(applicant1));
        System.out.println(manager.hireApplicant(applicant2));

        Cashier cashier1 = new Cashier(1, "Peace", "Obute", "pce@gmail.com", 1);

        Products product1 =new Products(1, "Chocolate", 500, 1);
        Products product2 = new Products(2, "Bread", 300, 2);
        Products product3 = new Products(3, "hanger", 300,1);



        List<Products> productsList = new ArrayList<>();

        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);

//        List<Person> staffOfStore = new ArrayList<>();
//        staffOfStore.add(manager);
//        staffOfStore.add(cashier1);
//


        Receipts receipt1 = new Receipts(1, 500, "cashReceipt", product1);
        Receipts receipt2 = new Receipts(2, 600, "Transaction receipt", product2);

        List<Receipts> receiptsList = new ArrayList<>();

        receiptsList.add(receipt1);
        receiptsList.add(receipt2);

        Customer customer1 = new Customer(1, "Lilian", "Ike", "lily@gmail.com", 1000);
        Customer customer2 = new Customer(2, "Tobi", "Akin", "tobbie@gmail.com", 300);

        List<Customer> customerList = new ArrayList<>();

        customerList.add(customer1);
        customerList.add(customer2);



        System.out.println(cashier1.sellProducts(product2,  customer1));

        System.out.println(cashier1.sellProducts(product1, customer2));

        System.out.println(cashier1.sellProducts(product2, customer1));

        System.out.println(cashier1.dispenseReceipts(receipt2, product3, customer1));

        System.out.println(customer1.buyProducts(product1));
        System.out.println(customer2.buyProducts(product2));
    }
}




