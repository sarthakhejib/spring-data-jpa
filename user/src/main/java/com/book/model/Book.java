package com.book.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "book")
@Table(name = "book")
@Getter
@Setter
public class Book {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private BigDecimal price;
	@Column(nullable = false)
	private String author;

	// for JPA only, no use
	public Book() {
	}

	// getters, setters and constructor
}
