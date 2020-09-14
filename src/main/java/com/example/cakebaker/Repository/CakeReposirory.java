package com.example.cakebaker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cakebaker.entity.CakeCategory;

@Repository
public interface CakeReposirory extends JpaRepository<CakeCategory, Long> {

}
