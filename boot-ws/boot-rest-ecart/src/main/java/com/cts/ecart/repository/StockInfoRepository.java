package com.cts.ecart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.StockInfo;

public interface StockInfoRepository extends JpaRepository<StockInfo, Integer> {}
