package me.utlight.Spring.aop05;


import org.springframework.stereotype.Service;

//被代理的目标类
@Service("math")
public class Math {

	public int add(int n1, int n2){
		int result = n1 +n2;
		System.out.println(n1 + "+" + n2 + "=" +result);
		return result;
	}
	
	public int sub(int n1, int n2){
		int result = n1 - n2;
		System.out.println(n1 + "-" + n2 + "=" +result);
		return result;
	}
	
	public int mut(int n1, int n2){
		int result = n1 * n2;
		System.out.println(n1 + "*" + n2 + "=" +result);
		return result;
	}
	
	public int div(int n1, int n2){
		int result = n1 / n2;
		System.out.println(n1 + "/" + n2 + "=" +result);
		return result;
	}
}
