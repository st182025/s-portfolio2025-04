package com.example.ramen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ramen.model.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
}