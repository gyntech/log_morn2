package com.hay.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calcu9")
public class Calc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "rollNo", nullable = false)
	private String rollNo;
	
	@Column(name = "s1")
	private float S1;
	
	@Column(name = "s2")
	private float S2;
	
	@Column(name = "s3")
	private float S3;
	
	@Column(name = "s4")
	private float S4;
	
	@Column(name = "s5")
	private float S5;
	
	@Column(name = "s6")
	private float S6;
	
	@Column(name = "s7")
	private double S7;
	
	@Column(name = "s8")
	private double S8;
	
	@Column(name = "s9")
	private double S9;
	
	@Column(name = "s10")
	private double S10;
	
	@Column(name = "s11")
	private double S11;
	
	@Column(name = "s12")
	private double S12;
	
	@Column(name = "s13")
	private double S13;
	
	@Column(name = "s14")
	private double S14;
	
	@Column(name = "s15")
	private double S15;
	
	public float getTotal() {
        return S1 + S2 + S3 + S4 + S5;
    }
	
	public float step7() {
		return S5 - S2;
	}
	
	public float step9() {
		return S6 - S3;
	}
	
	
	public float step10() {
		return step9() / step7();
	}
	
	
	public float step13() {
		return S2 * step10();
	}
	
	public float step14() {
		return S3 - step13();
	}
	
	
	
	public Calc(String rollNo, float s1, float s2, float s3, float s4, float s5, float s6, double s7, double s8, double s9, double s10, double s11, double s12, double s13, double s14, double s15) {
		super();
		this.rollNo = rollNo;
		S1 = s1;
		S2 = s2;
		S3 = s3;
		S4 = s4;
		S5 = s5;
		S6 = s6;
		S7 = s7;
		S8 = s8;
		S9 = s9;
		S10 = s10;
		S11 = s11;
		S12 = s12;
		S13 = s13;
		S14 = s14;
		S15 = s15;
		
	}




	public Calc() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getRollNo() {
		return rollNo;
	}




	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}




	public float getS1() {
		return S1;
	}




	public void setS1(float s1) {
		S1 = s1;
	}




	public float getS2() {
		return S2;
	}




	public void setS2(float s2) {
		S2 = s2;
	}
	

	public float getS3() {
		return S3;
	}




	public void setS3(float s3) {
		S3 = s3;
	}




	public float getS4() {
		return S4;
	}




	public void setS4(float s4) {
		S4 = s4;
	}
	

	public float getS5() {
		return S5;
	}




	public void setS5(float s5) {
		S5 = s5;
	}




	public float getS6() {
		return S6;
	}




	public void setS6(float s6) {
		S6 = s6;
	}
	

	public double getS7() {
		return S7;
	}




	public void setS7(double s7) {
		S7 = s7;
	}




	public double getS8() {
		return S8;
	}




	public void setS8(double s8) {
		S8 = s8;
	}
	

	public double getS9() {
		return S9;
	}




	public void setS9(double s9) {
		S9 = s9;
	}




	public double getS10() {
		return S10;
	}



	public void setS10(double s10) {
		S10 = s10;
	}
	
	public double getS11() {
		return S11;
	}




	public void setS11(double s11) {
		S11 = s11;
	}




	public double getS12() {
		return S12;
	}




	public void setS12(double s12) {
		S12 = s12;
	}
	

	
	public double getS13() {
		return S13;
	}



	public void setS13(double s13) {
		S13 = s13;
	}
	
	
	public double getS14() {
		return S14;
	}




	public void setS14(double s14) {
		S14 = s14;
	}




	public double getS15() {
		return S15;
	}




	public void setS15(double s15) {
		S15 = s15;
	}

	
	



}







