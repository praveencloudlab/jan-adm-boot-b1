package com.cts.ecart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="stock_info")
@Setter
@Getter
@ToString
public class StockInfo {
	@Id
	@GeneratedValue
	private int stockId;
	private int stock;
}
