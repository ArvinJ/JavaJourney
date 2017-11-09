package com.ahhf.ljxbw.factory.pattern;

/**
 * 
 * @description 简单工厂模式实例
 * @author wenjin.zhu
 * @Date 2017年11月9日
 */
public class Counter {

	public static void main(String[] args) {
		Operation oper;
		oper = OperationFatctory.createOperation("+");
		oper.setAnotherReferenceValue(2);
		oper.setReferenceValue(6);
		System.out.println(oper.gainResult());
	}
}
