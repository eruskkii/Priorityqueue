package peerTopeer.service.Impl;

import peerTopeer.model.Customer;
import peerTopeer.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public String askForMoney(Customer customer) {
        return "Customer Name: " + customer.getName() + "is asking for money";
}
    }