package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PaymentDAO;
/** CODE ON SECTION #4: First Project*/
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDAO dao;
	
	public PaymentDAO getDao() {
		return dao;
	}
	
	public void setDao(PaymentDAO dao) {
		this.dao = dao;
	}

	@Override
	public int sum(int a, int b) {
		return a + b ;
	}
	
	
	
}
