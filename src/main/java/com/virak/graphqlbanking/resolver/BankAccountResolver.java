package com.virak.graphqlbanking.resolver;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.virak.graphqlbanking.domain.bank.BankAccount;
import com.virak.graphqlbanking.domain.bank.Client;
import com.virak.graphqlbanking.domain.bank.Currency;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {
	public BankAccount bankAccount(UUID id) {
		log.info("Retrieving bank account id: {}", id);
//		return BankAccount.builder().id(id).currency(Currency.USD).name("Virak").build();
		List<String> middleNames = new ArrayList<>();
		middleNames.add("Singh");

		return BankAccount.builder().id(id).currency(Currency.USD)
				.client(Client.builder().id(UUID.randomUUID())
						.firstName("Virak")
//						.middleNames(middleNames)
						.lastName("Chea").build()).build();
	}
}
