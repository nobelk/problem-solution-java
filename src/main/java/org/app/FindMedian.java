package org.app;

import java.util.*;

public class FindMedian {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public FindMedian(){
        this.minHeap = new PriorityQueue<>((a,b) -> a-b);
        this.maxHeap = new PriorityQueue<>((a,b) -> b-a);
    }

    public void insertNum(int number){
        if(this.maxHeap.isEmpty() || this.maxHeap.peek() > number){
            this.maxHeap.offer(number);
        }
        else{
            this.minHeap.offer(number);
        }

        if(this.maxHeap.size() > this.minHeap.size() + 1){
            this.minHeap.offer(this.maxHeap.poll());
        }
        else if(this.maxHeap.size() < this.minHeap.size()){
            this.maxHeap.offer(this.minHeap.poll());
        }
    }

    public double findMedian(){
        if(this.minHeap.size() == this.maxHeap.size()){
            return this.minHeap.peek()/2.0 + this.maxHeap.peek()/2.0;
        }

        // max heap has one more element than the min heap
        return (double)maxHeap.peek();
    }

    public static void main(String[] args) {
        FindMedian medianOfAStream = new FindMedian();
        medianOfAStream.insertNum(3);
        medianOfAStream.insertNum(1);
        System.out.println("The median is: " + medianOfAStream.findMedian());
        medianOfAStream.insertNum(5);
        System.out.println("The median is: " + medianOfAStream.findMedian());
        medianOfAStream.insertNum(4);
        System.out.println("The median is: " + medianOfAStream.findMedian());
    }

}
