package com.example.demo.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Transactional
@NoArgsConstructor
@Data
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private Long emp_Id;
	@Column(name = "emp_name")
	private String emp_Name;
	@Column(name = "emp_age")
	private Integer emp_Age;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name ="fk_address_id")
	private Address address;
}
