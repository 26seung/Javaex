package com.javaex.thread.synchronize;

public class User extends Thread{

	private SharedMemory memory;
	private int data;
	
	// 생성자
	public User(String name, SharedMemory memory, int data) {
		this.setName(name);
		this.memory = memory;
		this.data = data;
	}

	@Override
	public void run() {
		// Thread 가 시작되면 내가 전달받은 메모리에 생성받은 데이터에 집어넣으므로 
		if ( memory != null) {
			memory.setMemory(data);
		}
	}
	
}
