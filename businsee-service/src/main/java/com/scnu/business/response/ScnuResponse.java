package com.scnu.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScnuResponse<T> implements Serializable {
    private static final long serialVersionUID = -1504113586658485067L;

    private int code = 200;
    private String msg = "sucess";
    private T data;


}
