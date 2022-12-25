package com.csbon.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserInfoVO {
    private String id;
    private String userId;
    private String userName;
    private String useYn;
    private String delYn;
}
