package com.cdac.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.PaymentDao;
import com.cdac.pojos.Payment;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentDao paymentDao;
	
	@Override
	public List<Payment> findAll() {
		List<Payment> list = paymentDao.findAll();
		return list;
	}

	@Override
	public Payment makePayment(Payment payment) {
		Payment pmt = paymentDao.save(payment);
		return pmt;
	}

	@Override
	public void deleteById(int paymentId) {
		paymentDao.deleteById(paymentId);
		
	}

}
