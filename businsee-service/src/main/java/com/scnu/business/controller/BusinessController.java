package com.scnu.business.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.scnu.business.response.ScnuResponse;
import com.scnu.order.OrderService;
import com.scnu.order.dto.OrderDTO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/business")
public class BusinessController {

    @Reference
    private OrderService orderService;

    @NacosValue(value = "${dubbo.version}", autoRefreshed = true)
    private String version;

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

    @GetMapping("/dynaminc-config")
    public ScnuResponse<String> getDynamicConfig(){
        ScnuResponse response = new ScnuResponse();
        response.setData(version);
        return response;
    }
}
