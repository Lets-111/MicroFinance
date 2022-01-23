package com.magoo.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FinanceEntity {
	
	private int financeId;
	
	private String financeName;
	
	private double price;
	
	// Adding a new field
	
	private boolean isFinanceReal;

}
