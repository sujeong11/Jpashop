package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable // 값 타입은 변경이 불가능해야 한다. => setter는 반드시 닫아둔다.
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address() { // 리플렉션 같은 기술을 사용할 수 있기 때문에 protected로
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
