package com.demo.bootservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table
@AllArgsConstructor
@NoArgsConstructor

public class Book {
	
	@Id
	private int bookId;
	@Column
	private String bookName;
	@Column
	private String bookPubliser;
	@Column
	private String bookStream;
	
}