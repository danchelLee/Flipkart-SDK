package com.sw.client.enums;

public enum Environment {

    PRODUCTION("https://api.flipkart.net","https://api.flipkart.net/sellers"),

    SANDBOX("https://sandbox-api.flipkart.net","https://sandbox-api.flipkart.net/sellers");

    private final String apiEndpoint;

    private final String sellerEndpoint;

    public String getSellerEndpoint() {
        return sellerEndpoint;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

     Environment(String apiEndpoint, String sellerEndpoint){
        this.apiEndpoint = apiEndpoint;
         this.sellerEndpoint = sellerEndpoint;
     }
}
