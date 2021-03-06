package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cart")
@Getter
@Setter
@ToString
public class Cart {
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY) //회원 엔티티와 일대일 매핑 지정
    @JoinColumn(name = "member_id") //JoinColumn 어노테이션으로 매핑할 외래키 지정
    private Member member;
}
