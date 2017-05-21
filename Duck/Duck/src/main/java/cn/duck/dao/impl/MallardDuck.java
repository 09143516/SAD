package cn.duck.dao.impl;

public class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public String swim(){
		return super.swim();
	}
	public String display(){
		String a = "Ò°ÉúµÄ";
		String b = super.display();
		return a+b;
	}
}
