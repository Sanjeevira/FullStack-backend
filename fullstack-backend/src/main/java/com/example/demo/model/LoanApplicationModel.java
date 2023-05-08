package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoanApplicationModel {
	@Id
	private int loanid;
	private String loantype;
	private String applicantname;
	private String applicantaddress;
	private String applicantmobile;
	private String applicantemail;
	private String applicantaadhaar;
	private String applicantpan;
	private String applicantsalary;
	private String loanamountrequired;
	private String loanrepaymentmonths;

	public int getLoanid() {
		return loanid;
	}

	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}

	public String getLoantype() {
		return loantype;
	}

	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}

	public String getApplicantname() {
		return applicantname;
	}

	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}

	public String getApplicantaddress() {
		return applicantaddress;
	}

	public void setApplicantaddress(String applicantaddress) {
		this.applicantaddress = applicantaddress;
	}

	public String getApplicantmobile() {
		return applicantmobile;
	}

	public void setApplicantmobile(String applicantmobile) {
		this.applicantmobile = applicantmobile;
	}

	public String getApplicantemail() {
		return applicantemail;
	}

	public void setApplicantemail(String applicantemail) {
		this.applicantemail = applicantemail;
	}

	public String getApplicantaadhaar() {
		return applicantaadhaar;
	}

	public void setApplicantaadhaar(String applicantaadhaar) {
		this.applicantaadhaar = applicantaadhaar;
	}

	public String getApplicantpan() {
		return applicantpan;
	}

	public void setApplicantpan(String applicantpan) {
		this.applicantpan = applicantpan;
	}

	public String getApplicantsalary() {
		return applicantsalary;
	}

	public void setApplicantsalary(String applicantsalary) {
		this.applicantsalary = applicantsalary;
	}

	public String getLoanamountrequired() {
		return loanamountrequired;
	}

	public void setLoanamountrequired(String loanamountrequired) {
		this.loanamountrequired = loanamountrequired;
	}

	public String getLoanrepaymentmonths() {
		return loanrepaymentmonths;
	}

	public void setLoanrepaymentmonths(String loanrepaymentmonths) {
		this.loanrepaymentmonths = loanrepaymentmonths;
	}

}
