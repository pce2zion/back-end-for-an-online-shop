package Modules;

import Interface.CashierInterface;

import java.util.List;

public class Cashier extends Staff implements CashierInterface {
    public Cashier() {
    }

    public Cashier(Integer id, String firstName, String lastName, String email, Integer staffId) {
        super(id, firstName, lastName, email, staffId);
    }

    @Override
    public String toString() {
        return "Cashier{} " + super.toString();
    }


    @Override
    public String sellProducts(Products products, Customer customer) {
        String balanceStatement = "";
        if (customer.getCashAtHand() >= products.getAmount() && products.getNumberOfProducts() >= 1) {

            balanceStatement = this.getFirstName() + " sold " + products.getNumberOfProducts() + " " + products.getName() +
                    " to " + customer.getFirstName() + " today.";

            products.setNumberOfProducts(products.getNumberOfProducts() - 1);


        }  else if (customer.getCashAtHand() < products.getAmount() && products.getNumberOfProducts() >= 1) {
            balanceStatement = "You do not have enough cash to purchase this product";

        } else if (customer.getCashAtHand() >= products.getAmount() && products.getNumberOfProducts() < 1) {
            balanceStatement = "Oops! unavailable product";
        }
        return balanceStatement;
    }



    @Override
    public String dispenseReceipts(Receipts receipts, Products products, Customer customer) {
        Integer txn = (customer.getCashAtHand() - products.getAmount());
        String receiptName = "";

        if (txn == customer.getCashAtHand() - products.getAmount()) {
            receiptName = "Here is your statement: \n" + receipts.getTypeOfReceipt() + ": " + receipts.getReceiptAmount() +
                    " \n Product name: " + products.getName() + " no of products: " + products.getNumberOfProducts();
        }

        return receiptName;


    }

}

