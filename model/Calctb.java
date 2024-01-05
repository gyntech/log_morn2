package com.hay.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calctb9")
public class Calctb {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "rollNo", nullable = false)
	private String rollNo;
	
	@Column(name = "s1")
	private int S1;
	
	@Column(name = "s2")
	private int S2;
	
	@Column(name = "s3")
	private int S3;
	
	@Column(name = "s4")
	private int S4;
	
	@Column(name = "s5")
	private int S5;
	
	@Column(name = "s6")
	private int S6;
	
	@Column(name = "s7")
	private int S7;
	
	@Column(name = "s8")
	private int S8;
	
	@Column(name = "s9")
	private int S9;
	
	@Column(name = "s10")
	private int S10;
	
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
	private String S40;
	
	@Column(name = "s41")
	private String S41;
	
	@Column(name = "s42")
	private String S42;
	
	@Column(name = "s43")
	private String S43;
	
	@Column(name = "s44")
	private String S44;
	
	@Column(name = "s45")
	private String S45;
	
	@Column(name = "s46")
	private String S46;
	
	@Column(name = "s47")
	private String S47;
	
	@Column(name = "s48")
	private String S48;
	
	@Column(name = "s49")
	private String S49;
	
	@Column(name = "s50")
	private String S50;
	
	
	
	
	
	public double degc() {  
		return 90 - S5;  
		}
	
	public double degb() {  
		return 180 - S7;  
		}
	
	public double degac() {  
		return S5 + degc();  
		}
	
	public double degd() {  
		return S7 - degac();  
		}
	
	public double degm() {  
		return degc() + degd();  
		}
	
	public double degsol1() {  
		return (S6 * S6) + (S8 * S8);  
		}
	
	public double degsol2() {  
		return 2 * (S6 * S8);  
		}
	
	public double degcos() {
		return Math.cos(Math.toRadians(degm()));
	}
	
	public double degmul() {  
		return degsol2() * degcos();  
		}
	
	public double degsub() {  
		return degsol1() - degmul();  
		}
	
	public double degroot() {
		return Math.sqrt(degsub());
	}
	
	public double degrootround() {
		return Math.round(degroot()*1000.0)/1000.0;
	}
	
	
	
	
	
	
	public Calctb(String rollNo, int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, float s11, float s12, float s13, float s14, float s15,
			float s16, float s17, float s18, float s19, float s20, float s21, float s22, float s23, float s24, float s25, float s26, float s27, float s28, float s29, float s30, 
			 float s31, float s32, float s33, float s34, float s35, float s36, float s37, float s38, float s39, String s40, 
			 String s41, String s42, String s43, String s44, String s45, String s46, String s47, String s48, String s49, String s50) {
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




	public Calctb() {
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




	public int getS1() {
		return S1;
	}




	public void setS1(int s1) {
		S1 = s1;
	}




	public int getS2() {
		return S2;
	}




	public void setS2(int s2) {
		S2 = s2;
	}
	

	public int getS3() {
		return S3;
	}




	public void setS3(int s3) {
		S3 = s3;
	}




	public int getS4() {
		return S4;
	}




	public void setS4(int s4) {
		S4 = s4;
	}
	

	public int getS5() {
		return S5;
	}




	public void setS5(int s5) {
		S5 = s5;
	}




	public int getS6() {
		return S6;
	}




	public void setS6(int s6) {
		S6 = s6;
	}
	

	public int getS7() {
		return S7;
	}




	public void setS7(int s7) {
		S7 = s7;
	}




	public int getS8() {
		return S8;
	}




	public void setS8(int s8) {
		S8 = s8;
	}
	

	public int getS9() {
		return S9;
	}




	public void setS9(int s9) {
		S9 = s9;
	}




	public int getS10() {
		return S10;
	}



	public void setS10(int s10) {
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




	public String getS40() {
		return S40;
	}



	public void setS40(String s40) {
		S40 = s40;
	}
	
	


	public String getS41() {
		return S41;
	}




	public void setS41(String s41) {
		S41 = s41;
	}




	public String getS42() {
		return S42;
	}




	public void setS42(String s42) {
		S42 = s42;
	}
	

	public String getS43() {
		return S43;
	}




	public void setS43(String s43) {
		S43 = s43;
	}




	public String getS44() {
		return S44;
	}




	public void setS44(String s44) {
		S44 = s44;
	}
	

	public String getS45() {
		return S45;
	}




	public void setS45(String s45) {
		S45 = s45;
	}




	public String getS46() {
		return S46;
	}




	public void setS46(String s46) {
		S46 = s46;
	}
	

	public String getS47() {
		return S47;
	}




	public void setS47(String s47) {
		S47 = s47;
	}




	public String getS48() {
		return S48;
	}




	public void setS48(String s48) {
		S48 = s48;
	}
	

	public String getS49() {
		return S49;
	}




	public void setS49(String s49) {
		S49 = s49;
	}




	public String getS50() {
		return S50;
	}



	public void setS50(String s50) {
		S50 = s50;
	}
	

}








