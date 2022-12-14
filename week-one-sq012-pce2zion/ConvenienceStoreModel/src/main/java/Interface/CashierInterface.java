package Interface;

import Modules.Customer;
import Modules.Products;
import Modules.Receipts;

public interface CashierInterface {
    String sellProducts(Products products, Customer customer);

    String dispenseReceipts(Receipts receipts, Products products, Customer customer);


}
