package com.scnu.order.service;

import com.scnu.order.OrderService;
import com.scnu.order.dto.OrderDTO;
import com.scnu.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    @Override
    public int createOrder(OrderDTO order) {
        log.info("create user order------");
        userService.decreaseAccountBalance(order.getUserId(),order.getOrderAmount());
        return 0;
    }
}
