package com.scnu.user.service;

import com.scnu.order.OrderService;
import com.scnu.user.UserService;
import com.scnu.user.com.scnu.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@Service
public class UserServiceImpl implements UserService {


    @Override
    public int decreaseAccountBalance(String userId,double orderAmount) {

        log.info("decrease account balance -------");
        return 0;
    }
}
