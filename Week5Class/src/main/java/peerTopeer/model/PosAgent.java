package peerTopeer.model;

import peerTopeer.enums.ProductType;

public class PosAgent {

    private ProductType productType;

    public PosAgent(ProductType productType){
        this.productType = productType;
    }

    public ProductType productType() {
        return productType;
    }
}


