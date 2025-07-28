import java.util.*;
class LRUCache {
    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        Node(int k,int v){
            key=k;
            value=v;
        }
    }
    private final int capacity;
    private final HashMap<Integer,Node>map;
    private final Node head,tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node=map.get(key);
        remove(node);
        insertAtFirst(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        Node newNode=new Node(key,value);
        insertAtFirst(newNode);
        map.put(key,newNode);
        if(map.size()>capacity){
            Node lru=tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
    }
    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insertAtFirst(Node node){
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */