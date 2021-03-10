package com.javaex.thread.v3;

public class AlphabetRunnable implements Runnable {

	@Override
	public void run() {
		// main thread = A ~ Z 출력
		for(char ch='A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread: " + ch);
			
			// 잠시 대기
			try {
				Thread.sleep(300);		// 0.3 초 대기
			}	catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
