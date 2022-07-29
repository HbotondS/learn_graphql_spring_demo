package com.graphlqdemo.demo.resolver;

import com.graphlqdemo.demo.domain.bank.BankAccount;
import com.graphlqdemo.demo.domain.bank.Client;
import com.graphlqdemo.demo.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id) {
        log.info("Retrieving bank accounts id {}", id);

        Client client1 = Client.builder()
                .id(UUID.randomUUID())
                .firstName("John")
                .lastName("Doe")
                .build();

        Client client2 = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Jane")
                .lastName("Doe")
                .build();

        client1.setClient(client2);
        client2.setClient(client1);

        return BankAccount.builder()
                .id(id)
                .currency(Currency.HUF)
                .client(client1)
                .build();
    }
}
