package Modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void buyProducts() {

        Products product1 =new Products(1, "Chocolate", 500, 1);
        Products product2 = new Products(2, "Bread", 300, 2);


        Customer customer1 = new Customer(1, "Lilian", "Ike", "lily@gmail.com", 1000);
        Customer customer2 = new Customer(2, "Tobi", "Akin", "tobbie@gmail.com", 300);



        String productBought = customer1.buyProducts(product1);
        String productBought2 = customer2.buyProducts(product1);
        String productBought3 = customer2.buyProducts(product2);


        String success = "Your product: " + product1.getNumberOfProducts()+ " " + product1.getName() +
                " is ready.";

        String fail = "Your product: " + product1.getNumberOfProducts() + " " +
                product1.getName() + ". Sorry your money is not enough.";

        String noBalanceButSuccess = "Your product: " + product2.getNumberOfProducts()+ " " + product2.getName() +
                " is ready. Thank you for shopping with us.";

        Assertions.assertEquals(success, productBought);
        Assertions.assertEquals(fail, productBought2);
        Assertions.assertEquals(noBalanceButSuccess, productBought3);




    }
}