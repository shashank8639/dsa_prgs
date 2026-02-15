package com.java_dsa.ashmaps;

public class MyhashMap<K, V> {

	private HashNode<K, V> buckets[];
	private int capacity = 16;
	private int size = 0;
	
	public MyhashMap() {
		buckets = new HashNode[capacity];
	}
	
	private int getBucketIndex(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public void put(K key, V value) {
		int index = getBucketIndex(key);
		HashNode<K, V> head = buckets[index];
		
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		size++;
		head = buckets[index];
		HashNode<K, V> newNode = new HashNode<>(key, value);
		newNode.next = head;

		buckets[index] = newNode;
	}
	
	public V get(K key) {
		int index = getBucketIndex(key);
		HashNode<K, V> head = buckets[index];
		
		while(head != null) {
			if(head.key.equals(key)) 
				return head.value;
			head = head.next;
		}
		return null;
	}
	
	public V remove(K key) {
		int index = getBucketIndex(key);
		HashNode<K, V> head= buckets[index];
		HashNode<K, V> prev = null;
		
		while(head != null) {
			if(head.key.equals(key)) {
				size--;
				if(prev != null)
					prev.next = head.next;
				else
					buckets[index] = head.next;
				return head.value;
			}
			prev = head;
			head = head.next;
		}
		
		return null;
	}
	
	public int size() {
		return size;
	}
	
	public boolean containsKey(K key) {
		return get(key) != null;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("{");

	    for (int i = 0; i < capacity; i++) {
	        HashNode<K, V> node = buckets[i];
	        while (node != null) {
	            sb.append(node.key).append("=").append(node.value).append(", ");
	            node = node.next;
	        }
	    }

	    // Remove last comma + space
	    if (sb.length() > 1) {
	        sb.setLength(sb.length() - 2);
	    }

	    sb.append("}");
	    return sb.toString();
	}
	
	private class HashNode<K, V> {
		
		K key;
		V value;
		HashNode<K, V> next;
		public HashNode(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
	}
}
