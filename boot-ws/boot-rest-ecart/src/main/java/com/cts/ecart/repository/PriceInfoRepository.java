package com.cts.ecart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.PriceInfo;

public interface PriceInfoRepository extends JpaRepository<PriceInfo, Integer> {}
