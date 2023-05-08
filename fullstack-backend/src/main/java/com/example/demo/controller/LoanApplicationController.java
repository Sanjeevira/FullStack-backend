package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoanApplicationModel;
import com.example.demo.exception.LoanApplicationService;
//import com.example.demo.service.LoanApplicationService;

@RestController
@RequestMapping("/admin")
public class LoanApplicationController {
	@Autowired
	LoanApplicationService laSer;
	@GetMapping(value="/getAllLoans")
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laSer.get();
		return l;
	}

}
