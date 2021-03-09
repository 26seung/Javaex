package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue 는 인터페이스 ,  실페 클래스는   List 관련 실체 클래스를 사용
		Queue<Integer> queue = new LinkedList<>();
		
		// 데이터 제공
		for (int i = 0 ; i<10; i++) {
			queue.offer(i);
			System.out.println("QUEUE: " + queue);
		}

		// 데이터 확인
		int item = queue.peek();
		System.out.println("PEEK: " + item);
		System.out.println("Queue: " + queue);
		item = queue.poll();
		System.out.println("POLL: " + item);
		System.out.println("Queue: " + queue);
		
		
		// queue 에서 poll 을 사용 할 때,
		// 비어있는지 반드시 확인 해주자
//		while(!queue.isEmpty()) {
//			System.out.println("POOL: " + queue.poll());
//			System.out.println("Queue: " + queue);
//		}
		
	}

}
