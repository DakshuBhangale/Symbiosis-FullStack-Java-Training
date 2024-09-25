
package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
    public static void method1() {//priority queue method
    	PriorityQueue queue = new PriorityQueue();
    	queue.add("10");
    	queue.add("20");
    	queue.add("30");
    	queue.add("40");
    	queue.add("50");
    	System.out.println("Head : "+queue.element());
    	System.out.println("Head : "+queue.peek());
    	System.out.println("iterating the queue elements:");
    	Iterator it = queue.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next());
    	}
    	queue.remove();
    	queue.poll();
    	System.out.println("After removing two elements: ");
    	Iterator<String> itr = queue.iterator();
    	while(itr.hasNext()) {
    		System.out.println(itr.next());
    	}
    }
    
    public static void method2() {//deque method
    	Deque deque = new ArrayDeque();
    	deque.add("10");
    	deque.add("20");
    	deque.add("30");
    	//traversing the elements
    	for(Object str : deque) {
    		System.out.println(str);
    	}	
    }
    
    public static void method3() {
    	Deque deque = new ArrayDeque();
    	deque.offer("11");
    	deque.offer("12");
    	deque.offer("13");
    	deque.offerFirst("14");
    	System.out.println("After offerfirst Traversal...");
    	for(Object s:deque) {
    		System.out.println(s);
    	}
    	//deque.poll();
    	//deque.pollFirst();//it is same as poll()
    	deque.pollLast();
    	System.out.println("After pollLast() Traversal...");
    	for(Object s:deque) {
    		System.out.println(s);
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       method1();
       System.out.println("---------------");
       method2();
       System.out.println("---------------");
       method3();
	}

}
