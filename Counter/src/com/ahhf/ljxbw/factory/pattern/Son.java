package com.ahhf.ljxbw.factory.pattern;

public class Son extends Father {
	private Double height;

	@Override
	public void cookDinner() {
		System.out.println("ѧϰ����");
	}

	public void typeTheCodes() {
		System.out.println("ߣ����");
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Son [height=" + height + ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {

		/**
		 * ���ڶ�̬�������ܽ���Ϊ��
		 * 
		 * һ��ʹ�ø������͵�����ָ������Ķ���
		 * 
		 * ����������ֻ�ܵ��ø����ж���ķ����ͱ�����
		 * ���������������д�˸����е�һ����������ô�ڵ������������ʱ�򣬽�����������е��������������̬���ӡ���̬���ã�
		 * �ġ��������ܱ���д�����ǣ�������д���ĸ���ֻ��Է���������������С���д���˸����еı�������ô�ڱ���ʱ�ᱨ�� ��̬��3����Ҫ������
		 * 1.�̳� 2.��д 3.��������ָ��������� ����ת�ͣ� Person p = new Man() ; //����ת�Ͳ���Ҫǿ������ת��
		 * ����ת�ͣ� Man man = (Man)new Person() ; //����ǿ������ת��
		 */

		Father jack = new Son();

		jack.moveBrick();
		jack.setAge(28);
		jack.setWisdom(120);

		System.out.println(jack.toString());

		jack.cookDinner();// ���ڸ����ж���ķ����������������д�˸÷�������ô�������͵����ý�����������е��������������Ƕ�̬���ӡ�Ҳ���Խ�����̬�󶨡�
		((Son) jack).typeTheCodes();
	}
}
