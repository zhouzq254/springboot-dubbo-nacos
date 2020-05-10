package com.scnu.order.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OrderDTO implements Serializable {
    private static final long serialVersionUID = -5624859580136956025L;

    private String orderId;
    private double orderAmount;
    private Date orderTime;
    private String userId;
}
