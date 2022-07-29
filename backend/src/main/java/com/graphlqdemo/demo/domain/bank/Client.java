package com.graphlqdemo.demo.domain.bank;

import lombok.Builder;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Builder
@Setter
public class Client {
    UUID id;
    String firstName;
    List<String> middleName;
    String lastName;
}
