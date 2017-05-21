package cn.duck.dao.impl;

public class RedheadDuck extends Duck{
	public RedheadDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public String swim(){
		return super.swim();
	}
	public String display(){
		String a = "ºìÍ·µÄ";
		String b = super.display();
		return a+b;
	}
}
