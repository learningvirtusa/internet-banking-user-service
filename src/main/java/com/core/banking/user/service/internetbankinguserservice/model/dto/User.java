package com.core.banking.user.service.internetbankinguserservice.model.dto;

import lombok.Data;

@Data
public class User {
    private Long id;

    private String email;

    private String identification;

    private String password;

    private String authId;

    private Status status;
}