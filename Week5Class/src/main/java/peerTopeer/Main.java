package peerTopeer;

import peerTopeer.enums.ProductType;
import peerTopeer.model.Customer;
import peerTopeer.model.PosAgent;
import peerTopeer.service.Impl.PosAgentFifoServiceImpl;
import peerTopeer.service.Impl.PosAgentServiceImpl;
import peerTopeer.service.PosAgentService;

public class Main {
    public static void main(String[] args) {
        // Create some sample devs (Male and Female)

        Customer customer1 = new Customer(70,"Freedom");
        Customer customer3 = new Customer(50, "Chimezie");
        Customer customer2 = new Customer(30, "John");

        //Create a sample product
        PosAgent posAgent = new PosAgent(ProductType.DEPOSIT);

        PosAgent posAgent1 = new PosAgent(ProductType.WITHDRAWAL);

        PosAgent posAgent2 = new PosAgent(ProductType.PAY_BILLS);



        PosAgentServiceImpl posService = new PosAgentServiceImpl();

        PosAgentFifoServiceImpl posFifo = new PosAgentFifoServiceImpl();



        posService.addCustomerToQueue(customer2);
        posService.addCustomerToQueue(customer3);
        posService.addCustomerToQueue(customer1);


        posFifo.addCustomerToQueue(customer2);
        posFifo.addCustomerToQueue(customer3);
        posFifo.addCustomerToQueue(customer1);

        // Render PoS service
        System.out.println(posService.usePos(posAgent1));

        System.out.println(posFifo.usePos(posAgent));
    }
}



