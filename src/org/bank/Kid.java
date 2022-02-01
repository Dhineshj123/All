package org.bank;

import java.util.ArrayList;
import java.util.List;

public class Kid {
	
	
	public static void main(String[] args) {
		
		
		
		
		BankInfo s=new BankInfo();
		s.setEmpId(200);
		s.setEmpName("ajith");
		s.setEmpNumber(123234l);
		
		BankInfo s1=new BankInfo();
		s1.setEmpId(200);
		s1.setEmpName("ajith");
		s1.setEmpNumber(123234l);
		
		BankInfo s2=new BankInfo();
		s2.setEmpId(200);
		s2.setEmpName("ajith");
		s2.setEmpNumber(123234l);
		
		
		List<BankInfo>li=new ArrayList<>();
		li.add(s);
		li.add(s1);
		li.add(s2);
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i).getEmpId());
			System.out.println(li.get(i).getEmpName());
			System.out.println(li.get(i).getEmpNumber());
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}

}
