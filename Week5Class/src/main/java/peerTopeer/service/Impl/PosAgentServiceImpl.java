package peerTopeer.service.Impl;


import peerTopeer.model.Customer;
import peerTopeer.model.PosAgent;
import peerTopeer.service.PosAgentService;
import peerTopeer.utils.AgeComparator;

import java.util.PriorityQueue;

public class PosAgentServiceImpl implements PosAgentService {

    PriorityQueue<Customer> customerOnQueue = new PriorityQueue<>();
    public PosAgentServiceImpl() {
        customerOnQueue = new PriorityQueue<>(new AgeComparator());
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



