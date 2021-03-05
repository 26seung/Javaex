package com.javaex.oop.summary;

// 상속이 단일 상속만 가능
// 인터페이스는 다중 구현이 가능
public class TheOne extends Human implements KungfuSkill, Flyable {

	public TheOne(String name,int age) {
		super(name,age);
	}

	@Override
	public void fly() {
		System.out.println(name + ": I believe I can fly~");
		
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": I know kungfu!");
		
	}
}
