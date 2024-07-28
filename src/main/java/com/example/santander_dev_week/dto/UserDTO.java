package com.example.santander_dev_week.dto;

import com.example.santander_dev_week.model.Account;
import com.example.santander_dev_week.model.Card;
import com.example.santander_dev_week.model.Feature;
import com.example.santander_dev_week.model.News;

import java.util.List;

public record UserDTO(String name, Account account, List<Feature> features, Card card, List<News> news) {
}
