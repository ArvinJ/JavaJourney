package com.ahhf.ljxbw.factory.pattern;

/**
 * 
 * @description ������
 * @author wenjin.zhu
 * @Date 2017��11��9��
 */
public class Operation {

	private double referenceValue;
	private double anotherReferenceValue;

	/**
	 * ��ȡ���
	 * 
	 */

	public double gainResult() {

		return 0;
	}

	public double getReferenceValue() {
		return referenceValue;
	}

	public void setReferenceValue(double referenceValue) {
		this.referenceValue = referenceValue;
	}

	public double getAnotherReferenceValue() {
		return anotherReferenceValue;
	}

	public void setAnotherReferenceValue(double anotherReferenceValue) {
		this.anotherReferenceValue = anotherReferenceValue;
	}

}
