package com.cts.ecart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="categories")
@Setter
@Getter
@ToString
public class Category {
	@Id
	@GeneratedValue
	private int categoryId;
	private String categoryTitle;
}
