package com.example.santander_dev_week.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(unique = true)
    public String number;

    public String agency;

    @Column(precision = 2, scale = 13)
    public BigDecimal balance;

    @Column(name = "additional_limit", precision = 2, scale = 13)
    public BigDecimal limit;
}
