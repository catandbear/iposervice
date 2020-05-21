package com.fsd2020.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class IPOEntity {
	
	@ID
	private int id;
	private String company_name;
	private String stock_exchange;
	private String price_per_share;
	private int total_num;
	private String remark;	
}
