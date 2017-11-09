package com.ahhf.ljxbw.factory.pattern;

public class Son extends Father {
	private Double height;

	@Override
	public void cookDinner() {
		System.out.println("学习做饭");
	}

	public void typeTheCodes() {
		System.out.println("撸代码");
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
		 * 对于多态，可以总结它为：
		 * 
		 * 一、使用父类类型的引用指向子类的对象；
		 * 
		 * 二、该引用只能调用父类中定义的方法和变量；
		 * 三、如果子类中重写了父类中的一个方法，那么在调用这个方法的时候，将会调用子类中的这个方法；（动态连接、动态调用）
		 * 四、变量不能被重写（覆盖），”重写“的概念只针对方法，如果在子类中”重写“了父类中的变量，那么在编译时会报错。 多态的3个必要条件：
		 * 1.继承 2.重写 3.父类引用指向子类对象。 向上转型： Person p = new Man() ; //向上转型不需要强制类型转化
		 * 向下转型： Man man = (Man)new Person() ; //必须强制类型转化
		 */

		Father jack = new Son();

		jack.moveBrick();
		jack.setAge(28);
		jack.setWisdom(120);

		System.out.println(jack.toString());

		jack.cookDinner();// 对于父类中定义的方法，如果子类中重写了该方法，那么父类类型的引用将会调用子类中的这个方法，这就是动态连接。也可以叫做动态绑定。
		((Son) jack).typeTheCodes();
	}
}
