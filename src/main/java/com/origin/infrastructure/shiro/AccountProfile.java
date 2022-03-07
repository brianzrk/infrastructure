package com.origin.infrastructure.shiro;

import lombok.Data;

import java.util.Date;

@Data
public class AccountProfile {

    private String id;

    private String username;
    private String email;
    private String sign;

    private String avatar;
    private String gender;
    private Date createdTime;

    public String getSex() {
        return "0".equals(gender) ? "女" : "男";
    }
}
