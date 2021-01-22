package com.virak.graphqlbanking.resolver;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.virak.graphqlbanking.domain.bank.BankAccount;
import com.virak.graphqlbanking.domain.bank.Currency;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {
	public BankAccount bankAccount(UUID id) {
		log.info("Retrieving bank account id: {}", id);
		return BankAccount.builder().id(id).currency(Currency.USD).name("Virak").build();

	}
}
