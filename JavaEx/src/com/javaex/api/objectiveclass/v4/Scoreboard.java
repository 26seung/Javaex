package com.javaex.api.objectiveclass.v4;

import java.util.Arrays;

public class Scoreboard implements Cloneable{
	// 참조형 필드
	private int[] scores;
	
	// 생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
		
	}
	// getter/setter
	
	public int[] getScores() {
		return scores;
	}

	
	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();		// 복제
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	// 같은 복제를 위해 내부 참조 필드를 복제
	// clone 메서드를 재정의 (오버라이브)
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복제를 시도
		Scoreboard clone = (Scoreboard)super.clone();
		//내부 참조핗드를 복제 (낖깊은복제)
		clone.scores = Arrays.copyOf(scores,scores.length);			
		
		return super.clone();
	}
	
}
