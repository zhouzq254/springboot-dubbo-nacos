package com.scnu.user;

import com.scnu.user.com.scnu.dto.UserDTO;

public interface UserService {

    int decreaseAccountBalance(String userId,double orderAmount);
}
