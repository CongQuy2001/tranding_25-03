package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Acount;

public interface AccountRepo extends JpaRepository<Acount, Long> {

}
