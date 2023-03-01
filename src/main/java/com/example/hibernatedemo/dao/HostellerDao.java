package com.example.hibernatedemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernatedemo.model.Hosteller;

public interface HostellerDao extends JpaRepository<Hosteller, Integer>{

}
