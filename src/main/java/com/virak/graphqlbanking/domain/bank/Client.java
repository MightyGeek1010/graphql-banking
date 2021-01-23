package com.virak.graphqlbanking.domain.bank;

import java.util.List;
import java.util.UUID;

import lombok.Builder;
import lombok.Setter;
import lombok.Value;

@Value
//@Setter
@Builder
public class Client {

	UUID id;
	String firstName;
	List<String> middleNames;
	String lastName;
}
