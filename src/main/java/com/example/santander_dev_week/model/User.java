package com.example.santander_dev_week.model;

import jakarta.persistence.*;
import jdk.jfr.Unsigned;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    @OneToOne(cascade = CascadeType.ALL)
    public Account account;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Feature> features;
    @OneToOne(cascade = CascadeType.ALL)
    public Card card;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<News> news;
}
