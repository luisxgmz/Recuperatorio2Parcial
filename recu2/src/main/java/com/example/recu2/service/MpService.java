package com.example.recu2.service;
import com.mercadopago.*;
public class MpService {

        MercadoPago.SDK.configure("ENV_ACCESS_TOKEN");

    Customer customer = new Customer();
        customer.setEmail("john@yourdomain.com");
        customer.save();

    Issuer issuer = new Issuer();
        issuer.setId("3245612");

    Card card = new Card();
        card.setToken("9b2d63e00d66a8c721607214cedaecda");
        card.setCustomerId(customer.getId());
        card.setIssuer(issuer);
        card.setPaymentMethodId("debit_card");
        card.save();

}
