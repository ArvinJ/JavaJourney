package com.ahhf.ljxbw.factory.pattern;

/**
 * 
 * @description 父类
 * @author wenjin.zhu
 * @Date 2017年11月9日
 */
public class Father {
	/**
	 * 智慧
	 */
	private Integer wisdom;
	/**
	 * 年龄
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
		System.out.println("做饭");
	}

	public void moveBrick() {
		System.out.println("搬砖");
	}

	@Override
	public String toString() {
		return "Father [wisdom=" + wisdom + ", age=" + age + "]";
	}

}
