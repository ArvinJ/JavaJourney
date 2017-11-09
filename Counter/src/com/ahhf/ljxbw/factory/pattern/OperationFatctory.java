package com.ahhf.ljxbw.factory.pattern;

/**
 * 运算工厂类
 * 
 * @description
 * @author wenjin.zhu
 * @Date 2017年11月9日
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
