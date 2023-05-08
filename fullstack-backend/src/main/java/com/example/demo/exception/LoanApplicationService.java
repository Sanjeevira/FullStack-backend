package com.example.demo.exception;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.LoanApplicationRepository;
import com.example.demo.model.LoanApplicationModel;

@Service
public class LoanApplicationService {
	@Autowired
	LoanApplicationRepository laRep;
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laRep.findAll();
		return l;
	}
	public LoanApplicationModel saveUser(LoanApplicationModel u) {
		// TODO Auto-generated method stub
		return laRep.save(u);
	}

}
