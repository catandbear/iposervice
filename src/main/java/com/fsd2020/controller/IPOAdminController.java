package com.fsd2020.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd2020.data.entity.IPOEntity;
import com.fsd2020.data.entity.ReturnedEntity;
import com.fsd2020.data.mapper.IPOMapper;

@RestController
@RequestMapping("admin/ipo")
@CrossOrigin("*")
public class IPOAdminController {

	private IPOMapper ipoMapper;
	
	@Autowired
	private IPOAdminController(IPOMapper ipoMapper) {
		this.ipoMapper = ipoMapper;
	}
	
	@PostMapping("add")
	private ReturnedEntity addIpo(@RequestBody(required = true) IPOEntity ipo) {
		int status = ipoMapper.addIPO(ipo);
		if (status==1) {
			return new ReturnedEntity("ok");
		}
		return new ReturnedEntity("failed");
	}
	
	@GetMapping("list")
	public List<IPOEntity> listipo() {
		return ipoMapper.listIPO();
	}
	
}
