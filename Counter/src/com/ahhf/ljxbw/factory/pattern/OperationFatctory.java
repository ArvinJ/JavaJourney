package com.ahhf.ljxbw.factory.pattern;

/**
 * ���㹤����
 * 
 * @description
 * @author wenjin.zhu
 * @Date 2017��11��9��
 */
public class OperationFatctory {

	

	public static Operation createOperation(String str) {
		Operation oper = null;
		switch (str) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSubtraction();
			break;

		default:
			break;
		}

		return oper;
	}

}
