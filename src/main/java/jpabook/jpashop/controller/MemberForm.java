package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;// 값이 비어있으면 에러 발생

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수 입니다.") // 값이 비어있으면 에러 발생
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
