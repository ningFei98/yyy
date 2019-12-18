package com.woniu.demo_aop2;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public int save() {
		System.out.println("UserService.save()");
		//System.out.println(1/0);
		return 123;
	}
	
	public void save(int i) {
		System.out.println("UserService.save()");
		System.out.println(1/0);
	}
	
	public void exit() {
		System.out.println("UserService.exit()");
	}

}
