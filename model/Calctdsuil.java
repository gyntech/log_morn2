package com.hay.model;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "log1")
public class Calctdsuil {
	
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
	
	
	
	 public Integer su(){

	      for(int i = 2; i<=S1; i++){
	        if(S1%i==0)
	          return i;
	      }

	      return 1;
	   }
	 
	 public String ssu() {
		 return String.valueOf(su() + " * ");
	 }
	 
	 

	 public int su2d(){
		 return S1 / su();
	 }
	 
	 public Integer su2(){

	      for(int i = 2; i<=su2d(); i++){
	        if(su2d()%i==0)
	          return i;
	      }

	      return 1;
	   }
    
	 

	 public int su3d(){
		 return S1 / su() / su2();
	 }
	 
	 public Integer su3(){

	      for(int i = 2; i<=su3d(); i++){
	        if(su3d()%i==0)
	          return i;
	      }

	      return 1;
	   }
    
	
	 

	 public int su4d(){
		 return S1 / su() / su2() / su3();
	 }
	 
	 public Integer su4(){

	      for(int i = 2; i<=su4d(); i++){
	        if(su4d()%i==0)
	          return i;
	      }

	      return 1;
	   }
    
	 

	 public int su5d(){
		 return S1 / su() / su2() / su3()/ su4();
	 }
	 
	 public Integer su5(){

	      for(int i = 2; i<=su5d(); i++){
	        if(su5d()%i==0)
	          return i;
	      }

	      return 1;
	   }
    
	 

	 public int su6d(){
		 return S1 / su() / su2() / su3()/ su4() / su5();
	 }
	 
	 public Integer su6(){

	      for(int i = 2; i<=su6d(); i++){
	        if(su6d()%i==0)
	          return i;
	      }

	      return 1;
	   }
    
	 
	 

	 public int su7d(){
		 return S1 / su() / su2() / su3()/ su4() / su5() / su6();
	 }
	 
	 public Integer su7(){

	      for(int i = 2; i<=su7d(); i++){
	        if(su7d()%i==0)
	          return i;
	      }

	      return 1;
	   }
    
	 
	 
	 

	 public int su8d(){
		 return S1 / su() / su2() / su3()/ su4() / su5() / su6() / su7();
	 }
	 
	 public Integer su8(){

	      for(int i = 2; i<=su8d(); i++){
	        if(su8d()%i==0)
	          return i;
	      }

	      return 1;
	   }
    
	 

	 public int su9d(){
		 return S1 / su() / su2() / su3()/ su4() / su5() / su6() / su7() / su8();
	 }
	 
	 public Integer su9(){

	      for(int i = 2; i<=su9d(); i++){
	        if(su9d()%i==0)
	          return i;
	      }

	      return 1;
	   }
    
	 

	 public int su10d(){
		 return S1 / su() / su2() / su3()/ su4() / su5() / su6() / su7() / su8() / su9();
	 }
	 
	 public Integer su10(){

	      for(int i = 2; i<=su10d(); i++){
	        if(su10d()%i==0)
	          return i;
	      }

	      return 1;
	   }
	 
	 
	 
	 
	 
	 
	 public Integer sho2() {  

		 int [] a= {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

		     for (int value: a)
		     if (value == 2)
		         return 2;
		     
		     return null;
		 }
	 
	 

public int numsho2() {
	if (sho2()==null) {
		 return 1;
	 }
		return sho2();
}


	 
	 
	 
	 
	 
	 public Integer sho3() {  

		 int [] a= {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

		     for (int value: a)
		     if (value == 3)
		         return 3;
		     
		     return null;
		 }
	 
	 

public int numsho3() {
	if (sho3()==null) {
		 return 1;
	 }
		return sho3();
}


	 
	
	 
	 
	 public String shostr3() {
		 if (sho3()==null) {
			 return "";
		 }
			return String.valueOf("*" + sho3());
		}
	 
	 
	 
	 
	 public Integer sho5() {  

		 int [] a= {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

		     for (int value: a)
		     if (value == 5)
		         return 5;
		     
		     return null;
		 }
	 
	 

public int numsho5() {
	if (sho5()==null) {
		 return 1;
	 }
		return sho5();
}


	 
	 
	 
	 public String shostr5() {
		 if (sho5()==null) {
			 return "";
		 }
			return String.valueOf("*" + sho5());
		}
	 
	 
	 
	 
	 public Integer sho7() {  

		 int [] a= {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

		     for (int value: a)
		     if (value == 7)
		         return 7;
		     
		     return null;
		 }
	 
	 
	 

public int numsho7() {
	if (sho7()==null) {
		 return 1;
	 }
		return sho7();
}


	 
	
	 
	 
	 public String shostr7() {
		 if (sho7()==null) {
			 return "";
		 }
			return String.valueOf("*" + sho7());
		}
	 
	 
	 
	 
	 public Integer sho11() {  

		 int [] a= {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

		     for (int value: a)
		     if (value == 11)
		         return 11;
		     
		     return null;
		 }
	 
	 
	 

public int numsho11() {
	if (sho11()==null) {
		 return 1;
	 }
		return sho11();
}


	 
	
	 
	 public String shostr11() {
		 if (sho11()==null) {
			 return "";
		 }
			return String.valueOf("*" + sho11());
		}
	 
	 
	 
	 
	 public Integer sho13() {  

		 int [] a= {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

		     for (int value: a)
		     if (value == 13)
		         return 13;
		     
		     return null;
		 }
	 
	 
	 

public int numsho13() {
	if (sho13()==null) {
		 return 1;
	 }
		return sho13();
}


	 
	
	 
	 public String shostr13() {
		 if (sho13()==null) {
			 return "";
		 }
			return String.valueOf("*" + sho13());
		}
	 
	 
	
	 
	 
	 


public int shocomb() {
	return numsho2() * numsho3() * numsho5() * numsho7() * numsho11() * numsho13();
}


	 
	 


public int t2() {  

int a[] = {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

 int x = 2;
 
 int n = a.length;



	int count = 0;
    for (int i=0; i < n; i++)
    if (a[i] == x)
        count++;
    
    return count;
}




public String t2str() {
	 if (t2()==0) {
		 return "";
	 }
		return String.valueOf(t2());
	}








public int t3() {  

int a[] = {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

 int x = 3;
 
 int n = a.length;



	int count = 0;
    for (int i=0; i < n; i++)
    if (a[i] == x)
        count++;
    
    return count;
}






public String t3str() {
	 if (t3()==0) {
		 return "";
	 }
		return String.valueOf(t3());
	}






	 


public int t5() {  

int a[] = {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

 int x = 5;
 
 int n = a.length;



	int count = 0;
    for (int i=0; i < n; i++)
    if (a[i] == x)
        count++;
    
    return count;
}







public String t5str() {
	 if (t5()==0) {
		 return "";
	 }
		return String.valueOf(t5());
	}






	 
	 


public int t7() {  

int a[] = {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

 int x = 7;
 
 int n = a.length;



	int count = 0;
    for (int i=0; i < n; i++)
    if (a[i] == x)
        count++;
    
    return count;
}







public String t7str() {
	 if (t7()==0) {
		 return "";
	 }
		return String.valueOf(t7());
	}






	 



public int t11() {  

int a[] = {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

 int x = 11;
 
 int n = a.length;



	int count = 0;
    for (int i=0; i < n; i++)
    if (a[i] == x)
        count++;
    
    return count;
}






public String t11str() {
	 if (t11()==0) {
		 return "";
	 }
		return String.valueOf(t11());
	}






	 


public int t13() {  

int a[] = {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

 int x = 13;
 
 int n = a.length;



	int count = 0;
    for (int i=0; i < n; i++)
    if (a[i] == x)
        count++;
    
    return count;
}






public String t13str() {
	 if (t13()==0) {
		 return "";
	 }
		return String.valueOf(t13());
	}








public int t17() {  

int a[] = {su() , su2() , su3(), su4() , su5() , su6() , su7() , su8() , su9() , su10()};

 int x = 17;
 
 int n = a.length;



	int count = 0;
    for (int i=0; i < n; i++)
    if (a[i] == x)
        count++;
    
    return count;
}
	



public int powadd() {
	return (t2()*S35) + (t3()*S35) + (t5()*S35) + (t7()*S35) + (t11()*S35) + (t13()*S35);
}





public int num2() {
	if (t2()==0) {
		 return 1;
	 }
		return t2();
}


public int num3() {
	if (t3()==0) {
		 return 1;
	 }
		return t3();
}


public int num5() {
	if (t5()==0) {
		 return 1;
	 }
		return t5();
}


public int num7() {
	if (t7()==0) {
		 return 1;
	 }
		return t7();
}


public int num11() {
	if (t11()==0) {
		 return 1;
	 }
		return t11();
}


public int num13() {
	if (t13()==0) {
		 return 1;
	 }
		return t13();
}


public int numcomb() {
	return num2() * num3() * num5() * num7() * num11() * num13();
}


public Double numsqr() {
	return Math.pow(S21, 1.0/numcomb());
}



public int numint() {
	return numsqr().intValue();
}



 


public int sudiv2() {
	return t2()/2;
}
	 

public int sudiv3() {
	return t3()/2;
}
	 

public int sudiv5() {
	return t5()/2;
}
	 

public int sudiv7() {
	return t7()/2;
}
	 

public int sudiv11() {
	return t11()/2;
}
	 

public int sudiv13() {
	return t13()/2;
}
	 

public int sudiv17() {
	return t17()/2;
}


public String str2() {
	return String.valueOf(2);
}


public String str3() {
	return String.valueOf(3);
}


public String str5() {
	return String.valueOf(5);
}


public String str7() {
	return String.valueOf(7);
}


public String str11() {
	return String.valueOf(11);
}


public String str13() {
	return String.valueOf(13);
}

public String str17() {
	return String.valueOf(17);
}



public String app2() {
	
	return String.join(" * ", Collections.nCopies(sudiv2(), String.valueOf(2)));
}	 
    



public String app3() {
	
	return String.join(" * ", Collections.nCopies(sudiv3(), String.valueOf(3)));
}	 
    



public String app5() {
	return String.join(" * ", Collections.nCopies(sudiv5(), String.valueOf(5)));
}	 
    


public String app7() {
	return String.join(" * ", Collections.nCopies(sudiv7(), String.valueOf(7)));
}	 
    



public String app11() {
	return String.join(" * ", Collections.nCopies(sudiv11(), String.valueOf(11)));
}	 
    



public String app13() {
	return String.join(" * ", Collections.nCopies(sudiv13(), String.valueOf(13)));
}	 
    



public String app17() {
	return String.join(" * ", Collections.nCopies(sudiv17(), String.valueOf(17)));
}	 
    



	


public double mul2() {
	return Math.pow(2, sudiv2());
}




public double rem2(){

     return Math.pow(2, t2()) / Math.pow(mul2(), 2);
  }



public int left2(){

     for(int i = 2; i<=S1; i++){
       if((rem2() ==2) || (t2() ==1))
         return 2;
     }

     return 1;
  }
	





public double mul3() {
	return Math.pow(3, sudiv3());
}




public double rem3(){

     return Math.pow(3, t3()) / Math.pow(mul3(), 2);
  }



public int left3(){

     for(int i = 3; i<=5; i++){
       if(rem3() ==3 || t3() ==1)
         return 3;
     }

     return 1;
  }
	




public double mul5() {
	return Math.pow(5, sudiv5());
}




public double rem5(){

     return Math.pow(5, t5()) / Math.pow(mul5(), 2);
  }



public int left5(){

     for(int i = 5; i<=5; i++){
       if(rem5() ==5 || t5() ==1)
         return 5;
     }

     return 1;
  }
	



	



public double mul7() {
	return Math.pow(7, sudiv7());
}




public double rem7(){

     return Math.pow(7, t7()) / Math.pow(mul7(), 2);
  }



public int left7(){

     for(int i = 7; i<=7; i++){
       if(rem7() ==7 || t7() ==1)
         return 7;
     }

     return 1;
  }
	


public double mul11() {
	return Math.pow(11, sudiv11());
}




public double rem11(){

     return Math.pow(11, t11()) / Math.pow(mul11(), 2);
  }



public int left11(){

     for(int i = 11; i<=11; i++){
       if(rem11() ==11 || t11() ==1)
         return 11;
     }

     return 1;
  }
	


public int mulout(){
	return (int)(mul2() * mul3() * mul5() * mul7() * mul11()); 
}
	
public int leftout(){
	return (int)(left2() * left3() * left5() * left7() * left11()); 
}	













































public int bsu(){

     for(int i = 2; i<=S2; i++){
       if(S2%i==0)
         return i;
     }

     return 1;
  }


public int bsu2d(){
	 return S2 / bsu();
}

public int bsu2(){

     for(int i = 2; i<=bsu2d(); i++){
       if(bsu2d()%i==0)
         return i;
     }

     return 1;
  }



public int bsu3d(){
	 return S2 / bsu() / bsu2();
}

public int bsu3(){

     for(int i = 2; i<=bsu3d(); i++){
       if(bsu3d()%i==0)
         return i;
     }

     return 1;
  }




public int bsu4d(){
	 return S2 / bsu() / bsu2() / bsu3();
}

public int bsu4(){

     for(int i = 2; i<=bsu4d(); i++){
       if(bsu4d()%i==0)
         return i;
     }

     return 1;
  }



public int bsu5d(){
	 return S2 / bsu() / bsu2() / bsu3()/ bsu4();
}

public int bsu5(){

     for(int i = 2; i<=bsu5d(); i++){
       if(bsu5d()%i==0)
         return i;
     }

     return 1;
  }



public int bsu6d(){
	 return S2 / bsu() / bsu2() / bsu3()/ bsu4() / bsu5();
}

public int bsu6(){

     for(int i = 2; i<=bsu6d(); i++){
       if(bsu6d()%i==0)
         return i;
     }

     return 1;
  }




public int bsu7d(){
	 return S2 / bsu() / bsu2() / bsu3()/ bsu4() / bsu5() / bsu6();
}

public int bsu7(){

     for(int i = 2; i<=bsu7d(); i++){
       if(bsu7d()%i==0)
         return i;
     }

     return 1;
  }





public int bsu8d(){
	 return S2 / bsu() / bsu2() / bsu3()/ bsu4() / bsu5() / bsu6() / bsu7();
}

public int bsu8(){

     for(int i = 2; i<=bsu8d(); i++){
       if(bsu8d()%i==0)
         return i;
     }

     return 1;
  }



public int bsu9d(){
	 return S2 / bsu() / bsu2() / bsu3()/ bsu4() / bsu5() / bsu6() / bsu7() / bsu8();
}

public int bsu9(){

     for(int i = 2; i<=bsu9d(); i++){
       if(bsu9d()%i==0)
         return i;
     }

     return 1;
  }



public int bsu10d(){
	 return S2 / bsu() / bsu2() / bsu3()/ bsu4() / bsu5() / bsu6() / bsu7() / bsu8() / bsu9();
}

public int bsu10(){

     for(int i = 2; i<=bsu10d(); i++){
       if(bsu10d()%i==0)
         return i;
     }

     return 1;
  }







public Integer bsho2() {  

	 int [] a= {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

	     for (int value: a)
	     if (value == 2)
	         return 2;
	     
	     return null;
	 }



public int bnumsho2() {
	if (bsho2()==null) {
		 return 1;
	 }
		return bsho2();
}




public Integer bsho3() {  

	 int [] a= {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

	     for (int value: a)
	     if (value == 3)
	         return 3;
	     
	     return null;
	 }




public int bnumsho3() {
	if (bsho3()==null) {
		 return 1;
	 }
		return bsho3();
}




public String bshostr3() {
	 if (bsho3()==null) {
		 return "";
	 }
		return String.valueOf("*" + bsho3());
	}



public int bnumsho5() {
	if (bsho5()==null) {
		 return 1;
	 }
		return bsho5();
}



public Integer bsho5() {  

	 int [] a= {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

	     for (int value: a)
	     if (value == 5)
	         return 5;
	     
	     return null;
	 }



public String bshostr5() {
	 if (bsho5()==null) {
		 return "";
	 }
		return String.valueOf("*" + bsho5());
	}


public int bnumsho7() {
	if (bsho7()==null) {
		 return 1;
	 }
		return bsho7();
}




public Integer bsho7() {  

	 int [] a= {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

	     for (int value: a)
	     if (value == 7)
	         return 7;
	     
	     return null;
	 }



public String bshostr7() {
	 if (bsho7()==null) {
		 return "";
	 }
		return String.valueOf("*" + bsho7());
	}




public Integer bsho11() {  

	 int [] a= {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

	     for (int value: a)
	     if (value == 11)
	         return 11;
	     
	     return null;
	 }



public int bnumsho11() {
	if (bsho11()==null) {
		 return 1;
	 }
		return bsho11();
}




public String bshostr11() {
	 if (bsho11()==null) {
		 return "";
	 }
		return String.valueOf("*" + bsho11());
	}




public Integer bsho13() {  

	 int [] a= {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

	     for (int value: a)
	     if (value == 13)
	         return 13;
	     
	     return null;
	 }



public int bnumsho13() {
	if (bsho13()==null) {
		 return 1;
	 }
		return bsho13();
}




public String bshostr13() {
	 if (bsho13()==null) {
		 return "";
	 }
		return String.valueOf("*" + bsho13());
	}






public int bshocomb() {
	return bnumsho2() * bnumsho3() * bnumsho5() * bnumsho7() * bnumsho11() * bnumsho13();
}








public int bt2() {  

int a[] = {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

int x = 2;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public String bt2str() {
	 if (bt2()==0) {
		 return "";
	 }
		return String.valueOf(bt2());
	}






public int bt3() {  

int a[] = {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

int x = 3;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public String bt3str() {
	 if (bt3()==0) {
		 return "";
	 }
		return String.valueOf(bt3());
	}








public int bt5() {  

int a[] = {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

int x = 5;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public String bt5str() {
	 if (bt5()==0) {
		 return "";
	 }else if(bt2() != 0 && bt5() != 0) {
		 return "";
	 }
		return String.valueOf(bt5());
	}









public int bt7() {  

int a[] = {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

int x = 7;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public String bt7str() {
	 if (bt7()==0) {
		 return "";
	 }
		return String.valueOf(bt7());
	}









public int bt11() {  

int a[] = {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

int x = 11;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public String bt11str() {
	 if (bt11()==0) {
		 return "";
	 }
		return String.valueOf(bt11());
	}








public int bt13() {  

int a[] = {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

int x = 13;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public String bt13str() {
	 if (bt13()==0) {
		 return "";
	 }
		return String.valueOf(bt13());
	}



public int bnum2() {
	if (bt2()==0) {
		 return 1;
	 }
		return bt2();
}


public int bnum3() {
	if (bt3()==0) {
		 return 1;
	 }
		return bt3();
}


public int bnum5() {
	if (bt5()==0) {
		 return 1;
	 }
		return bt5();
}


public int bnum7() {
	if (bt7()==0) {
		 return 1;
	 }
		return bt7();
}


public int bnum11() {
	if (bt11()==0) {
		 return 1;
	 }
		return bt11();
}


public int bnum13() {
	if (bt13()==0) {
		 return 1;
	 }
		return bt13();
}


public int bnumcomb() {
	return bnum2() * bnum3() * bnum5() * bnum7() * bnum11() * bnum13();
}


public Double bnumsqr() {
	return Math.pow(S22, 1.0/bnumcomb());
}



public int bnumint() {
	return bnumsqr().intValue();
}


public int nummul() {
	return numint() * bnumint() ;
}



public Integer basesim() {
	if(shocomb()==bshocomb())
		return shocomb();
	return null;
}



public String notbase() {
	if(basesim()==null) {
		return "since the base is not the samne, we stop here";
	}
	
	return Integer.toString(basesim());
}






















public Integer ansu(){

     for(int i = 2; i<=numint(); i++){
       if(numint()%i==0)
         return i;
     }

     return 1;
  }

public String anssu() {
	 return String.valueOf(ansu());
}



public int ansu2d(){
	 return numint() / ansu();
}

public Integer ansu2(){

     for(int i = 2; i<=ansu2d(); i++){
       if(ansu2d()%i==0)
         return i;
     }

     return 1;
  }


public String anssu2() {
	 return String.valueOf(ansu2());
}



public int ansu3d(){
	 return numint() / ansu() / ansu2();
}

public Integer ansu3(){

     for(int i = 2; i<=ansu3d(); i++){
       if(ansu3d()%i==0)
         return i;
     }

     return 1;
  }




public String anssu3() {
	 return String.valueOf(ansu3());
}





public int ansu4d(){
	 return numint() / ansu() / ansu2() / ansu3();
}

public Integer ansu4(){

     for(int i = 2; i<=ansu4d(); i++){
       if(ansu4d()%i==0)
         return i;
     }

     return 1;
  }




public String anssu4() {
	 return String.valueOf(ansu4());
}




public int ansu5d(){
	 return numint() / ansu() / ansu2() / ansu3()/ ansu4();
}

public Integer ansu5(){

     for(int i = 2; i<=ansu5d(); i++){
       if(ansu5d()%i==0)
         return i;
     }

     return 1;
  }




public String anssu5() {
	 return String.valueOf(ansu5());
}




public int ansu6d(){
	 return numint() / ansu() / ansu2() / ansu3()/ ansu4() / ansu5();
}

public Integer ansu6(){

     for(int i = 2; i<=ansu6d(); i++){
       if(ansu6d()%i==0)
         return i;
     }

     return 1;
  }




public String anssu6() {
	 return String.valueOf(ansu6());
}





public int ansu7d(){
	 return numint() / ansu() / ansu2() / ansu3()/ ansu4() / ansu5() / ansu6();
}

public Integer ansu7(){

     for(int i = 2; i<=ansu7d(); i++){
       if(ansu7d()%i==0)
         return i;
     }

     return 1;
  }





public String anssu7() {
	 return String.valueOf(ansu7());
}





public int ansu8d(){
	 return numint() / ansu() / ansu2() / ansu3()/ ansu4() / ansu5() / ansu6() / ansu7();
}

public Integer ansu8(){

     for(int i = 2; i<=ansu8d(); i++){
       if(ansu8d()%i==0)
         return i;
     }

     return 1;
  }




public String anssu8() {
	 return String.valueOf(ansu8());
}




public int ansu9d(){
	 return numint() / ansu() / ansu2() / ansu3()/ ansu4() / ansu5() / ansu6() / ansu7() / ansu8();
}

public Integer ansu9(){

     for(int i = 2; i<=ansu9d(); i++){
       if(ansu9d()%i==0)
         return i;
     }

     return 1;
  }




public String anssu9() {
	 return String.valueOf(ansu9());
}




public int ansu10d(){
	 return numint() / ansu() / ansu2() / ansu3()/ ansu4() / ansu5() / ansu6() / ansu7() / ansu8() / ansu9();
}

public Integer ansu10(){

     for(int i = 2; i<=ansu10d(); i++){
       if(ansu10d()%i==0)
         return i;
     }

     return 1;
  }





public String anssu10() {
	 return String.valueOf(ansu10());
}



public int ansu100(){
	if(S22 % S2 == 0) {
		return S22 / S2;
	}
	 return numint() / ansu() / ansu2() / ansu3()/ ansu4() / ansu5() / ansu6() / ansu7() / ansu8() / ansu9();
}





public Integer ansho2() {  

	 int [] a= {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

	     for (int value: a)
	     if (value == 2)
	         return 2;
	     
	     return null;
	 }



public int annumsho2() {
if (ansho2()==null) {
	 return 1;
}
	return ansho2();
}







public Integer ansho3() {  

	 int [] a= {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

	     for (int value: a)
	     if (value == 3)
	         return 3;
	     
	     return null;
	 }



public int annumsho3() {
if (ansho3()==null) {
	 return 1;
}
	return ansho3();
}






public String anshostr3() {
	 if (ansho3()==null) {
		 return "";
	 }
		return String.valueOf("*" + ansho3());
	}




public Integer ansho5() {  

	 int [] a= {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

	     for (int value: a)
	     if (value == 5)
	         return 5;
	     
	     return null;
	 }



public int annumsho5() {
if (ansho5()==null) {
	 return 1;
}
	return ansho5();
}





public String anshostr5() {
	 if (ansho5()==null) {
		 return "";
	 }
		return String.valueOf("*" + ansho5());
	}




public Integer ansho7() {  

	 int [] a= {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

	     for (int value: a)
	     if (value == 7)
	         return 7;
	     
	     return null;
	 }




public int annumsho7() {
if (ansho7()==null) {
	 return 1;
}
	return ansho7();
}






public String anshostr7() {
	 if (ansho7()==null) {
		 return "";
	 }
		return String.valueOf("*" + ansho7());
	}




public Integer ansho11() {  

	 int [] a= {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

	     for (int value: a)
	     if (value == 11)
	         return 11;
	     
	     return null;
	 }




public int annumsho11() {
if (ansho11()==null) {
	 return 1;
}
	return ansho11();
}





public String anshostr11() {
	 if (ansho11()==null) {
		 return "";
	 }
		return String.valueOf("*" + ansho11());
	}




public Integer ansho13() {  

	 int [] a= {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

	     for (int value: a)
	     if (value == 13)
	         return 13;
	     
	     return null;
	 }




public int annumsho13() {
if (ansho13()==null) {
	 return 1;
}
	return ansho13();
}





public String anshostr13() {
	 if (ansho13()==null) {
		 return "";
	 }
		return String.valueOf("*" + ansho13());
	}








public int anshocomb() {
return annumsho2() * annumsho3() * annumsho5() * annumsho7() * annumsho11() * annumsho13();
}






public int ant2() {  

int a[] = {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

int x = 2;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public String ant2str() {
if (t2()==0) {
	 return "";
}
	return String.valueOf(t2());
}








public int ant3() {  

int a[] = {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

int x = 3;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}






public String ant3str() {
if (t3()==0) {
	 return "";
}
	return String.valueOf(t3());
}









public int ant5() {  

int a[] = {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

int x = 5;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}







public String ant5str() {
if (t5()==0) {
	 return "";
}
	return String.valueOf(t5());
}










public int ant7() {  

int a[] = {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

int x = 7;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}







public String ant7str() {
if (t7()==0) {
	 return "";
}
	return String.valueOf(t7());
}










public int ant11() {  

int a[] = {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

int x = 11;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}






public String ant11str() {
if (t11()==0) {
	 return "";
}
	return String.valueOf(t11());
}









public int ant13() {  

int a[] = {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

int x = 13;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}






public String ant13str() {
if (t13()==0) {
	 return "";
}
	return String.valueOf(t13());
}








public int ant17() {  

int a[] = {ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10()};

int x = 17;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}



public String shocombstr() {
	 return String.valueOf(shocomb());
}


public String onestr() {
	 return String.valueOf(1);
}




public int aniden() {

	Integer[] list2str = { ansu() , ansu2() , ansu3(), ansu4() , ansu5() , ansu6() , ansu7() , ansu8() , ansu9() , ansu10() }; 
	
		
	List<Integer> newList2 = new ArrayList<>(Arrays.asList(list2str));
	
	if (newList2.contains(shocomb()) && newList2.contains(1) ) {
	return shocomb();
	}
	
	return numint();
}





public Integer anidentib() {

	String[] list2str = { anssu() , anssu2() , anssu3(), anssu4() , anssu5() , anssu6() , anssu7() , anssu8() , anssu9() , anssu10() }; 
	
		
	List<String> newList2 = new ArrayList<>(Arrays.asList(list2str));
	
	if (newList2.contains(shocombstr()) && newList2.contains(onestr()) ) {
	
	int count = Collections.frequency(newList2, shocombstr() );
	
	return count;
	}
	
	return 0;
}
























public Integer oansu(){

     for(int i = 2; i<=bnumint(); i++){
       if(bnumint()%i==0)
         return i;
     }
     
     return 1;
  }

public String oanssu() {
	 return String.valueOf(oansu());
}



public int oansu2d(){
	 return bnumint() / oansu();
}

public Integer oansu2(){

     for(int i = 2; i<=oansu2d(); i++){
       if(oansu2d()%i==0)
         return i;
     }

     return 1;
  }


public String oanssu2() {
	 return String.valueOf(oansu2());
}



public int oansu3d(){
	 return bnumint() / oansu() / oansu2();
}

public Integer oansu3(){

     for(int i = 2; i<=oansu3d(); i++){
       if(oansu3d()%i==0)
         return i;
     }

     return 1;
  }




public String oanssu3() {
	 return String.valueOf(oansu3());
}





public int oansu4d(){
	 return bnumint() / oansu() / oansu2() / oansu3();
}

public Integer oansu4(){

     for(int i = 2; i<=oansu4d(); i++){
       if(oansu4d()%i==0)
         return i;
     }

     return 1;
  }




public String oanssu4() {
	 return String.valueOf(oansu4());
}




public int oansu5d(){
	 return bnumint() / oansu() / oansu2() / oansu3()/ oansu4();
}

public Integer oansu5(){

     for(int i = 2; i<=oansu5d(); i++){
       if(oansu5d()%i==0)
         return i;
     }

     return 1;
  }




public String oanssu5() {
	 return String.valueOf(oansu5());
}




public int oansu6d(){
	 return bnumint() / oansu() / oansu2() / oansu3()/ oansu4() / oansu5();
}

public Integer oansu6(){

     for(int i = 2; i<=oansu6d(); i++){
       if(oansu6d()%i==0)
         return i;
     }

     return 1;
  }




public String oanssu6() {
	 return String.valueOf(oansu6());
}





public int oansu7d(){
	 return bnumint() / oansu() / oansu2() / oansu3()/ oansu4() / oansu5() / oansu6();
}

public Integer oansu7(){

     for(int i = 2; i<=oansu7d(); i++){
       if(oansu7d()%i==0)
         return i;
     }

     return 1;
  }





public String oanssu7() {
	 return String.valueOf(oansu7());
}





public int oansu8d(){
	 return bnumint() / oansu() / oansu2() / oansu3()/ oansu4() / oansu5() / oansu6() / oansu7();
}

public Integer oansu8(){

     for(int i = 2; i<=oansu8d(); i++){
       if(oansu8d()%i==0)
         return i;
     }

     return 1;
  }




public String oanssu8() {
	 return String.valueOf(oansu8());
}




public int oansu9d(){
	 return bnumint() / oansu() / oansu2() / oansu3()/ oansu4() / oansu5() / oansu6() / oansu7() / oansu8();
}

public Integer oansu9(){

     for(int i = 2; i<=oansu9d(); i++){
       if(oansu9d()%i==0)
         return i;
     }

     return 1;
  }




public String oanssu9() {
	 return String.valueOf(oansu9());
}




public int oansu10d(){
	 return bnumint() / oansu() / oansu2() / oansu3()/ oansu4() / oansu5() / oansu6() / oansu7() / oansu8() / oansu9();
}

public Integer oansu10(){

     for(int i = 2; i<=oansu10d(); i++){
       if(oansu10d()%i==0)
         return i;
     }
     return 1;
  }





public String oanssu10() {
	 return String.valueOf(oansu10());
}






public Integer oansho2() {  

	 int [] a= {oansu() , oansu2() , oansu3(), oansu4() , oansu5() , oansu6() , oansu7() , oansu8() , oansu9() , oansu10()};

	     for (int value: a)
	     if (value == 2)
	         return 2;
	     
	     return null;
	 }



public int oannumsho2() {
if (oansho2()==null) {
	 return 1;
}
	return ansho2();
}







public Integer oansho3() {  

	 int [] a= {oansu() , oansu2() , oansu3(), oansu4() , oansu5() , oansu6() , oansu7() , oansu8() , oansu9() , oansu10()};

	     for (int value: a)
	     if (value == 3)
	         return 3;
	     
	     return null;
	 }



public int oannumsho3() {
if (oansho3()==null) {
	 return 1;
}
	return oansho3();
}






public String oanshostr3() {
	 if (oansho3()==null) {
		 return "";
	 }
		return String.valueOf("*" + oansho3());
	}




public Integer oansho5() {  

	 int [] a= {oansu() , oansu2() , oansu3(), oansu4() , oansu5() , oansu6() , oansu7() , oansu8() , oansu9() , oansu10()};

	     for (int value: a)
	     if (value == 5)
	         return 5;
	     
	     return null;
	 }



public int oannumsho5() {
if (oansho5()==null) {
	 return 1;
}
	return oansho5();
}





public String oanshostr5() {
	 if (oansho5()==null) {
		 return "";
	 }
		return String.valueOf("*" + oansho5());
	}




public Integer oansho7() {  

	 int [] a= {oansu() , oansu2() , oansu3(), oansu4() , oansu5() , oansu6() , oansu7() , oansu8() , oansu9() , oansu10()};

	     for (int value: a)
	     if (value == 7)
	         return 7;
	     
	     return null;
	 }




public int oannumsho7() {
if (oansho7()==null) {
	 return 1;
}
	return oansho7();
}






public String oanshostr7() {
	 if (oansho7()==null) {
		 return "";
	 }
		return String.valueOf("*" + oansho7());
	}




public Integer oansho11() {  

	 int [] a= {oansu() , oansu2() , oansu3(), oansu4() , oansu5() , oansu6() , oansu7() , oansu8() , oansu9() , oansu10()};

	     for (int value: a)
	     if (value == 11)
	         return 11;
	     
	     return null;
	 }




public int oannumsho11() {
if (oansho11()==null) {
	 return 1;
}
	return oansho11();
}





public String oanshostr11() {
	 if (oansho11()==null) {
		 return "";
	 }
		return String.valueOf("*" + oansho11());
	}




public Integer oansho13() {  

	 int [] a= {oansu() , oansu2() , oansu3(), oansu4() , oansu5() , oansu6() , oansu7() , oansu8() , oansu9() , oansu10()};

	     for (int value: a)
	     if (value == 13)
	         return 13;
	     
	     return null;
	 }




public int oannumsho13() {
if (oansho13()==null) {
	 return 1;
}
	return oansho13();
}





public String oanshostr13() {
	 if (oansho13()==null) {
		 return "";
	 }
		return String.valueOf("*" + oansho13());
	}








public int oanshocomb() {
return oannumsho2() * oannumsho3() * oannumsho5() * oannumsho7() * oannumsho11() * oannumsho13();
}





public String oshocombstr() {
	 return String.valueOf(bshocomb());
}


public String oonestr() {
	 return String.valueOf(1);
}




public int oaniden() {

	Integer[] list2str = { oansu() , oansu2() , oansu3(), oansu4() , oansu5() , oansu6() , oansu7() , oansu8() , oansu9() , oansu10() }; 
	
		
	List<Integer> newList2 = new ArrayList<>(Arrays.asList(list2str));
	
	if (newList2.contains(bshocomb()) && newList2.contains(1) ) {
	return bshocomb();
	}
	
	return 10;
}





public Integer oanidentib() {

	String[] list2str = { oanssu() , oanssu2() , oanssu3(), oanssu4() , oanssu5() , oanssu6() , oanssu7() , oanssu8() , oanssu9() , oanssu10() }; 
	
		
	List<String> newList2 = new ArrayList<>(Arrays.asList(list2str));
	
	if (newList2.contains(oshocombstr()) && newList2.contains(onestr()) ) {
	
	int count = Collections.frequency(newList2, oshocombstr() );
	
	return count;
	}
	
	return 0;
}




public int oanitensb() {
    if(oanidentib() == 0 && S22 / S2 == 1000) {
		return 4;
  }else if(oanidentib() == 0 && S22 / S2 == 100) {
		return 3;
  }else if(oanidentib() == 0 && S22 / S2 == 10) {
		return 2;
}else if(oanidentib() == 0 && S22 % S2 == 1) {
	return 1;
}

    return oanidentib();
}




public int sumsum() {
	return anidentib() + oanidentib();
}


























public int bt17() {  

int a[] = {bsu() , bsu2() , bsu3(), bsu4() , bsu5() , bsu6() , bsu7() , bsu8() , bsu9() , bsu10()};

int x = 17;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}





public int bpowadd() {
	return (bt2()*S34) + (bt3()*S34) + (bt5()*S34) + (bt7()*S34) + (bt11()*S34) + (bt13()*S34);
}







public int bsudiv2() {
return bt2()/2;
}


public int bsudiv3() {
return bt3()/2;
}


public int bsudiv5() {
return bt5()/2;
}


public int bsudiv7() {
return bt7()/2;
}


public int bsudiv11() {
return bt11()/2;
}


public int bsudiv13() {
return bt13()/2;
}


public int bsudiv17() {
return bt17()/2;
}


public String bstr2() {
return String.valueOf(2);
}


public String bstr3() {
return String.valueOf(3);
}


public String bstr5() {
return String.valueOf(5);
}


public String bstr7() {
return String.valueOf(7);
}


public String bstr11() {
return String.valueOf(11);
}


public String bstr13() {
return String.valueOf(1);
}

public String bstr17() {
return String.valueOf(17);
}



public String bapp2() {

return String.join(" * ", Collections.nCopies(bsudiv2(), String.valueOf(2)));
}	 




public String bapp3() {

return String.join(" * ", Collections.nCopies(bsudiv3(), String.valueOf(3)));
}	 




public String bapp5() {
return String.join(" * ", Collections.nCopies(bsudiv5(), String.valueOf(5)));
}	 



public String bapp7() {
return String.join(" * ", Collections.nCopies(bsudiv7(), String.valueOf(7)));
}	 




public String bapp11() {
return String.join(" * ", Collections.nCopies(bsudiv11(), String.valueOf(11)));
}	 




public String bapp13() {
return String.join(" * ", Collections.nCopies(bsudiv13(), String.valueOf(13)));
}	 




public String bapp17() {
return String.join(" * ", Collections.nCopies(bsudiv17(), String.valueOf(17)));
}	 







public double bmul2() {
return Math.pow(2, bsudiv2());
}




public double brem2(){

return Math.pow(2, bt2()) / Math.pow(bmul2(), 2);
}



public int bleft2(){

for(int i = 2; i<=S1; i++){
  if(brem2() ==2)
    return 2;
}

return 1;
}






public double bmul3() {
return Math.pow(3, bsudiv3());
}




public double brem3(){

return Math.pow(3, bt3()) / Math.pow(bmul3(), 2);
}



public int bleft3(){

for(int i = 3; i<=5; i++){
  if(brem3() ==3)
    return 3;
}

return 1;
}





public double bmul5() {
return Math.pow(5, bsudiv5());
}




public double brem5(){

return Math.pow(5, bt5()) / Math.pow(bmul5(), 2);
}



public int bleft5(){

for(int i = 5; i<=5; i++){
  if(brem5() ==5)
    return 5;
}

return 1;
}








public double bmul7() {
return Math.pow(7, bsudiv7());
}




public double brem7(){

return Math.pow(7, bt7()) / Math.pow(bmul7(), 2);
}



public int bleft7(){

for(int i = 7; i<=5; i++){
  if(rem7() ==7)
    return 7;
}

return 1;
}



public double bmul11() {
return Math.pow(11, bsudiv11());
}




public double brem11(){

return Math.pow(11, bt11()) / Math.pow(bmul11(), 2);
}



public int bleft11(){

for(int i = 11; i<=5; i++){
  if(brem7() ==11)
    return 11;
}

return 1;
}



public int bmulout(){
return (int)(bmul2() * bmul3() * bmul5() * bmul7() * bmul11()); 
}

public int bleftout(){
return (int)(bleft2() * bleft3() * bleft5() * bleft7() * bleft11()); 
}	






public int sum2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2)
    return mulout() + bmulout();
}

return 0;
}


public int sum3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3)
    return mulout() + bmulout();
}

return 0;
}


public int sum5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5)
    return mulout() + bmulout();
}

return 0;
}


public int sum7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7)
    return mulout() + bmulout();
}

return 0;
}


public int sum11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11)
    return mulout() + bmulout();
}

return 0;
}











public int dif2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2)
    return mulout() - bmulout();
}

return 0;
}


public int dif3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3)
    return mulout() - bmulout();
}

return 0;
}


public int dif5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5)
    return mulout() - bmulout();
}

return 0;
}


public int dif7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7)
    return mulout() - bmulout();
}

return 0;
}


public int dif11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11)
    return mulout() - bmulout();
}

return 0;
}


public int totsum(){
	return sum2() + sum3() + sum5() + sum7() + sum11();
}



public int difsum(){
	return dif2() + dif3() + dif5() + dif7() + dif11();
}




public int repe2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2)
    return 2;
}

return 0;
}





public int repe3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3)
    return 3;
}

return 0;
}







public int repe5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5)
    return 5;
}

return 0;
}







public int repe7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7)
    return 7;
}

return 0;
}







public int repe11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11)
    return 11;
}

return 0;
}


public int totrepe(){
	return repe2() + repe3() + repe5() + repe7() + repe11();
}
















public int csu(){

     for(int i = 2; i<=S3; i++){
       if(S3%i==0)
         return i;
     }

     return 1;
  }


public int csu2d(){
	 return S3 / csu();
}

public int csu2(){

     for(int i = 2; i<=csu2d(); i++){
       if(csu2d()%i==0)
         return i;
     }

     return 1;
  }



public int csu3d(){
	 return S3 / csu() / csu2();
}

public int csu3(){

     for(int i = 2; i<=csu3d(); i++){
       if(csu3d()%i==0)
         return i;
     }

     return 1;
  }




public int csu4d(){
	 return S3 / csu() / csu2() / csu3();
}

public int csu4(){

     for(int i = 2; i<=csu4d(); i++){
       if(csu4d()%i==0)
         return i;
     }

     return 1;
  }



public int csu5d(){
	 return S3 / csu() / csu2() / csu3()/ csu4();
}

public int csu5(){

     for(int i = 2; i<=csu5d(); i++){
       if(csu5d()%i==0)
         return i;
     }

     return 1;
  }



public int csu6d(){
	 return S3 / csu() / csu2() / csu3()/ csu4() / csu5();
}

public int csu6(){

     for(int i = 2; i<=csu6d(); i++){
       if(csu6d()%i==0)
         return i;
     }

     return 1;
  }




public int csu7d(){
	 return S3 / csu() / csu2() / csu3()/ csu4() / csu5() / csu6();
}

public int csu7(){

     for(int i = 2; i<=csu7d(); i++){
       if(csu7d()%i==0)
         return i;
     }

     return 1;
  }





public int csu8d(){
	 return S3 / csu() / csu2() / csu3()/ csu4() / csu5() / csu6() / csu7();
}

public int csu8(){

     for(int i = 2; i<=csu8d(); i++){
       if(csu8d()%i==0)
         return i;
     }

     return 1;
  }



public int csu9d(){
	 return S3 / csu() / csu2() / csu3()/ csu4() / csu5() / csu6() / csu7() / csu8();
}

public int csu9(){

     for(int i = 2; i<=csu9d(); i++){
       if(csu9d()%i==0)
         return i;
     }

     return 1;
  }



public int csu10d(){
	 return S3 / csu() / csu2() / csu3()/ csu4() / csu5() / csu6() / csu7() / csu8() / csu9();
}

public int csu10(){

     for(int i = 2; i<=csu10d(); i++){
       if(csu10d()%i==0)
         return i;
     }

     return 1;
  }





public int ct2() {  

int a[] = {csu() , csu2() , csu3(), csu4() , csu5() , csu6() , csu7() , csu8() , csu9() , csu10()};

int x = 2;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public int ct3() {  

int a[] = {csu() , csu2() , csu3(), csu4() , csu5() , csu6() , csu7() , csu8() , csu9() , csu10()};

int x = 3;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}



public int ct5() {  

int a[] = {csu() , csu2() , csu3(), csu4() , csu5() , csu6() , csu7() , csu8() , csu9() , csu10()};

int x = 5;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public int ct7() {  

int a[] = {csu() , csu2() , csu3(), csu4() , csu5() , csu6() , csu7() , csu8() , csu9() , csu10()};

int x = 7;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public int ct11() {  

int a[] = {csu() , csu2() , csu3(), csu4() , csu5() , csu6() , csu7() , csu8() , csu9() , csu10()};

int x = 11;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}



public int ct13() {  

int a[] = {csu() , csu2() , csu3(), csu4() , csu5() , csu6() , csu7() , csu8() , csu9() , csu10()};

int x = 13;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}



public int ct17() {  

int a[] = {csu() , csu2() , csu3(), csu4() , csu5() , csu6() , csu7() , csu8() , csu9() , csu10()};

int x = 17;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}



public int csudiv2() {
return ct2()/2;
}


public int csudiv3() {
return ct3()/2;
}


public int csudiv5() {
return ct5()/2;
}


public int csudiv7() {
return ct7()/2;
}


public int csudiv11() {
return ct11()/2;
}


public int csudiv13() {
return ct13()/2;
}


public int csudiv17() {
return ct17()/2;
}


public String cstr2() {
return String.valueOf(2);
}


public String cstr3() {
return String.valueOf(3);
}


public String cstr5() {
return String.valueOf(5);
}


public String cstr7() {
return String.valueOf(7);
}


public String cstr11() {
return String.valueOf(11);
}


public String cstr13() {
return String.valueOf(1);
}

public String cstr17() {
return String.valueOf(17);
}



public String capp2() {

return String.join(" * ", Collections.nCopies(csudiv2(), String.valueOf(2)));
}	 




public String capp3() {

return String.join(" * ", Collections.nCopies(csudiv3(), String.valueOf(3)));
}	 




public String capp5() {
return String.join(" * ", Collections.nCopies(csudiv5(), String.valueOf(5)));
}	 



public String capp7() {
return String.join(" * ", Collections.nCopies(csudiv7(), String.valueOf(7)));
}	 




public String capp11() {
return String.join(" * ", Collections.nCopies(csudiv11(), String.valueOf(11)));
}	 




public String capp13() {
return String.join(" * ", Collections.nCopies(csudiv13(), String.valueOf(13)));
}	 




public String capp17() {
return String.join(" * ", Collections.nCopies(csudiv17(), String.valueOf(17)));
}	 







public double cmul2() {
return Math.pow(2, csudiv2());
}




public double crem2(){

return Math.pow(2, ct2()) / Math.pow(cmul2(), 2);
}



public int cleft2(){

for(int i = 2; i<=S1; i++){
  if(crem2() ==2)
    return 2;
}

return 1;
}






public double cmul3() {
return Math.pow(3, csudiv3());
}




public double crem3(){

return Math.pow(3, ct3()) / Math.pow(cmul3(), 2);
}



public int cleft3(){

for(int i = 3; i<=5; i++){
  if(crem3() ==3)
    return 3;
}

return 1;
}





public double cmul5() {
return Math.pow(5, csudiv5());
}




public double crem5(){

return Math.pow(5, ct5()) / Math.pow(cmul5(), 2);
}



public int cleft5(){

for(int i = 5; i<=5; i++){
  if(crem5() ==5)
    return 5;
}

return 1;
}








public double cmul7() {
return Math.pow(7, csudiv7());
}




public double crem7(){

return Math.pow(7, ct7()) / Math.pow(cmul7(), 2);
}



public int cleft7(){

for(int i = 7; i<=5; i++){
  if(crem7() ==7)
    return 7;
}

return 1;
}



public double cmul11() {
return Math.pow(11, csudiv11());
}




public double crem11(){

return Math.pow(11, ct11()) / Math.pow(cmul11(), 2);
}



public int cleft11(){

for(int i = 11; i<=5; i++){
  if(crem7() ==11)
    return 11;
}

return 1;
}



public int cmulout(){
return (int)(cmul2() * cmul3() * cmul5() * cmul7() * cmul11()); 
}

public int cleftout(){
return (int)(cleft2() * cleft3() * cleft5() * cleft7() * cleft11()); 
}	





public int tsum2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() ==2)
    return mulout() + bmulout() + cmulout();
}

return 0;
}


public int tsum3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() ==3)
    return mulout() + bmulout() + cmulout();
}

return 0;
}


public int tsum5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() ==5)
    return mulout() + bmulout() + cmulout();
}

return 0;
}


public int tsum7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() ==7)
    return mulout() + bmulout() + cmulout();
}

return 0;
}


public int tsum11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() ==11)
    return mulout() + bmulout() + cmulout();
}

return 0;
}






public int tdif2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() ==2)
    return mulout() - bmulout() - cmulout();
}

return 0;
}


public int tdif3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() ==3)
    return mulout() - bmulout() - cmulout();
}

return 0;
}


public int tdif5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() ==5)
    return mulout() - bmulout() - cmulout();
}

return 0;
}


public int tdif7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() ==7)
    return mulout() - bmulout() - cmulout();
}

return 0;
}


public int tdif11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() ==11)
    return mulout() - bmulout() - cmulout();
}

return 0;
}









public int adsu2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() ==2)
    return mulout() + bmulout() - cmulout();
}

return 0;
}


public int adsu3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() ==3)
    return mulout() + bmulout() - cmulout();
}

return 0;
}


public int adsu5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() ==5)
    return mulout() + bmulout() - cmulout();
}

return 0;
}


public int adsu7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() ==7)
    return mulout() + bmulout() - cmulout();
}

return 0;
}


public int adsu11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() ==11)
    return mulout() + bmulout() - cmulout();
}

return 0;
}







public int suad2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() ==2)
    return mulout() - bmulout() + cmulout();
}

return 0;
}


public int suad3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() ==3)
    return mulout() - bmulout() + cmulout();
}

return 0;
}


public int suad5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() ==5)
    return mulout() - bmulout() + cmulout();
}

return 0;
}


public int suad7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() ==7)
    return mulout() - bmulout() + cmulout();
}

return 0;
}


public int suad11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() ==11)
    return mulout() - bmulout() + cmulout();
}

return 0;
}








public int thtotsum(){
	return tsum2() + tsum3() + tsum5() + tsum7() + tsum11() + nothsum2() + nothsum3() + nothsum5() + nothsum7() + nothsum11()
+ fnothsum2() + fnothsum3() + fnothsum5() + fnothsum7() + fnothsum11() + mnothsum2() + mnothsum3() + mnothsum5() + mnothsum7() + mnothsum11();
}



public int thdifsum(){
	return tdif2() + tdif3() + tdif5() + tdif7() + tdif11() + nothdif2() + nothdif3() + nothdif5() + nothdif7() + nothdif11()
	+ fnothdif2() + fnothdif3() + fnothdif5() + fnothdif7() + fnothdif11() + mnothdif2() + mnothdif3() + mnothdif5() + mnothdif7() + mnothdif11();
}



public int adsusum(){
	return adsu2() + adsu3() + adsu5() + adsu7() + adsu11() + noadsu2() + noadsu3() + noadsu5() + noadsu7() + noadsu11()
	+ fnoadsu2() + fnoadsu3() + fnoadsu5() + fnoadsu7() + fnoadsu11() + mnoadsu2() + mnoadsu3() + mnoadsu5() + mnoadsu7() + mnoadsu11();
}



public int suadsum(){
	return suad2() + suad3() + suad5() + suad7() + suad11() + nosuad2() + nosuad3() + nosuad5() + nosuad7() + nosuad11()
	+ fnosuad2() + fnosuad3() + fnosuad5() + fnosuad7() + fnosuad11() + mnosuad2() + mnosuad3() + mnosuad5() + mnosuad7() + mnosuad11();
}







public int exnothsum2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() !=2)
    return cmulout();
}

return 0;
}




public int exnothrepe2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() !=2)
    return cleftout();
}

return 0;
}





public int exnothsum3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() !=3)
    return cmulout();
}

return 0;
}




public int exnothrepe3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() !=3)
    return cleftout();
}

return 0;
}





public int exnothsum5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() !=5)
    return cmulout();
}

return 0;
}




public int exnothrepe5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() !=5)
    return cleftout();
}

return 0;
}






public int exnothsum7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() !=7)
    return cmulout();
}

return 0;
}




public int exnothrepe7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() !=7)
    return cleftout();
}

return 0;
}






public int exnothsum11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() !=11)
    return cmulout();
}

return 0;
}




public int exnothrepe11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() !=11)
    return cleftout();
}

return 0;
}




public int exnothsum(){
return (int)(exnothsum2() + exnothsum3() + exnothsum5() + exnothsum7() + exnothsum11()); 
}

public int exnothrepe(){
return (int)(exnothrepe2() + exnothrepe3() + exnothrepe5() + exnothrepe7() + exnothrepe11()); 
}



















public int fexnothsum2(){

for(int i = 2; i<=5; i++){
  if(leftout() !=2 && bleftout() ==2 && cleftout() ==2)
    return mulout();
}

return 0;
}




public int fexnothrepe2(){

for(int i = 2; i<=5; i++){
  if(leftout() !=2 && bleftout() ==2 && cleftout() ==2)
    return leftout();
}

return 0;
}





public int fexnothsum3(){

for(int i = 2; i<=5; i++){
  if(leftout() !=3 && bleftout() ==3 && cleftout() ==3)
    return mulout();
}

return 0;
}




public int fexnothrepe3(){

for(int i = 2; i<=5; i++){
  if(leftout() !=3 && bleftout() ==3 && cleftout() ==3)
    return leftout();
}

return 0;
}





public int fexnothsum5(){

for(int i = 2; i<=5; i++){
  if(leftout() !=5 && bleftout() ==5 && cleftout() ==5)
    return mulout();
}

return 0;
}




public int fexnothrepe5(){

for(int i = 2; i<=5; i++){
  if(leftout() !=5 && bleftout() ==5 && cleftout() ==5)
    return leftout();
}

return 0;
}






public int fexnothsum7(){

for(int i = 2; i<=5; i++){
  if(leftout() !=7 && bleftout() ==7 && cleftout() ==7)
    return mulout();
}

return 0;
}




public int fexnothrepe7(){

for(int i = 2; i<=5; i++){
  if(leftout() !=7 && bleftout() ==7 && cleftout() ==7)
    return leftout();
}

return 0;
}






public int fexnothsum11(){

for(int i = 2; i<=5; i++){
  if(leftout() !=11 && bleftout() ==11 && cleftout() ==11)
    return mulout();
}

return 0;
}




public int fexnothrepe11(){

for(int i = 2; i<=5; i++){
  if(leftout() !=11 && bleftout() ==11 && cleftout() ==11)
    return leftout();
}

return 0;
}




public int fexnothsum(){
return (int)(fexnothsum2() + fexnothsum3() + fexnothsum5() + fexnothsum7() + fexnothsum11()); 
}

public int fexnothrepe(){
return (int)(fexnothrepe2() + fexnothrepe3() + fexnothrepe5() + fexnothrepe7() + fexnothrepe11()); 
}



















public int mexnothsum2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() !=2 && cleftout() ==2)
    return bmulout();
}

return 0;
}




public int mexnothrepe2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() !=2 && cleftout() ==2)
    return bleftout();
}

return 0;
}





public int mexnothsum3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() !=3 && cleftout() ==3)
    return bmulout();
}

return 0;
}




public int mexnothrepe3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() !=3 && cleftout() ==3)
    return bleftout();
}

return 0;
}





public int mexnothsum5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() !=5 && cleftout() ==5)
    return bmulout();
}

return 0;
}




public int mexnothrepe5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() !=5 && cleftout() ==5)
    return bleftout();
}

return 0;
}






public int mexnothsum7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() !=7 && cleftout() ==7)
    return bmulout();
}

return 0;
}




public int mexnothrepe7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() !=7 && cleftout() ==7)
    return bleftout();
}

return 0;
}






public int mexnothsum11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() !=11 && cleftout() ==11)
    return bmulout();
}

return 0;
}




public int mexnothrepe11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() !=11 && cleftout() ==11)
    return bleftout();
}

return 0;
}




public int mexnothsum(){
return (int)(mexnothsum2() + mexnothsum3() + mexnothsum5() + mexnothsum7() + mexnothsum11()); 
}

public int mexnothrepe(){
return (int)(mexnothrepe2() + mexnothrepe3() + mexnothrepe5() + mexnothrepe7() + mexnothrepe11()); 
}




















public int nothsum2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() !=2)
    return mulout() + bmulout();
}

return 0;
}

public int nothsum3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() !=3)
    return mulout() + bmulout();
}

return 0;
}



public int nothsum5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() !=5)
    return mulout() + bmulout();
}

return 0;
}



public int nothsum7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() !=7)
    return mulout() + bmulout();
}

return 0;
}



public int nothsum11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() !=11)
    return mulout() + bmulout();
}

return 0;
}







public int nothdif2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() !=2)
    return mulout() - bmulout();
}

return 0;
}

public int nothdif3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() !=3)
    return mulout() - bmulout();
}

return 0;
}



public int nothdif5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() !=5)
    return mulout() - bmulout();
}

return 0;
}



public int nothdif7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() !=7)
    return mulout() - bmulout();
}

return 0;
}



public int nothdif11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() !=11)
    return mulout() - bmulout();
}

return 0;
}







public int noadsu2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() !=2)
    return mulout() + bmulout();
}

return 0;
}

public int noadsu3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() !=3)
    return mulout() + bmulout();
}

return 0;
}



public int noadsu5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() !=5)
    return mulout() + bmulout();
}

return 0;
}



public int noadsu7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() !=7)
    return mulout() + bmulout();
}

return 0;
}



public int noadsu11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() !=11)
    return mulout() + bmulout();
}

return 0;
}









public int nosuad2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() !=2)
    return mulout() - bmulout();
}

return 0;
}

public int nosuad3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() !=3)
    return mulout() - bmulout();
}

return 0;
}



public int nosuad5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() !=5)
    return mulout() - bmulout();
}

return 0;
}



public int nosuad7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() !=7)
    return mulout() - bmulout();
}

return 0;
}



public int nosuad11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() !=11)
    return mulout() - bmulout();
}

return 0;
}















public int fnothsum2(){

for(int i = 2; i<=5; i++){
  if(leftout() !=2 && bleftout() ==2 && cleftout() ==2)
    return cmulout() + bmulout();
}

return 0;
}

public int fnothsum3(){

for(int i = 2; i<=5; i++){
  if(leftout() !=3 && bleftout() ==3 && cleftout() ==3)
    return cmulout() + bmulout();
}

return 0;
}



public int fnothsum5(){

for(int i = 2; i<=5; i++){
  if(leftout() !=5 && bleftout() ==5 && cleftout() ==5)
    return cmulout() + bmulout();
}

return 0;
}



public int fnothsum7(){

for(int i = 2; i<=5; i++){
  if(leftout() !=7 && bleftout() ==7 && cleftout() ==7)
    return cmulout() + bmulout();
}

return 0;
}



public int fnothsum11(){

for(int i = 2; i<=5; i++){
  if(leftout() !=11 && bleftout() ==11 && cleftout() ==11)
    return bmulout() + cmulout();
}

return 0;
}






public int fnothdif2(){

for(int i = 2; i<=5; i++){
  if(leftout() !=2 && bleftout() ==2 && cleftout() ==2)
    return cmulout() - bmulout();
}

return 0;
}

public int fnothdif3(){

for(int i = 2; i<=5; i++){
  if(leftout() !=3 && bleftout() ==3 && cleftout() ==3)
    return cmulout() - bmulout();
}

return 0;
}



public int fnothdif5(){

for(int i = 2; i<=5; i++){
  if(leftout() !=5 && bleftout() ==5 && cleftout() ==5)
    return cmulout() - bmulout();
}

return 0;
}



public int fnothdif7(){

for(int i = 2; i<=5; i++){
  if(leftout() !=7 && bleftout() ==7 && cleftout() ==7)
    return cmulout() - bmulout();
}

return 0;
}



public int fnothdif11(){

for(int i = 2; i<=5; i++){
  if(leftout() !=11 && bleftout() ==11 && cleftout() ==11)
    return cmulout() - bmulout();
}

return 0;
}












public int fnoadsu2(){

for(int i = 2; i<=5; i++){
  if(leftout() !=2 && bleftout() ==2 && cleftout() ==2)
    return bmulout() - cmulout();
}

return 0;
}

public int fnoadsu3(){

for(int i = 2; i<=5; i++){
  if(leftout() !=3 && bleftout() ==3 && cleftout() ==3)
    return bmulout() - cmulout();
}

return 0;
}



public int fnoadsu5(){

for(int i = 2; i<=5; i++){
  if(leftout() !=5 && bleftout() ==5 && cleftout() ==5)
    return bmulout() - cmulout();
}

return 0;
}



public int fnoadsu7(){

for(int i = 2; i<=5; i++){
  if(leftout() !=7 && bleftout() ==7 && cleftout() ==7)
    return bmulout() - cmulout();
}

return 0;
}



public int fnoadsu11(){

for(int i = 2; i<=5; i++){
  if(leftout() !=11 && bleftout() ==11 && cleftout() ==11)
    return bmulout() - cmulout();
}

return 0;
}







public int fnosuad2(){

for(int i = 2; i<=5; i++){
  if(leftout() !=2 && bleftout() ==2 && cleftout() ==2)
    return - bmulout() + cmulout();
}

return 0;
}

public int fnosuad3(){

for(int i = 2; i<=5; i++){
  if(leftout() !=3 && bleftout() ==3 && cleftout() ==3)
    return - bmulout() + cmulout();
}

return 0;
}



public int fnosuad5(){

for(int i = 2; i<=5; i++){
  if(leftout() !=5 && bleftout() ==5 && cleftout() ==5)
    return - bmulout() + cmulout();
}

return 0;
}



public int fnosuad7(){

for(int i = 2; i<=5; i++){
  if(leftout() !=7 && bleftout() ==7 && cleftout() ==7)
    return - bmulout() + cmulout();
}

return 0;
}



public int fnosuad11(){

for(int i = 2; i<=5; i++){
  if(leftout() !=11 && bleftout() ==11 && cleftout() ==11)
    return - bmulout() + cmulout();
}

return 0;
}











public int mnothsum2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() !=2 && cleftout() ==2)
    return cmulout() + mulout();
}

return 0;
}

public int mnothsum3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() !=3 && cleftout() ==3)
    return cmulout() + mulout();
}

return 0;
}



public int mnothsum5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() !=5 && cleftout() ==5)
    return cmulout() + mulout();
}

return 0;
}



public int mnothsum7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() !=7 && cleftout() ==7)
    return cmulout() + mulout();
}

return 0;
}



public int mnothsum11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() !=11 && cleftout() ==11)
    return cmulout() + mulout();
}

return 0;
}








public int mnothdif2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() !=2 && cleftout() ==2)
    return mulout() - cmulout();
}

return 0;
}

public int mnothdif3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() !=3 && cleftout() ==3)
    return mulout() - cmulout();
}

return 0;
}



public int mnothdif5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() !=5 && cleftout() ==5)
    return mulout() - cmulout();
}

return 0;
}



public int mnothdif7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() !=7 && cleftout() ==7)
    return mulout() - cmulout();
}

return 0;
}



public int mnothdif11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() !=11 && cleftout() ==11)
    return mulout() - cmulout();
}

return 0;
}







public int mnoadsu2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() !=2 && cleftout() ==2)
    return mulout() - cmulout();
}

return 0;
}

public int mnoadsu3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() !=3 && cleftout() ==3)
    return mulout() - cmulout();
}

return 0;
}



public int mnoadsu5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() !=5 && cleftout() ==5)
    return mulout() - cmulout();
}

return 0;
}



public int mnoadsu7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() !=7 && cleftout() ==7)
    return mulout() - cmulout();
}

return 0;
}



public int mnoadsu11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() !=11 && cleftout() ==11)
    return mulout() - cmulout();
}

return 0;
}








public int mnosuad2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() !=2 && cleftout() ==2)
    return mulout() + cmulout();
}

return 0;
}

public int mnosuad3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() !=3 && cleftout() ==3)
    return mulout() + cmulout();
}

return 0;
}



public int mnosuad5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() !=5 && cleftout() ==5)
    return mulout() + cmulout();
}

return 0;
}



public int mnosuad7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() !=7 && cleftout() ==7)
    return mulout() + cmulout();
}

return 0;
}



public int mnosuad11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() !=11 && cleftout() ==11)
    return mulout() + cmulout();
}

return 0;
}


















public int threpe2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() ==2)
    return 2;
}

return 0;
}





public int threpe3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() ==3)
    return 3;
}

return 0;
}







public int threpe5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() ==5)
    return 5;
}

return 0;
}







public int threpe7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() ==7)
    return 7;
}

return 0;
}







public int threpe11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() ==11)
    return 11;
}

return 0;
}




public int nothrepe2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() ==2 && cleftout() !=2)
    return 2;
}

return 0;
}




public int nothrepe3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() ==3 && cleftout() !=3)
    return 3;
}

return 0;
}





public int nothrepe5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() ==5 && cleftout() !=5)
    return 5;
}

return 0;
}




public int nothrepe7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() ==7 && cleftout() !=7)
    return 7;
}

return 0;
}




public int nothrepe11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() ==11 && cleftout() !=11)
    return 11;
}

return 0;
}











public int fnothrepe2(){

for(int i = 2; i<=5; i++){
  if(leftout() !=2 && bleftout() ==2 && cleftout() ==2)
    return 2;
}

return 0;
}




public int fnothrepe3(){

for(int i = 2; i<=5; i++){
  if(leftout() !=3 && bleftout() ==3 && cleftout() ==3)
    return 3;
}

return 0;
}





public int fnothrepe5(){

for(int i = 2; i<=5; i++){
  if(leftout() !=5 && bleftout() ==5 && cleftout() ==5)
    return 5;
}

return 0;
}




public int fnothrepe7(){

for(int i = 2; i<=5; i++){
  if(leftout() !=7 && bleftout() ==7 && cleftout() ==7)
    return 7;
}

return 0;
}




public int fnothrepe11(){

for(int i = 2; i<=5; i++){
  if(leftout() !=11 && bleftout() ==11 && cleftout() ==11)
    return 11;
}

return 0;
}







public int mnothrepe2(){

for(int i = 2; i<=5; i++){
  if(leftout() ==2 && bleftout() !=2 && cleftout() ==2)
    return 2;
}

return 0;
}




public int mnothrepe3(){

for(int i = 2; i<=5; i++){
  if(leftout() ==3 && bleftout() !=3 && cleftout() ==3)
    return 3;
}

return 0;
}





public int mnothrepe5(){

for(int i = 2; i<=5; i++){
  if(leftout() ==5 && bleftout() !=5 && cleftout() ==5)
    return 5;
}

return 0;
}




public int mnothrepe7(){

for(int i = 2; i<=5; i++){
  if(leftout() ==7 && bleftout() !=7 && cleftout() ==7)
    return 7;
}

return 0;
}




public int mnothrepe11(){

for(int i = 2; i<=5; i++){
  if(leftout() ==11 && bleftout() !=11 && cleftout() ==11)
    return 11;
}

return 0;
}




public int thtotrepe(){
	return threpe2() + threpe3() + threpe5() + threpe7() + threpe11()+ nothrepe2() + nothrepe3() + nothrepe5() + nothrepe7() + nothrepe11() + 
fnothrepe2() + fnothrepe3() + fnothrepe5() + fnothrepe7() + fnothrepe11() + mnothrepe2() + mnothrepe3() + mnothrepe5() + mnothrepe7() + mnothrepe11();
}



















public int tttabmul(){
    return mulout() * bmulout();
}

public int tttableft(){
    return leftout() * bleftout();
}






public int tttsu(){

     for(int i = 2; i<=tttableft(); i++){
       if(tttableft()%i==0)
         return i;
     }

     return 1;
  }


public int tttsu2d(){
	 return tttableft() / su();
}

public int tttsu2(){

     for(int i = 2; i<=tttsu2d(); i++){
       if(tttsu2d()%i==0)
         return i;
     }

     return 1;
  }



public int tttsu3d(){
	 return tttableft() / tttsu() / tttsu2();
}

public int tttsu3(){

     for(int i = 2; i<=tttsu3d(); i++){
       if(tttsu3d()%i==0)
         return i;
     }

     return 1;
  }




public int tttsu4d(){
	 return tttableft() / tttsu() / tttsu2() / tttsu3();
}

public int tttsu4(){

     for(int i = 2; i<=tttsu4d(); i++){
       if(tttsu4d()%i==0)
         return i;
     }

     return 1;
  }



public int tttsu5d(){
	 return tttableft() / tttsu() / tttsu2() / tttsu3()/ tttsu4();
}

public int tttsu5(){

     for(int i = 2; i<=tttsu5d(); i++){
       if(tttsu5d()%i==0)
         return i;
     }

     return 1;
  }



public int tttsu6d(){
	 return tttableft() / tttsu() / tttsu2() / tttsu3()/ tttsu4() / tttsu5();
}

public int tttsu6(){

     for(int i = 2; i<=tttsu6d(); i++){
       if(tttsu6d()%i==0)
         return i;
     }

     return 1;
  }




public int tttsu7d(){
	 return tttableft() / tttsu() / tttsu2() / tttsu3()/ tttsu4() / tttsu5() / tttsu6();
}

public int tttsu7(){

     for(int i = 2; i<=tttsu7d(); i++){
       if(tttsu7d()%i==0)
         return i;
     }

     return 1;
  }





public int tttsu8d(){
	 return tttableft() / tttsu() / tttsu2() / tttsu3()/ tttsu4() / tttsu5() / tttsu6() / tttsu7();
}

public int tttsu8(){

     for(int i = 2; i<=tttsu8d(); i++){
       if(tttsu8d()%i==0)
         return i;
     }

     return 1;
  }



public int tttsu9d(){
	 return tttableft() / tttsu() / tttsu2() / tttsu3()/ tttsu4() / tttsu5() / tttsu6() / tttsu7() / tttsu8();
}

public int tttsu9(){

     for(int i = 2; i<=tttsu9d(); i++){
       if(tttsu9d()%i==0)
         return i;
     }

     return 1;
  }



public int tttsu10d(){
	 return tttableft() / tttsu() / tttsu2() / tttsu3()/ tttsu4() / tttsu5() / tttsu6() / tttsu7() / tttsu8() / tttsu9();
}

public int tttsu10(){

     for(int i = 2; i<=tttsu10d(); i++){
       if(tttsu10d()%i==0)
         return i;
     }

     return 1;
  }





public int ttt2() {  

int a[] = {tttsu() , tttsu2() , tttsu3(), tttsu4() , tttsu5() , tttsu6() , tttsu7() , tttsu8() , tttsu9() , tttsu10()};

int x = 2;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public int ttt3() {  

int a[] = {tttsu() , tttsu2() , tttsu3(), tttsu4() , tttsu5() , tttsu6() , tttsu7() , tttsu8() , tttsu9() , tttsu10()};

int x = 3;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}



public int ttt5() {  

int a[] = {tttsu() , tttsu2() , tttsu3(), tttsu4() , tttsu5() , tttsu6() , tttsu7() , tttsu8() , tttsu9() , tttsu10()};

int x = 5;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public int ttt7() {  

int a[] = {tttsu() , tttsu2() , tttsu3(), tttsu4() , tttsu5() , tttsu6() , tttsu7() , tttsu8() , tttsu9() , tttsu10()};

int x = 7;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}




public int ttt11() {  

int a[] = {tttsu() , tttsu2() , tttsu3(), tttsu4() , tttsu5() , tttsu6() , tttsu7() , tttsu8() , tttsu9() , tttsu10()};

int x = 11;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}



public int ttt13() {  

int a[] = {tttsu() , tttsu2() , tttsu3(), tttsu4() , tttsu5() , tttsu6() , tttsu7() , tttsu8() , tttsu9() , tttsu10()};

int x = 13;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}



public int ttt17() {  

int a[] = {tttsu() , tttsu2() , tttsu3(), tttsu4() , tttsu5() , tttsu6() , tttsu7() , tttsu8() , tttsu9() , tttsu10()};

int x = 17;

int n = a.length;



int count = 0;
for (int i=0; i < n; i++)
if (a[i] == x)
   count++;

return count;
}



public int tttsudiv2() {
return ttt2()/2;
}


public int tttsudiv3() {
return ttt3()/2;
}


public int tttsudiv5() {
return ttt5()/2;
}


public int tttsudiv7() {
return ttt7()/2;
}


public int tttsudiv11() {
return ttt11()/2;
}


public int tttsudiv13() {
return ttt13()/2;
}


public int tttsudiv17() {
return ttt17()/2;
}




public String tttapp2() {

return String.join(" * ", Collections.nCopies(tttsudiv2(), String.valueOf(2)));
}	 




public String tttapp3() {

return String.join(" * ", Collections.nCopies(tttsudiv3(), String.valueOf(3)));
}	 




public String tttapp5() {
return String.join(" * ", Collections.nCopies(tttsudiv5(), String.valueOf(5)));
}	 



public String tttapp7() {
return String.join(" * ", Collections.nCopies(tttsudiv7(), String.valueOf(7)));
}	 




public String tttapp11() {
return String.join(" * ", Collections.nCopies(tttsudiv11(), String.valueOf(11)));
}	 




public String tttapp13() {
return String.join(" * ", Collections.nCopies(tttsudiv13(), String.valueOf(13)));
}	 




public String tttapp17() {
return String.join(" * ", Collections.nCopies(tttsudiv17(), String.valueOf(17)));
}	 







public double tttmul2() {
return Math.pow(2, tttsudiv2());
}




public double tttrem2(){

return Math.pow(2, ttt2()) / Math.pow(tttmul2(), 2);
}



public int tttleft2(){

for(int i = 2; i<=S1; i++){
  if((tttrem2() ==2) || (ttt2() ==1))
    return 2;
}

return 1;
}






public double tttmul3() {
return Math.pow(3, tttsudiv3());
}




public double tttrem3(){

return Math.pow(3, ttt3()) / Math.pow(tttmul3(), 2);
}



public int tttleft3(){

for(int i = 3; i<=5; i++){
  if(tttrem3() ==3 || ttt3() ==1)
    return 3;
}

return 1;
}





public double tttmul5() {
return Math.pow(5, tttsudiv5());
}




public double tttrem5(){

return Math.pow(5, ttt5()) / Math.pow(tttmul5(), 2);
}



public int tttleft5(){

for(int i = 5; i<=5; i++){
  if(tttrem5() ==5 || ttt5() ==1)
    return 5;
}

return 1;
}








public double tttmul7() {
return Math.pow(7, tttsudiv7());
}




public double tttrem7(){

return Math.pow(7, ttt7()) / Math.pow(tttmul7(), 2);
}



public int tttleft7(){

for(int i = 7; i<=5; i++){
  if(tttrem7() ==7 || ttt7() ==1)
    return 7;
}

return 1;
}



public double tttmul11() {
return Math.pow(11, tttsudiv11());
}




public double tttrem11(){

return Math.pow(11, ttt11()) / Math.pow(tttmul11(), 2);
}



public int tttleft11(){

for(int i = 11; i<=5; i++){
  if(tttrem7() ==11 || ttt11() ==1)
    return 11;
}

return 1;
}



public int tttmulout(){
return (int)(tttmul2() * tttmul3() * tttmul5() * tttmul7() * tttmul11()); 
}

public int tttleftout(){
return (int)(tttleft2() * tttleft3() * tttleft5() * tttleft7() * tttleft11()); 
}	



public int tttmulend(){
return tttmulout() * mulout(); 
}










public double leftdiv() {
	return Math.round(bpowadd()*1000.0/powadd())/1000.0;
			
}







public String quesle() {
	 if (S33 == 0) {
		 return "";
	 }
		return String.valueOf("+" + S33);
	}



public String quesri() {
	 if (S32 == 0) {
		 return "";
	 }
		return String.valueOf("+" + S32);
	}





public int sumle() {
	 
		return ((t2()*S33) + (t3()*S33) + (t5()*S33) + (t7()*S33) + (t11()*S33) + (t13()*S33));
	}



public String nequesle() {
	 if (S33 == 0) {
		 return "";
	 }
		return String.valueOf("+" + ((t2()*S33) + (t3()*S33) + (t5()*S33) + (t7()*S33) + (t11()*S33) + (t13()*S33)));
	}





public int sumri() {
	 
	return ((bt2()*S32) + (bt3()*S32) + (bt5()*S32) + (bt7()*S32) + (bt11()*S32) + (bt13()*S32));
}




public String nequesri() {
	 if (S32 == 0) {
		 return "";
	 }
		return String.valueOf("+" + ((bt2()*S32) + (bt3()*S32) + (bt5()*S32) + (bt7()*S32) + (bt11()*S32) + (bt13()*S32)));
	}




public String odanequesle() {
	 if (S33 == 0) {
		 return "";
	 }
		return String.valueOf("-" + sumle());
	}



public String odanequesri() {
	 if (S32 == 0) {
		 return "";
	 }
		return String.valueOf("-" + sumri());
	}




public int solvele() {
	 return powadd() - sumri();
}


public int solveri() {
	 return bpowadd() - sumle();
}



public double solvelend() {
	 return Math.round(solvele()*1000.0/bpowadd())/1000.0;
}


public double solverind() {
	 return Math.round(solveri()*1000.0/powadd())/1000.0;
}






public String odari() {
		return String.valueOf(" - " + bpowadd());
	}

public int bbunk() {
	return powadd() - bpowadd();
}



public int solvebb() {
	 return sumri() - sumle();
}



public double bbend() {
	if (bbunk() == 0)
		return 0;
	 return Math.round(solvebb()*1000.0/bbunk())/1000.0;
}






















	
	

	public Calctdsuil(String rollNo, int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15,
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
	
	
	
	public Calctdsuil() {
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