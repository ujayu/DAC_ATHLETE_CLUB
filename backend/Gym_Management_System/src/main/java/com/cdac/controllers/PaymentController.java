package com.cdac.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.pojos.GymMember;
import com.cdac.pojos.Payment;
import com.cdac.pojos.User;
import com.cdac.service.GymMemberService;
import com.cdac.service.PaymentService;
import com.cdac.service.UserService;

@RestController
@CrossOrigin
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@Autowired
	private GymMemberService gymMemberService;
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/payments")
	public ResponseEntity<List<Payment>> findAll(){
		List<Payment> list = paymentService.findAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PostMapping("payments/make_payment")
	public ResponseEntity<Payment> make_payment(@RequestBody Payment payment){
		int memberId = payment.getMember().getMemberId();
		GymMember gm = gymMemberService.findById(memberId);
		gm.setPayment_status(true);
		payment.setMember(gm);
		Payment pmt = paymentService.makePayment(payment);
		return ResponseEntity.ok(pmt);
	}
	
	@DeleteMapping("paymets/delete/{delete_id}")
	public void delete(@PathVariable("delte_id") int id) {
		paymentService.deleteById(id);
	}
	
}
