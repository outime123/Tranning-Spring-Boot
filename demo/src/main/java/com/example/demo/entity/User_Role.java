package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GeneratorType;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class User_Role {
    @Id
    @Column(value = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(value = "id_user")
    private int id_user;
    @Column(value = "id_role")
    private int id_role;
}
