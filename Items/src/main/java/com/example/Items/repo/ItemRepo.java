package com.example.Items.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Items.entity.Item;

public interface ItemRepo extends JpaRepository<Item, Long> {
}

