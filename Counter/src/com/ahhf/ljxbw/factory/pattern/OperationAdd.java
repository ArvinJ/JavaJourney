package com.ahhf.ljxbw.factory.pattern;

/**
 * 
 * @description 加法运算
 * @author wenjin.zhu
 * @Date 2017年11月9日
 */
public class OperationAdd extends Operation {
	@Override
	public double gainResult() {
		return getReferenceValue() + getAnotherReferenceValue();
	}

}
