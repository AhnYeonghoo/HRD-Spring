package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // static ����
	
	
	@RequestMapping("/hello")
	public void main() {
		System.out.println(iv);
		System.out.println(cv);
		System.out.println("hello");
	}
	
	public static void main2() {
//		System.out.println(iv);
		System.out.println(cv);
	}

}
