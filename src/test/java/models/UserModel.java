package models;

import lombok.Builder;



@Builder
public class UserModel {
    private String username;

    private String password;

    private Integer age;

    private String sex;

    private Integer salary;

    private String position;

    private Boolean isDeath;
}
