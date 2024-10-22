package peerTopeer.service.Impl;

import peerTopeer.model.Customer;
import peerTopeer.model.PosAgent;
import peerTopeer.service.PosAgentService;

import java.util.LinkedList;
import java.util.Queue;

public class PosAgentFifoServiceImpl implements PosAgentService {

    Queue<Customer> customerOnQueue = new LinkedList<>();

    public PosAgentFifoServiceImpl (){
        this.customerOnQueue = new LinkedList<>();
    }


    @Override
    public void addCustomerToQueue(Customer customer) {
        customerOnQueue.add(customer);
    }

    @Override
    public String usePos(PosAgent usage) {
        if (customerOnQueue.isEmpty()) {
            return "No customer is on queue yet";
        }
        Customer customer = customerOnQueue.poll();
        return customer.getName() + " has made " + usage.productType()+ ".";
    }
}
