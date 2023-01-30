package com.cts.ecart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="brands")
@Setter
@Getter
@ToString
public class Brand {
	@Id
	@GeneratedValue
	private int brandId;
	private String brandTitle;
}
