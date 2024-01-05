package com.hay.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calcq4")
public class Calcq {
	
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
	private int S11;
	
	@Column(name = "s12")
	private int S12;
	
	@Column(name = "s13")
	private int S13;
	
	@Column(name = "s14")
	private int S14;
	
	@Column(name = "s15")
	private int S15;
	
	@Column(name = "s16")
	private int S16;
	
	@Column(name = "s17")
	private int S17;
	
	@Column(name = "s18")
	private int S18;
	
	@Column(name = "s19")
	private int S19;
	
	@Column(name = "s20")
	private int S20;
	
	@Column(name = "s21")
	private int S21;
	
	@Column(name = "s22")
	private int S22;
	
	@Column(name = "s23")
	private int S23;
	
	@Column(name = "s24")
	private int S24;
	
	@Column(name = "s25")
	private int S25;
	
	@Column(name = "s26")
	private int S26;
	
	@Column(name = "s27")
	private int S27;
	
	@Column(name = "s28")
	private int S28;
	
	@Column(name = "s29")
	private int S29;
	
	@Column(name = "s30")
	private int S30;
	
	@Column(name = "s31")
	private int S31;
	
	@Column(name = "s32")
	private int S32;
	
	@Column(name = "s33")
	private int S33;
	
	@Column(name = "s34")
	private int S34;
	
	@Column(name = "s35")
	private int S35;
	
	public float getTotal() {
        return S1 + S2 + S3 + S4 + S5;
    }
	
	public float step5q() {
		return S2 * S2;
	}
	
	public float step4ac() {
		return 4 * S1 * S3;
	}
	
	public float step2a() {
		return 2 * S1;
	}
	
	public float stepb() {
		return -1 * S2;
	}
	
	public float step6() {
		return -1 * step4ac();
	}
	
	public float step7() {
		return step5q() + step6();
	}
	
	public double step8() {
		return Math.sqrt(step7());
	}
	
	public double step10p() {
		return stepb() + step8();
	}
	
	public double step10m() {
		return stepb() - step8();
	}
	
	public double step11p() {
		return step10p() / step2a();
	}
	
	public double step11m() {
		return step10m() / step2a();
	}
	
	
	
	
	
	
	
	
	
	public String ss2() {
		int result;
		result = Integer.signum(S2);
		
		if (result == 1) {
			return " + " + Integer.toString(S2);
		}
		
		return Integer.toString(S2);
	}
	
	
	
	public String ss3() {
		int result;
		result = Integer.signum(S3);
		
		if (result == 1) {
			return " + " + Integer.toString(S3);
		}
		
		return Integer.toString(S3);
	}
	
	
	
	
	public String ss9() {
		int result;
		result = Integer.signum(S9);
		
		if (result == 1) {
			return " + " + Integer.toString(S9);
		}
		
		return Integer.toString(S9);
	}
	
	
	
	
	
	
	public String ss15() {
		int result;
		result = Integer.signum(S15);
		
		if (result == 1) {
			return " + " + Integer.toString(S15);
		}
		
		return Integer.toString(S15);
	}
	
	
	
	
	
	public String ss16() {
		int result;
		result = Integer.signum(S16);
		
		if (result == 1) {
			return " + " + Integer.toString(S16);
		}
		
		return Integer.toString(S16);
	}
	
	
	
	
	
	
	
		
		
		
		public String root1() {
			int result;
			
			result = Integer. signum(S4 * -1);
			
			if (result== 1) {
				return " + " + Integer.toString(S4 * -1);
			}
			return Integer.toString(S4 * -1);
		}
		
		
		
		
		
		
		
		public String root2() {
			int result;
			
			result = Integer. signum(S6 * -1);
			
			if (result== 1) {
				return " + " + Integer.toString(S6 * -1);
			}
			return Integer.toString(S6 * -1);
		}
		
		
		
		
		
		
		
		public int sqr() {
			return S5 * S7;
		}
		
		
		public int lin1() {
			return S5 * S6 * -1;
		}
		
		
		public int lin2() {
			return S4 * S7 * -1;
		}
		
		
		public int cons() {
			return S4 * S6;
		}
		
		
		
		
		public String opensqrstr() {
			if(S5 * S7 == 1) {
				return "";
			}
			
			return Integer.toString(S5 * S7);
		}
		
		
		
		
		public String linstr1() {
			int result;
			
			result = Integer. signum(lin1());
			
			if (result== 1) {
				return " + " + Integer.toString(lin1());
			}
			
			return Integer.toString(lin1());
		}
		
		
		
		
		

		public String linstr2() {
			int result;
			
			result = Integer. signum(lin2());
			
			if (result== 1) {
				return " + " + Integer.toString(lin2());
			}
			
			return Integer.toString(lin2());
		}
		
		
		
		
		
		public String constr() {
			int result;
			
			result = Integer. signum(cons());
			
			if (result== 1) {
				return " + " + Integer.toString(cons());
			}
			
			return Integer.toString(cons());
		}
		
		
		
		
		
		public int sumlin() {
			return lin1() + lin2();
		}
		
		 
		 
	
		public String sumlinstr() {
			int result;
			
			result = Integer. signum(sumlin());
			
			if (result== 1) {
				return " + " + Integer.toString(sumlin());
			}
			
			return Integer.toString(sumlin());
		}
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		

		int hcfan=1;
		
		public int hcf1() {
		for (int i = 1; i <= step10p() || i <= step2a() ; i++)
		{
		if (step10p() % i == 0 && step2a() % i == 0)
			hcfan = i;
		}
		return hcfan;
		}
		
		
		
		public int ansnum1() {
			if(step10p() % step2a() != 0) {
				return (int) step10p() /hcf1();
		
			}
		return (int)step11p();
		}
		
		
		
		public int ansden1 () {
			if(step10p() % step2a() != 0) {
				return (int) step2a() / hcf1 () ;
			}
		return (int)step11p();
		}
		
		
		
		
		
		
		int hcfan2=1;
		public int hcf2() {
		for (int i = 1; i <= step10m() || i <= step2a() ; i++)
			{
		if (step10m() % i == 0 && step2a() % i == 0)
			hcfan2 = i;
		
			}
		
			return hcfan2;

		}
			
			
			
			
			
		public int ansnum2() {
			if(step10m() % step2a() != 0) {
				return (int)step10m() /hcf2();
		
			}
		
			return (int)step11m();
		
		}

			
			
			
		public int ansden2() {
			if(step10m() % step2a() != 0) {
				return (int)step2a()/hcf2();
		
			}
			return (int) step11m();
		}

			
			
			
		public String ans1() {
			if(step10p() % step2a() != 0) {
				return ansnum1() + "/" + ansden1 ();
		
			}
		
			return Double.toString (step11p());
		}

			
			
			
			
		public String ans2() {
			if(step10m() % step2a() != 0) {
				return ansnum2() + "/" + ansden2();
			}
			return Double.toString(step11p());
		}
			
		
		
		
		
		
		public String ansnex1() {
			if(step10p() % step2a() != 0) {
				return ansden1() + "x = " + ansnum1() ;
			}
			return
			" x = " + Double. toString(step11p());
		}
			
			
			
			public String ansnex2() {
				if (step10m() % step2a() != 0) {
					return ansden2() +  "x = " + ansnum2();
				}
				return " x =" + Double.toString (step11m());
			}
			
			
			
			public String ansnex11() {
				if (step10p() % step2a() != 0) {
					int result;
					
					result = Integer.signum(ansnum1());
					
					if (result== -1) {
			return "(" + ansden1() + "x " + " + " + Integer.toString(-1 * ansnum1()) + ")";
				}
					
					return "(" + ansden1() + "x " + (-1 * ansnum1()) + ")";
			}
				
			int result;
			
			result = Integer. signum(ansnum1());
			
			if (result== -1) {
				return " (x + " + Double.toString(step11p() * -1) + ")";
				}
			 return " (x " + Double.toString(step11p() * -1) + ")";
			 
			}
			
			
			
			
			
			
			

			public String ansnex22() {
				if (step10m() % step2a() != 0) {
					int result;
					
					result = Integer.signum(ansnum2());
					
					if (result== -1) {
			return "(" + ansden2() + "x " + " + " + Integer.toString(-1 * ansnum2()) + ")";
				}
					
					return "(" + ansden2() + "* " + (-1 * ansnum2()) + ")";
			}
				
			int result;
			
			result = Integer. signum(ansnum2());
			
			if (result== -1) {
				return " (x + " + Double.toString(step11m() * -1) + ")";
				}
			 return " (x " + Double.toString(step11m() * -1) + ")";
			 
			}
			
			
			
			
			
			
			public String onestr() {
				if (S8 == ansden1() && S9 == (-1 * ansnum1()))  {
					return ansnex22();
				}
				else if(S8 == ansden2() && S9 == (-1 * ansnum2())) {
					return ansnex11();
				}
				return "Wrong Input";
			}
			
			
			
			
			
			
			
			
			
		
		
			int hcfsp=1;
			
			public int hcfs1() {
			for (int i = 1; i <= S15 || i <= S14 ; i++)
			{
			if (S15 % i == 0 && S14 % i == 0)
				hcfsp = i;
			}
			return hcfsp;
			}
			
			
			
			public int spnum1() {
				if(S15 % S14 != 0) {
					return (int) S15 / hcfs1();
			
				}
			return (int)S15 / S14;
			}
			
			
			
			public int spden1 () {
				if(S15 % S14 != 0) {
					return (int) S14 / hcfs1 () ;
				}
			return (int)S15 / S14;
			}
			
			
			
			
			
			

			int hcfp=1;
			
			public int hcfp1() {
			for (int i = 1; i <= S16 || i <= S14 ; i++)
			{
			if (S16 % i == 0 && S14 % i == 0)
				hcfp = i;
			}
			return hcfp;
			}
			
			
			
			public int pnum1() {
				if(S16 % S14 != 0) {
					return (int) S16 / hcfp1();
			
				}
			return (int)S16 / S14;
			}
			
			
			
			public int pden1 () {
				if(S16 % S14 != 0) {
					return (int) S14 / hcfp1 () ;
				}
			return (int)S16 / S14;
			}
			
			
			
			
			
			

			
			
			
			public String sumro() {
				if(S15 % S14 != 0) {
					
					return (-1 * spnum1()) + "/" + spden1 ();
				}
				return Integer.toString((S15 * -1) / S14);
			}
			
			
			
			public String proro() {
				if(S16 % S14 != 0) {
					
					return pnum1() + "/" + pden1 ();
				}
				return Integer.toString(S16 / S14);
			}
			
			
			
		
		
		
		

			public int lcm3done() {
				if (S11 == 0 || S13 ==0) {
			        return 0;
			    }
			    int absNumber1 = Math.abs(S11);
			    int absNumber2 = Math.abs(S13);
			    int absHigherNumber = Math.max(absNumber1, absNumber2);
			    int absLowerNumber = Math.min(absNumber1, absNumber2);
			    int lcm3 = absHigherNumber;
			    while (lcm3 % absLowerNumber != 0) {
			        lcm3 += absHigherNumber;
			    }
			    return lcm3;
			 
			        }
			
			
		

			public String sumstr() {
				int result;
				
				result = Integer. signum(-1 * S10);
				
				if (result== 1) {
					return " + " + Integer.toString(-1 * S10);
				}
				
				return Integer.toString(-1 * S10);
			}
				
			
			
			
			
			public String prostr() {
				int result;
				
				result = Integer. signum(S12);
				
				if (result== 1) {
					return " + " + Integer.toString(S12);
				}
				
				return Integer.toString(S12);
			}
			
			
			
			
			
			public int finalsum() {
				if(S11 == 0) {
					return 100000000;
				}
				return (lcm3done() * S10 * -1) / S11;
			}
			
			
			public int finalpro() {
				if(S13 == 0) {
					return 100000000;
				}
				return (lcm3done() * S12) / S13;
			}
				
			
			
			public String fsumstr() {
				int result;
				
				result = Integer. signum(finalsum());
				
				if (result== 1) {
					return " + " + Integer.toString(finalsum());
				}
				return Integer.toString(finalsum());
			}
			
			
			
			
			
			public String fprostr() {
				int result;
				
				result = Integer. signum(finalpro());
				
				if (result== 1) {
					return " + " + Integer.toString(finalpro());
				}
				return Integer.toString(finalpro());
			}
	
	
	
	
	
	
	
	
	public Calcq(String rollNo, int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15,
			int s16, int s17, int s18, int s19, int s20, int s21, int s22, int s23, int s24, int s25, int s26, int s27, int s28, int s29, int s30, 
			int s31, int s32, int s33, int s34, int s35) {
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
	}




	public Calcq() {
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
	
	public int getS11() {
		return S11;
	}




	public void setS11(int s11) {
		S11 = s11;
	}




	public int getS12() {
		return S12;
	}




	public void setS12(int s12) {
		S12 = s12;
	}
	

	
	public int getS13() {
		return S13;
	}



	public void setS13(int s13) {
		S13 = s13;
	}
	
	
	public int getS14() {
		return S14;
	}




	public void setS14(int s14) {
		S14 = s14;
	}




	public int getS15() {
		return S15;
	}




	public void setS15(int s15) {
		S15 = s15;
	}

	
	

	public int getS16() {
		return S16;
	}




	public void setS16(int s16) {
		S16 = s16;
	}
	

	public int getS17() {
		return S17;
	}




	public void setS17(int s17) {
		S17 = s17;
	}




	public int getS18() {
		return S18;
	}




	public void setS18(int s18) {
		S18 = s18;
	}
	

	public int getS19() {
		return S19;
	}




	public void setS19(int s19) {
		S19 = s19;
	}




	public int getS20() {
		return S20;
	}



	public void setS20(int s20) {
		S20 = s20;
	}

	

	public int getS21() {
		return S21;
	}




	public void setS21(int s21) {
		S21 = s21;
	}




	public int getS22() {
		return S22;
	}




	public void setS22(int s22) {
		S22 = s22;
	}
	

	public int getS23() {
		return S23;
	}




	public void setS23(int s23) {
		S23 = s23;
	}




	public int getS24() {
		return S24;
	}




	public void setS24(int s24) {
		S24 = s24;
	}
	

	public int getS25() {
		return S25;
	}




	public void setS25(int s25) {
		S25 = s25;
	}




	public int getS26() {
		return S26;
	}




	public void setS26(int s26) {
		S26 = s26;
	}
	

	public int getS27() {
		return S27;
	}




	public void setS27(int s27) {
		S27 = s27;
	}




	public int getS28() {
		return S28;
	}




	public void setS28(int s28) {
		S28 = s28;
	}
	

	public int getS29() {
		return S29;
	}




	public void setS29(int s29) {
		S29 = s29;
	}




	public int getS30() {
		return S30;
	}



	public void setS30(int s30) {
		S30 = s30;
	}
	
	


	public int getS31() {
		return S31;
	}




	public void setS31(int s31) {
		S31 = s31;
	}




	public int getS32() {
		return S32;
	}




	public void setS32(int s32) {
		S32 = s32;
	}
	

	public int getS33() {
		return S33;
	}




	public void setS33(int s33) {
		S33 = s33;
	}




	public int getS34() {
		return S34;
	}




	public void setS34(int s34) {
		S34 = s34;
	}
	

	public int getS35() {
		return S35;
	}




	public void setS35(int s35) {
		S35 = s35;
	}



	


}








