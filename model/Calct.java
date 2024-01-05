package com.hay.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calct")
public class Calct {
	
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
	
	
	public double ang() {
		return S1 / S5 ;
	}
	
	
	public double ang5() {
		return Math.asin(ang()) * 57.2958 ;
	}
	
	
	public double angc() {
		return S2 / S5 ;
	}
	
	
	public double ang5c() {
		return Math.asin(ang()) * 57.2958 ;
	}
	
	
	
	public double angb() {
		return S3 / S5 ;
	}
	
	
	public double ang5b() {
		return Math.asin(angb()) * 57.2958 ;
	}
	
	
	public double angbc() {
		return S3 / S5 ;
	}
	
	
	public double ang5bc() {
		return Math.asin(angbc()) * 57.2958 ;
	}
	
	
	public double side3() {
		return Math.sin(Math.toRadians(S7));
	}
	
	public double side3c() {
		return Math.cos(Math.toRadians(S7));
	}
	
	
	public double side3b() {
		return side3() * S6 ;
	}
	
	public double side3bround() {
		return Math.round(side3b()*1000.0)/1000.0;
	}
	
	public double side3bc() {
		return side3c() * S6 ;
	}
	
	public double side3bcround() {
		return Math.round(side3bc()*1000.0)/1000.0;
	}
	
	public double dep2() {
		return S11 / S12 ;
	}
	
	public double dep2b() {
		return S12 / S13 ;
	}
	
	public double dep5() {
		return Math.atan(dep2()) * 57.2958 ;
	}
	
	public double dep5round() {
		return Math.round(dep5()*1000.0)/1000.0;
	}
	
	public double dep5b() {
		return Math.acos(dep2b()) * 57.2958 ;
	}
	
	public double dep5bround() {
		return Math.round(dep5b()*1000.0)/1000.0;
	}
	
	
	public double ele2() {
		return S14 / S15 ;
	}
	
	public double ele2b() {
		return S15 / S16 ;
	}
	
	public double ele5() {
		return Math.atan(ele2()) * 57.2958 ;
	}
	
	public double ele5round() {
		return Math.round(ele5()*1000.0)/1000.0;
	}
	
	public double ele5b() {
		return Math.acos(ele2b()) * 57.2958 ;
	}
	
	public double ele5bround() {
		return Math.round(ele5b()*1000.0)/1000.0;
	}
	
	
	
	
	public double hyp3() {
		return Math.sin(Math.toRadians(S10));
	}
	
	public double hyp3round() {
		return Math.round(hyp3()*1000.0)/1000.0;
	}
	
	
	public double hyp3b() {
		return S8 * S8;
	}
	
	public double hyp3bc() {
		return S9 * S9;
	}
	
	
	public double hyp4() {
		return hyp3b() + hyp3bc();
	}
	
	public double hyp4n() {
		return S8 / hyp3round();
	}
	
	public double hyp4nround() {
		return Math.round(hyp4n()*1000.0)/1000.0;
	}
	
	public double hyp4nb() {
		return Math.sqrt(hyp4());
	}
	
	public double hyp4nbround() {
		return Math.round(hyp4nb()*1000.0)/1000.0;
	}
	
	public double height3() {
		return Math.tan(Math.toRadians(S19));
	}
	
	public double height3b() {
		return Math.sin(Math.toRadians(S19));
	}
	
	public double height4() {
		return height3() * S17 ;
	}
	
	public double height4round() {
		return Math.round(height4()*1000.0)/1000.0;
	}
	
	public double height4b() {
		return height3b() * S18 ;
	}
	
	public double height4bround() {
		return Math.round(height4b()*1000.0)/1000.0;
	}
	
	public double adjacent3() {
		return Math.tan(Math.toRadians(S22));
	}
	
	public double adjacent3b() {
		return Math.cos(Math.toRadians(S22));
	}
	
	public double adjacent4() {
		return S20 / adjacent3() ;
	}
	
	public double adjacent4round() {
		return Math.round(adjacent4()*1000.0)/1000.0;
	}
	
	public double adjacent4b() {
		return adjacent3b() * S21;
	}
	
	public double adjacent4bround() {
		return Math.round(adjacent4b()*1000.0)/1000.0;
	}
	
	
	
	
	
	public double edhy3() {
		return Math.sin(Math.toRadians(S25));
	}
	
	public double edhy3b() {
		return S23 * S23;
	}
	
	public double edhy3bc() {
		return S24 * S24;
	}
	
	public double edhy4b() {
		return edhy3b() + edhy3bc();
	}
	
	public double edhy4bn() {
		return Math.sqrt(edhy4b());
	}
	
	public double edhy4bnround() {
		return Math.round(edhy4bn()*1000.0)/1000.0;
	}
	
	public double edhy4n() {
		return S23 / edhy3();
	}
	
	public double edhy4nround() {
		return Math.round(edhy4n()*1000.0)/1000.0;
	}
	
	
	
	
	
	
	
	

	public double sin3bc() {
		return Math.sin(Math.toRadians(S28));
	}
	
	public double sin3bcround() {
		return Math.round(sin3bc()*1000.0)/1000.0;
	}
	
	public double sin3nbc() {
		return Math.sin(Math.toRadians(S30));
	}
	
	public double sin3nbcround() {
		return Math.round(sin3nbc()*1000.0)/1000.0;
	}
	

	public double sin3bcmultiply() {
		return sin3bcround() * S31;
	}
	

	public double sin3nbcmultiply() {
		return sin3nbcround() * S29;
	}
	

	public double sin4bclast() {
		return sin3bcmultiply() / sin3nbcround();
	}
	
	public double sin4bclastround() {
		return Math.round(sin4bclast()*1000.0)/1000.0;
	}
	

	public double sin4nbclast() {
		return sin3nbcmultiply() / sin3bcround();
	}
	
	public double sin4nbclastround() {
		return Math.round(sin4nbclast()*1000.0)/1000.0;
	}
	
	
	
	
	
	


	public double sin3ac() {
		return Math.sin(Math.toRadians(S26));
	}
	
	public double sin3acround() {
		return Math.round(sin3ac()*1000.0)/1000.0;
	}
	
	public double sin3nac() {
		return Math.sin(Math.toRadians(S30));
	}
	
	public double sin3nacround() {
		return Math.round(sin3nac()*1000.0)/1000.0;
	}
	

	public double sin3acmultiply() {
		return sin3acround() * S31;
	}
	

	public double sin3nacmultiply() {
		return sin3nacround() * S27;
	}
	

	public double sin4aclast() {
		return sin3acmultiply() / sin3nacround();
	}
	
	public double sin4aclastround() {
		return Math.round(sin4aclast()*1000.0)/1000.0;
	}
	

	public double sin4naclast() {
		return sin3nacmultiply() / sin3acround();
	}
	
	public double sin4naclastround() {
		return Math.round(sin4naclast()*1000.0)/1000.0;
	}
	
	
	
	
	
	
	

	public double sin3ab() {
		return Math.sin(Math.toRadians(S26));
	}
	
	public double sin3abround() {
		return Math.round(sin3ab()*1000.0)/1000.0;
	}
	
	public double sin3nab() {
		return Math.sin(Math.toRadians(S28));
	}
	
	public double sin3nabround() {
		return Math.round(sin3nab()*1000.0)/1000.0;
	}
	

	public double sin3abmultiply() {
		return sin3abround() * S29;
	}
	

	public double sin3nabmultiply() {
		return sin3nabround() * S27;
	}
	

	public double sin4ablast() {
		return sin3abmultiply() / sin3nabround();
	}
	
	public double sin4ablastround() {
		return Math.round(sin4ablast()*1000.0)/1000.0;
	}
	

	public double sin4nablast() {
		return sin3nabmultiply() / sin3abround();
	}
	
	public double sin4nablastround() {
		return Math.round(sin4nablast()*1000.0)/1000.0;
	}
	
	
	
	
	
	
	
	public double sin3agab() {
		return Math.sin(Math.toRadians(S32));
	}
	
	
	public double sin3agnab() {
		return Math.sin(Math.toRadians(S34));
	}
	
	

	public double sin4agab() {
		return sin3agnab() * S33;
	}
	
	

	public double sin4agnab() {
		return sin3agab() * S35;
	}
	

	public double sin4bagab() {
		return sin4agab() / S35;
	}
	
	
	public double sin4bagnab() {
		return sin4agnab() / S33;
	}
	

	public double sin5agab() {
		return Math.asin(sin4bagab()) * 57.2958 ;
	}
	
	public double sin5agabround() {
		return Math.round(sin5agab()*1000.0)/1000.0;
	}
	

	public double sin5agnab() {
		return Math.asin(sin4bagnab()) * 57.2958 ;
	}
	
	public double sin5agnabround() {
		return Math.round(sin5agnab()*1000.0)/1000.0;
	}
	
	
	
	
	
	

	public double sin3agac() {
		return Math.sin(Math.toRadians(S32));
	}
	
	
	public double sin3agnac() {
		return Math.sin(Math.toRadians(S36));
	}
	
	

	public double sin4agac() {
		return sin3agnac() * S33;
	}
	
	

	public double sin4agnac() {
		return sin3agac() * S37;
	}
	

	public double sin4bagac() {
		return sin4agac() / S37;
	}
	
	
	public double sin4bagnac() {
		return sin4agnac() / S33;
	}
	

	public double sin5agac() {
		return Math.asin(sin4bagac()) * 57.2958 ;
	}
	
	public double sin5agacround() {
		return Math.round(sin5agac()*1000.0)/1000.0;
	}
	

	public double sin5agnac() {
		return Math.asin(sin4bagnac()) * 57.2958 ;
	}
	
	public double sin5agnacround() {
		return Math.round(sin5agnac()*1000.0)/1000.0;
	}
	
	
	
	
	
	
	


	public double sin3agbc() {
		return Math.sin(Math.toRadians(S34));
	}
	
	
	public double sin3agnbc() {
		return Math.sin(Math.toRadians(S36));
	}
	
	

	public double sin4agbc() {
		return sin3agnbc() * S35;
	}
	
	

	public double sin4agnbc() {
		return sin3agbc() * S37;
	}
	

	public double sin4bagbc() {
		return sin4agbc() / S37;
	}
	
	
	public double sin4bagnbc() {
		return sin4agnbc() / S35;
	}
	

	public double sin5agbc() {
		return Math.asin(sin4bagbc()) * 57.2958 ;
	}
	
	public double sin5agbcround() {
		return Math.round(sin5agbc()*1000.0)/1000.0;
	}
	

	public double sin5agnbc() {
		return Math.asin(sin4bagnbc()) * 57.2958 ;
	}
	
	public double sin5agnbcround() {
		return Math.round(sin5agnbc()*1000.0)/1000.0;
	}
	
	
	
	
	

	public double cos2a() {
		return S39 * S39;
	}
	

	public double cos2b() {
		return S41 * S41;
	}
	

	public double cos2c() {
		return S43 * S43;
	}
	
	public double cos2bc() {
		return 2 * S41 * S43;
	}
	
	public double cos2acos() {
		return Math.cos(Math.toRadians(S38));
	}
	
	public double cos3p() {
		return cos2b() + cos2c();
	}
	
	public double cos3m() {
		return cos2bc() * cos2acos();
	}
	
	public double cos4s() {
		return cos3p() - cos3m();
	}
	
	public double cos4sn() {
		return cos2a() - cos3p();
	}
	
	public double cos7() {
		return Math.sqrt(cos4s());
	}
	
	public double cos7round() {
		return Math.round(cos7()*1000.0)/1000.0;
	}
	
	public double cos7n() {
		return cos4sn() / (-cos2bc());
	}
	
	public double cos7nlast() {
		return Math.acos(cos7n()) * 57.2958 ;
	}
	
	public double cos7nlastround() {
		return Math.round(cos7nlast()*1000.0)/1000.0;
	}
	
	
	
	
	
	
	
	

	
	
	public double cos2ac() {
		return 2 * S39 * S43;
	}
	
	public double cos2bcos() {
		return Math.cos(Math.toRadians(S40));
	}
	
	public double cos3bp() {
		return cos2a() + cos2c();
	}
	
	public double cos3bm() {
		return cos2ac() * cos2bcos();
	}
	
	public double cos4bs() {
		return cos3bp() - cos3bm();
	}
	
	public double cos4bsn() {
		return cos2b() - cos3bp();
	}
	
	public double cos7b() {
		return Math.sqrt(cos4bs());
	}
	
	public double cos7bround() {
		return Math.round(cos7b()*1000.0)/1000.0;
	}
	
	public double cos7bn() {
		return cos4bsn() / (-cos2ac());
	}
	
	public double cos7bnlast() {
		return Math.acos(cos7bn()) * 57.2958 ;
	}
	
	public double cos7bnlastround() {
		return Math.round(cos7bnlast()*1000.0)/1000.0;
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	public double cos2ab() {
		return 2 * S39 * S41;
	}
	
	public double cos2ccos() {
		return Math.cos(Math.toRadians(S42));
	}
	
	public double cos3cp() {
		return cos2a() + cos2b();
	}
	
	public double cos3cm() {
		return cos2ab() * cos2ccos();
	}
	
	public double cos4cs() {
		return cos3cp() - cos3cm();
	}
	
	public double cos4csn() {
		return cos2c() - cos3cp();
	}
	
	public double cos7c() {
		return Math.sqrt(cos4cs());
	}
	
	public double cos7cround() {
		return Math.round(cos7c()*1000.0)/1000.0;
	}
	
	public double cos7cn() {
		return cos4csn() / (-cos2ab());
	}
	
	public double cos7cnlast() {
		return Math.acos(cos7cn()) * 57.2958 ;
	}
	
	public double cos7cnlastround() {
		return Math.round(cos7cnlast()*1000.0)/1000.0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public float step2se() {
        return S7 - 1;
    }
	
	
	public float step9se() {
		return step2se() * -1;
	}

	
	public double gp3a() {
		return Math.pow(S21, S23) ;
	}
	
	
	public double gproot() {
		return Math.pow(S43, 1/S45) ;
	}
	
	public double gpa() {
		return Math.log(S50) / Math.log(S25) ;
	}
	
	
	
	public Calct(String rollNo, float s1, float s2, float s3, float s4, float s5, float s6, float s7, float s8, float s9, float s10, float s11, float s12, float s13, float s14, float s15,
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




	public Calct() {
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








