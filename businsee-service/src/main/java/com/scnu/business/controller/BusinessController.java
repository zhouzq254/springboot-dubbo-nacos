package com.scnu.business.controller;

import com.scnu.business.response.ScnuResponse;
import com.scnu.order.OrderService;
import com.scnu.order.dto.OrderDTO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/business")
public class BusinessController {

    @Reference
    private OrderService orderService;

    @PostMapping("/buy")
    public ScnuResponse<OrderDTO> buy(){
        OrderDTO order = new OrderDTO();
        order.setOrderId(UUID.randomUUID().toString().replace("-",""));
        order.setUserId("user1");
        order.setOrderAmount(100);
        orderService.createOrder(order);
        ScnuResponse response = new ScnuResponse<>();
        response.setData(order);
        return response;
    }
}
