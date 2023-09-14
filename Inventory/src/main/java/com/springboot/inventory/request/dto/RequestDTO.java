package com.springboot.inventory.request.dto;

import com.springboot.inventory.common.entity.User;
import lombok.Data;

@Data
public class RequestDTO {

    private String type;
    private String supply;
    private String content;
    private User user;

}
