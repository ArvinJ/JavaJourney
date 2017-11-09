package com.ahhf.ljxbw.factory.pattern;

/**
 * 
 * @description 减法运算类
 * @author wenjin.zhu
 * @Date 2017年11月9日
 */
public class OperationSubtraction extends Operation {

	@Override
	public double gainResult() {

		return getReferenceValue() - getAnotherReferenceValue();
	}

}
