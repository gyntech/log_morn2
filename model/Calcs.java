package com.hay.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calcs9")
public class Calcs {
	
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
	private float S7;
	
	@Column(name = "s8")
	private float S8;
	
	@Column(name = "s9")
	private float S9;
	
	@Column(name = "s10")
	private float S10;
	
	@Column(name = "s11")
	private float S11;
	
	@Column(name = "s12")
	private float S12;
	
	@Column(name = "s13")
	private float S13;
	
	@Column(name = "s14")
	private float S14;
	
	@Column(name = "s15")
	private float S15;
	
	@Column(name = "s16")
	private float S16;
	
	@Column(name = "s17")
	private float S17;
	
	@Column(name = "s18")
	private float S18;
	
	@Column(name = "s19")
	private float S19;
	
	@Column(name = "s20")
	private float S20;
	
	@Column(name = "s21")
	private float S21;
	
	@Column(name = "s22")
	private float S22;
	
	@Column(name = "s23")
	private float S23;
	
	@Column(name = "s24")
	private float S24;
	
	@Column(name = "s25")
	private float S25;
	
	@Column(name = "s26")
	private float S26;
	
	@Column(name = "s27")
	private float S27;
	
	@Column(name = "s28")
	private float S28;
	
	@Column(name = "s29")
	private float S29;
	
	@Column(name = "s30")
	private float S30;
	
	@Column(name = "s31")
	private float S31;
	
	@Column(name = "s32")
	private float S32;
	
	@Column(name = "s33")
	private float S33;
	
	@Column(name = "s34")
	private float S34;
	
	@Column(name = "s35")
	private float S35;
	
	@Column(name = "s36")
	private float S36;
	
	@Column(name = "s37")
	private float S37;
	
	@Column(name = "s38")
	private float S38;
	
	@Column(name = "s39")
	private float S39;
	
	@Column(name = "s40")
	private float S40;
	
	@Column(name = "s41")
	private float S41;
	
	@Column(name = "s42")
	private float S42;
	
	@Column(name = "s43")
	private float S43;
	
	@Column(name = "s44")
	private float S44;
	
	@Column(name = "s45")
	private float S45;
	
	@Column(name = "s46")
	private float S46;
	
	@Column(name = "s47")
	private float S47;
	
	@Column(name = "s48")
	private float S48;
	
	@Column(name = "s49")
	private float S49;
	
	@Column(name = "s50")
	private float S50;
	
	
	
	public float step2() {
        return S3 - 1;
    }
	
	
	
	
	public float step2se() {
        return S7 - 1;
    }
	
	public float step2sa() {
        return S28 - 1;
    }
	

	public float step2se2() {
        return S8 - 1;
    }
	
	public float step9se() {
		return step2se() * -1;
	}
	
	public float step2n() {
		return S30 * -1;
	}
	
	public float step10se() {
		return step9se() * +1;
	}
	
	public float step13sed() {
		return step10se() + step2se2();
	}
	
	public float step3n() {
		return S32 + step2n();
	}
	
	public float step5n() {
		return -S31 * -1;
	}
	

	public float step6n() {
		return step3n() + step5n();
	}
	
	public float step7n() {
		return step6n() / S31;
	}
	
	
	public float step13se() {
		return S9 * -1;
	}
	
	public float step4a() {
		return step3sa() * -1;
	}
	
	public float step14se() {
		return S10 + step13se();
	}
	
	public float step15se() {
		return step14se() / step13sed();
	}
	
	public float step18se() {
		return step10se() * step15se();
	}
	
	public float step3sa() {
		return step2sa() * S27;
	}
	
	public float step19se() {
		return S9 + step18se();
	}
	
	public float step5sa() {
		return S29 + step4a();
	}
	
	public float step22se() {
		return S17 - 1;
	}
	
	public float step23se() {
		return step22se() * step15se();
	}
	
	public float step24se() {
		return step19se() + step23se();
	}
	
	public float step3() {
		return step2() * S2;
	}
	
	public float step4() {
		return step3() + S1;
	}
	
	public float step9() {
		return S6 - S3;
	}
	
	public float step3cd() {
		return S5 - 1;
	}
	
	public float step5cd() {
		return -1 * S4;
	}
	
	public float step6cd() {
		return S6 + step5cd();
	}
	
	public float step8cd() {
		return step6cd() / step3cd();
	}
	
	
	
	
	public float sum3a() {
		return S13 / 2 ;
	}

	public float sum3b() {
		return S11 * 2 ;
	}
	
	public float sum3c() {
		return S13 - 1 ;
	}
	
	public float sum3d() {
		return sum3c() * S12 ;
	}
	
	public float sum4() {
		return sum3b() + sum3d() ;
	}
	
	public float sum5() {
		return sum3a() * sum4() ;
	}
	
	
	
	
	
	
	public float gp2() {
		return S16 - 1 ;
	}
	
	public float gp2r() {
		return S19 - 1 ;
	}
	
	public float gp2a() {
		return S22 - 1 ;
	}
	
	public double gp3() {
		return Math.pow(S15, gp2()) ;
	}
	
	public double gp3a() {
		return Math.pow(S21, gp2a()) ;
	}
	
	public double gp5() {
		return S14 * gp3() ;
	}
	
	public double gp5r() {
		return S20 / S18 ;
	}
	
	public double gp5a() {
		return S23 / gp3a() ;
	}
	
	public double gp3n() {
		return S26 / S24 ;
	}
	
	public double gp6n() {
		return gp3n() * S25 ;
	}
	
	public double gproot() {
		return Math.pow(gp5r(), 1/gp2r()) ;
	}
	
	public double gpa() {
		return Math.log(gp6n()) / Math.log(S25) ;
	}
	
	
	public double gpsg2() {
		return Math.pow(S34, S35) ;
	}
	
	public float gpsg2ad() {
		return S34 - 1 ;
	}
	
	public double gpsg2l() {
		return Math.pow(S37, S38) ;
	}
	
	public double gps2l() {
		return  1 - S37 ;
	}
	
	
	public double gpsg3() {
		return  gpsg2() - 1 ;
	}
	
	
	public double gpsg5() {
		return  S33 * gpsg3() ;
	}
	
	
	public double gpsg6g() {
		return  gpsg5() / gpsg2ad() ;
	}
	
	
	
	public double gps3l() {
		return  1 - gpsg2l() ;
	}
	
	public double gpsg6() {
		return gps3l() * S36 ;
	}
	
	
	public double gpsg7() {
		return gpsg6() / gps2l() ;
	}
	
	
	
	
	
	
	public Calcs(String rollNo, float s1, float s2, float s3, float s4, float s5, float s6, float s7, float s8, float s9, float s10, float s11, float s12, float s13, float s14, float s15,
			float s16, float s17, float s18, float s19, float s20, float s21, float s22, float s23, float s24, float s25, float s26, float s27, float s28, float s29, float s30, 
			 float s31, float s32, float s33, float s34, float s35, float s36, float s37, float s38, float s39, float s40, 
			 float s41, float s42, float s43, float s44, float s45, float s46, float s47, float s48, float s49, float s50) {
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
		S16 = s16;
		S17 = s17;
		S18 = s18;
		S19 = s19;
		S20 = s20;
		S21 = s21;
		S22 = s22;
		S23 = s23;
		S24 = s24;
		S25 = s25;
		S26 = s26;
		S27 = s27;
		S28 = s28;
		S29 = s29;
		S30 = s30;
		S31 = s31;
		S32 = s32;
		S33 = s33;
		S34 = s34;
		S35 = s35;
		S36 = s36;
		S37 = s37;
		S38 = s38;
		S39 = s39;
		S40 = s40;
		S41 = s41;
		S42 = s42;
		S43 = s43;
		S44 = s44;
		S45 = s45;
		S46 = s46;
		S47 = s47;
		S48 = s48;
		S49 = s49;
		S50 = s50;
		
	}




	public Calcs() {
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
	

	public float getS7() {
		return S7;
	}




	public void setS7(float s7) {
		S7 = s7;
	}




	public float getS8() {
		return S8;
	}




	public void setS8(float s8) {
		S8 = s8;
	}
	

	public float getS9() {
		return S9;
	}




	public void setS9(float s9) {
		S9 = s9;
	}




	public float getS10() {
		return S10;
	}



	public void setS10(float s10) {
		S10 = s10;
	}
	
	public float getS11() {
		return S11;
	}




	public void setS11(float s11) {
		S11 = s11;
	}




	public float getS12() {
		return S12;
	}




	public void setS12(float s12) {
		S12 = s12;
	}
	

	
	public float getS13() {
		return S13;
	}



	public void setS13(float s13) {
		S13 = s13;
	}
	
	
	public float getS14() {
		return S14;
	}




	public void setS14(float s14) {
		S14 = s14;
	}




	public float getS15() {
		return S15;
	}




	public void setS15(float s15) {
		S15 = s15;
	}

	
	
	public float getS16() {
		return S16;
	}




	public void setS16(float s16) {
		S16 = s16;
	}
	

	public float getS17() {
		return S17;
	}




	public void setS17(float s17) {
		S17 = s17;
	}




	public float getS18() {
		return S18;
	}




	public void setS18(float s18) {
		S18 = s18;
	}
	

	public float getS19() {
		return S19;
	}




	public void setS19(float s19) {
		S19 = s19;
	}




	public float getS20() {
		return S20;
	}



	public void setS20(float s20) {
		S20 = s20;
	}

	

	public float getS21() {
		return S21;
	}




	public void setS21(float s21) {
		S21 = s21;
	}




	public float getS22() {
		return S22;
	}




	public void setS22(float s22) {
		S22 = s22;
	}
	

	public float getS23() {
		return S23;
	}




	public void setS23(float s23) {
		S23 = s23;
	}




	public float getS24() {
		return S24;
	}




	public void setS24(float s24) {
		S24 = s24;
	}
	

	public float getS25() {
		return S25;
	}




	public void setS25(float s25) {
		S25 = s25;
	}




	public float getS26() {
		return S26;
	}




	public void setS26(float s26) {
		S26 = s26;
	}
	

	public float getS27() {
		return S27;
	}




	public void setS27(float s27) {
		S27 = s27;
	}




	public float getS28() {
		return S28;
	}




	public void setS28(float s28) {
		S28 = s28;
	}
	

	public float getS29() {
		return S29;
	}




	public void setS29(float s29) {
		S29 = s29;
	}




	public float getS30() {
		return S30;
	}



	public void setS30(float s30) {
		S30 = s30;
	}
	
	


	public float getS31() {
		return S31;
	}




	public void setS31(float s31) {
		S31 = s31;
	}




	public float getS32() {
		return S32;
	}




	public void setS32(float s32) {
		S32 = s32;
	}
	

	public float getS33() {
		return S33;
	}




	public void setS33(float s33) {
		S33 = s33;
	}




	public float getS34() {
		return S34;
	}




	public void setS34(float s34) {
		S34 = s34;
	}
	

	public float getS35() {
		return S35;
	}




	public void setS35(float s35) {
		S35 = s35;
	}




	public float getS36() {
		return S36;
	}




	public void setS36(float s36) {
		S36 = s36;
	}
	

	public float getS37() {
		return S37;
	}




	public void setS37(float s37) {
		S37 = s37;
	}




	public float getS38() {
		return S38;
	}




	public void setS38(float s38) {
		S38 = s38;
	}
	

	public float getS39() {
		return S39;
	}




	public void setS39(float s39) {
		S39 = s39;
	}




	public float getS40() {
		return S40;
	}



	public void setS40(float s40) {
		S40 = s40;
	}
	
	


	public float getS41() {
		return S41;
	}




	public void setS41(float s41) {
		S41 = s41;
	}




	public float getS42() {
		return S42;
	}




	public void setS42(float s42) {
		S42 = s42;
	}
	

	public float getS43() {
		return S43;
	}




	public void setS43(float s43) {
		S43 = s43;
	}




	public float getS44() {
		return S44;
	}




	public void setS44(float s44) {
		S44 = s44;
	}
	

	public float getS45() {
		return S45;
	}




	public void setS45(float s45) {
		S45 = s45;
	}




	public float getS46() {
		return S46;
	}




	public void setS46(float s46) {
		S46 = s46;
	}
	

	public float getS47() {
		return S47;
	}




	public void setS47(float s47) {
		S47 = s47;
	}




	public float getS48() {
		return S48;
	}




	public void setS48(float s48) {
		S48 = s48;
	}
	

	public float getS49() {
		return S49;
	}




	public void setS49(float s49) {
		S49 = s49;
	}




	public float getS50() {
		return S50;
	}



	public void setS50(float s50) {
		S50 = s50;
	}
	

}







