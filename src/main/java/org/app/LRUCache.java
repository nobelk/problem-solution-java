package org.app;

import java.util.Map;
import java.util.HashMap;

class DLinkedNode {
    public int key;

    public int val;
    public DLinkedNode next;
    public DLinkedNode prev;
}

public class LRUCache {

    Map<Integer, DLinkedNode> cache;
    DLinkedNode head, tail;

    private int size;
    private int capacity;

    public LRUCache(int capacity){
        this.cache = new HashMap<>();
        this.head = new DLinkedNode();
        this.tail = new DLinkedNode();
        this.head.next = tail;
        this.tail.prev = head;
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int key){
        if(this.cache.containsKey(key)){
            DLinkedNode node = this.cache.get(key);
            this.moveToHead(node);
            return node.val;
        }
        else{
            return -1;
        }
    }

    private void addNode(DLinkedNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private DLinkedNode popTail(){
        DLinkedNode res = this.tail.prev;
        this.removeNode(res);
        return res;
    }

    private void moveToHead(DLinkedNode node){
        this.removeNode(node);
        this.addNode(node);
    }

    public void put(int key, int val){

        if(this.cache.containsKey(key)){
            DLinkedNode node = this.cache.get(key);
            node.val = val;
            this.moveToHead(node);
        }
        else{
            DLinkedNode tempNode = new DLinkedNode();
            tempNode.key = key;
            tempNode.val = val;

            cache.put(key, tempNode);
            addNode(tempNode);

            ++size;

            if(size>capacity){
                DLinkedNode res = this.popTail();
                this.cache.remove(res.key);
                size--;
            }
        }
    }

    public static void main(String[] args){
        LRUCache lc = new LRUCache(2);
        int r = 0;
        lc.put(1, 1);
        lc.put(2, 2);
        r = lc.get(1);
        lc.put(3, 3);
        r = lc.get(2);
        lc.put(4, 4);
        r = lc.get(1);
        r = lc.get(3);
        r = lc.get(4);
    }
}
