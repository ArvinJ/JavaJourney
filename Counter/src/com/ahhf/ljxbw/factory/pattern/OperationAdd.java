package com.ahhf.ljxbw.factory.pattern;

/**
 * 
 * @description �ӷ�����
 * @author wenjin.zhu
 * @Date 2017��11��9��
 */
public class OperationAdd extends Operation {
	@Override
	public double gainResult() {
		return getReferenceValue() + getAnotherReferenceValue();
	}

}
