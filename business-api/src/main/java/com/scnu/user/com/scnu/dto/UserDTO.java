package com.scnu.user.com.scnu.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -6664864236075694663L;
    private String userId;
    private String userName;
    private String phoneNumber;
    private double accountBalance;
}
