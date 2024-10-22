package peerTopeer.service;

import peerTopeer.model.Customer;
import peerTopeer.model.PosAgent;

public interface PosAgentService {
    void addCustomerToQueue(Customer customer);
    String usePos(PosAgent usage);
}
