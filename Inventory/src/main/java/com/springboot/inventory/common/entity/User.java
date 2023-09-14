package com.springboot.inventory.common.entity;

import com.springboot.inventory.common.enums.UserRole;
import com.springboot.inventory.user.dto.UserDTO;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class User extends Timestamped{

    @Id //기본키 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id; //Long = mysql 에서 bigint

    @Column(nullable = false , unique = true) // 유니크 제약조건 추가 , 낫널
    private String username; // 아이디

    private UserRole role;



}
