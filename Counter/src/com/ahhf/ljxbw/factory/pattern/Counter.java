package com.ahhf.ljxbw.factory.pattern;

/**
 * 
 * @description �򵥹���ģʽʵ��
 * @author wenjin.zhu
 * @Date 2017��11��9��
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
