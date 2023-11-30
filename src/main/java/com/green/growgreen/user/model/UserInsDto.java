package com.green.growgreen.user.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class UserInsDto {
    @JsonIgnore //swagger에서 안타나게 해줌
    private Integer iuser;
    private String nm;
    private String uid;
    private String upw;
}
