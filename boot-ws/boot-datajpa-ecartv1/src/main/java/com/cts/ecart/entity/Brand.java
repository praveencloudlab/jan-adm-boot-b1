package com.cts.ecart.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity(name="brands")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int brandId;
	private String brandTitle;	
	@OneToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinTable(name="brandInfo",
				joinColumns = {@JoinColumn(name="brandId")},
				inverseJoinColumns = {@JoinColumn(name="productId")})
	private List<Product> prods=new ArrayList<>();	
}
