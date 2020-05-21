package com.fsd2020.controller;

import java.util.List;

import com.fsd2020.repository.IpoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd2020.data.entity.IPOEntity;

@RestController
@RequestMapping("user/ipo")
@CrossOrigin("*")
public class IPOUserController {

	private IpoRepository ipoMapper;

	@Autowired
	private IPOUserController(IpoRepository ipoMapper) {
		this.ipoMapper = ipoMapper;
	}

	@PostMapping("add")
	private IPOEntity addIpo(@RequestBody(required = true) IPOEntity ipo) {
		IPOEntity ipoEntity = ipoMapper.save(ipo);

		return ipoEntity;
	}

	@GetMapping("list")
	public Iterable<IPOEntity> listipo() {
		return ipoMapper.findAll();
	}
}
