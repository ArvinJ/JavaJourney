package com.ahhf.ljxbw.factory.pattern;

/**
 * 
 * @description ����������
 * @author wenjin.zhu
 * @Date 2017��11��9��
 */
public class OperationSubtraction extends Operation {

	@Override
	public double gainResult() {

		return getReferenceValue() - getAnotherReferenceValue();
	}

}
