package Stacks_Queues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Dijikstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, ArrayList<Node>> map = new HashMap<Integer, ArrayList<Node>>();
		
		map.put(1,new ArrayList<>());
		map.get(1).add(new Node(2, 10));             
		map.get(1).add(new Node(3, 5));
		map.put(2, new ArrayList<>());
		map.get(2).add(new Node(3, 5));
		map.put(3, new ArrayList<>());
		
		dijiskstra(1,map);
		
		

	}
	private static void dijiskstra(int n, HashMap<Integer, ArrayList<Node>> map) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Node> pq = new PriorityQueue<Dijikstra.Node>((a,b)->a.time-b.time);
		
		HashMap<Integer, Integer> dist = new HashMap<Integer, Integer>();
		for(int i1=1;i1<=3;i1++) {
			dist.put(i1, Integer.MAX_VALUE);
		}
		dist.put(1, 0);
		pq.add(new Node(n, 0));
		
		while(!pq.isEmpty()) {
			Node v = pq.poll();
			
			
			for(Node u : map.get(v.node)) {
				//System.out.println(u.node);
				if(u.time+v.time < dist.get(u.node)) {
					dist.put(u.node, u.time+v.time);
					pq.add(new Node(u.node, dist.get(u.node)));
				}
			}
		}
		for(int i= 1;i<=3;i++) {
			System.out.println(dist.get(i));
		}
		
	}
	static class Node{
		int node;
		int time;
		Node(int node,int time){
			this.node = node;
			this.time = time;
		}
	}
}
