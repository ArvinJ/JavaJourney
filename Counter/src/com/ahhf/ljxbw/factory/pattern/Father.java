package com.ahhf.ljxbw.factory.pattern;

/**
 * 
 * @description ����
 * @author wenjin.zhu
 * @Date 2017��11��9��
 */
public class Father {
	/**
	 * �ǻ�
	 */
	private Integer wisdom;
	/**
	 * ����
	 */
	private Integer age;

	public Integer getWisdom() {
		return wisdom;
	}

	public void setWisdom(Integer wisdom) {
		this.wisdom = wisdom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void cookDinner() {
		System.out.println("����");
	}

	public void moveBrick() {
		System.out.println("��ש");
	}

	@Override
	public String toString() {
		return "Father [wisdom=" + wisdom + ", age=" + age + "]";
	}

}
