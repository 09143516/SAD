package cn.duck.dao.impl;

public class RubberDuck extends Duck{
	public RubberDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public String swim(){
		return super.swim();
	}
	public String display(){
		String a = "Ïð½ºµÄ";
		String b = super.display();
		return a+b;
	}
}
