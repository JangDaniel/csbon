package com.csbon.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UserInfoInsertDTO {
    @NotBlank(message="")
    private String id;

    @NotBlank(message="")
    private String userId;

    @NotNull(message="")
    private String userName;

    @NotBlank(message="")
    private String useYn;

    @NotBlank(message="")
    private String delYn;
}
