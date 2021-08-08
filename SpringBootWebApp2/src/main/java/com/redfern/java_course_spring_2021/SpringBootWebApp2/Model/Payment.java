package com.redfern.java_course_spring_2021.SpringBootWebApp2.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="payment_generator")
	@SequenceGenerator(name="payment_generator", 
					   sequenceName="payment_seq", 
					   initialValue=3000, 
					   allocationSize=100)
	@Column(name="payment_id", updatable=false, nullable=false)
	private Long paymentId;
	
	@Column(name="payment_type")
	private String paymentType;
	
	@Column(name="payment_amount")
	private int amount;

	public Payment() {
		super();
	}

	public Long getPaymentId() {
		return paymentId;
	}

//	public void setPaymentId(Long paymentId) {
//		this.paymentId = paymentId;
//	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
