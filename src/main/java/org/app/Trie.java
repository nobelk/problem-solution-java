package org.app;


public class Trie {
    public Trie[] nodes;
    public boolean isLeafNode;

    public Trie(){
        this.isLeafNode = false;
        this.nodes = new Trie[256];
    }

    public boolean search(String key){
        int index = 0;
        Trie tr = this;
        Trie prev = null;
        for(;index<key.length();index++){
            if(tr.nodes[key.charAt(index)]==null){
                return false;
            }
            prev = tr;
            tr = tr.nodes[key.charAt(index)];
        }

        // denotes if this is a word in the dictionary
        return prev.nodes[key.charAt(index-1)].isLeafNode;
    }

    public void add(String key){
        Trie tr = this;
        int index = 0;
        Trie prev = null;
        for(;index<key.length(); index++){
            if(tr.nodes[key.charAt(index)] == null){
                tr.nodes[key.charAt(index)] = new Trie();
            }
            prev = tr;
            tr = tr.nodes[key.charAt(index)];
        }

        // index = key.length
        prev.nodes[key.charAt(index-1)].isLeafNode = true;
        return;
    }

    public static void main(String[] args){
        Trie root = new Trie();
        root.add("TheQuickBrownFoxJumpsOverALazyDog");
        System.out.println(root.search("The"));
        System.out.println(root.search("TheQuickBrownFoxJumpsOverALazyDog"));
    }
}
