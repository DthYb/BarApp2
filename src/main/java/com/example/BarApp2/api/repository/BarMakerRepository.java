package com.example.BarApp2.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BarApp2.api.model.BarMaker;

@Repository
public interface BarMakerRepository extends JpaRepository<BarMaker, Integer>{

}
