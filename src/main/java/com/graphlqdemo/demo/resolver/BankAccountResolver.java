package com.graphlqdemo.demo.resolver;

import com.graphlqdemo.demo.domain.bank.BankAccount;
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

        return BankAccount.builder().id(id).currency(Currency.HUF).name("Botond").build();
    }
}
