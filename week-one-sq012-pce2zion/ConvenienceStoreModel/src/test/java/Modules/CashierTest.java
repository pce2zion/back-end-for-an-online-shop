package Modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {

    @Test
    void sellProducts() {

        Products product1 =new Products(1, "Chocolate", 500, 1);
        Products product2 = new Products(2, "Bread", 300, 2);



        Customer customer1 = new Customer(1, "Lilian", "Ike", "lily@gmail.com", 1000);
        Customer customer2 = new Customer(2, "Tobi", "Akin", "tobbie@gmail.com", 200);


        Cashier cashier1 = new Cashier(1, "Peace", "Obute", "pce@gmail.com", 1);

        String success = cashier1.getFirstName() + " sold " + product1.getNumberOfProducts() + " " + product1.getName() +
                " to " + customer1.getFirstName() + " today.";

        String successButFinishedProduct = "Oops! unavailable product";
        String fail = "You do not have enough cash to purchase this product";

        String productSold = cashier1.sellProducts(product1, customer1);
        String productSold2 = cashier1.sellProducts(product1,customer1);
        String productSold3 = cashier1.sellProducts(product2,customer2);

        Assertions.assertEquals(success, productSold);
        Assertions.assertEquals(successButFinishedProduct, productSold2);
        Assertions.assertEquals(fail, productSold3);
    }

    @Test
    void dispenseReceipts() {

        Products product3 = new Products(3, "hanger", 100,1);
        Customer customer1 = new Customer(1, "Lilian", "Ike", "lily@gmail.com", 1000);
        Receipts receipt2 = new Receipts(2, 600, "Transaction receipt", product3);
        Cashier cashier1 = new Cashier(1, "Peace", "Obute", "pce@gmail.com", 1);


        String successful = "Here is your statement: \n" + receipt2.getTypeOfReceipt() + ": " + receipt2.getReceiptAmount() +
                " \n Product name: " + product3.getName() + " no of products: " + product3.getNumberOfProducts();

        String receiptDispensed = cashier1.dispenseReceipts(receipt2, product3, customer1);


        Assertions.assertEquals(successful, receiptDispensed);



    }
}