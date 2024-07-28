package com.example.santander_dev_week.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "tb_feature")
public class Feature extends BaseItem {
}
