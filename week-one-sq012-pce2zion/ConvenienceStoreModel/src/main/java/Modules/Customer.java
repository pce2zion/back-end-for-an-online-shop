package Modules;

import Interface.CustomerInterface;

public class Customer extends Person  implements CustomerInterface{


    private Integer cashAtHand;


    public Customer() {
    }

    public Customer(Integer id, String firstName, String lastName, String email, Integer cashAtHand) {
        super(id, firstName, lastName, email);
        this.cashAtHand = cashAtHand;
    }

    public Integer getCashAtHand() {
        return cashAtHand;
    }

    public void setCashAtHand(Integer cashAtHand) {
        this.cashAtHand = cashAtHand;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cashAtHand=" + cashAtHand +
                "} " + super.toString();
    }

    @Override
    public String buyProducts(Products products) {
        String msg = "";
        if (this.cashAtHand > products.getAmount()) {
            msg= "Your product: " + products.getNumberOfProducts()+ " " + products.getName() +
                    " is ready.";
        } else if (this.cashAtHand < products.getAmount()) {
            return "Your product: " + products.getNumberOfProducts()+ " " + products.getName() + ". Sorry your money is not enough.";
        } else if (this.cashAtHand.equals(products.getAmount())) {
            msg= "Your product: " + products.getNumberOfProducts()+ " " + products.getName() +
                    " is ready. Thank you for shopping with us.";
        }
        return msg;
    }


}

