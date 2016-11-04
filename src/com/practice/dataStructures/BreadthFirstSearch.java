package com.practice.dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public static TreeNode getUnvisitedChildren(TreeNode node){
		if(node.left() != null){
			if(!node.left().visitedNode())
				return node.left();
		}
		if(node.right() != null){
			if(!node.right().visitedNode() && node.right().Val()!=null)
				return node.right();
		}
		return null;
	}
	
	public static void serializeBFS(TreeNode node){
		Queue<TreeNode> bfsQueue = new LinkedList<>(); 
		bfsQueue.add(node);
		System.out.println("Root:"+ node.Val());
		while(!bfsQueue.isEmpty()){
			TreeNode visitingNode = bfsQueue.remove();
			if(visitingNode != null){
				TreeNode child = null;
				while((child = getUnvisitedChildren(visitingNode)) !=null){
					child.setVisitedNode(true);
					System.out.println("Child:"+child.Val());
					bfsQueue.add(child);
				}
			}
		}
		
	}
	
	private static TreeNode createSampleTree(){
		TreeNode root = new TreeNode(15);
		TreeNode a = new TreeNode(8);
		TreeNode b = new TreeNode(16);
		TreeNode c = new TreeNode(7);
		TreeNode d = new TreeNode(10);
		TreeNode e = new TreeNode(6);
		TreeNode f = new TreeNode(9);
		
		root.setLeft(a);
		root.setRight(b);
		a.setLeft(c);
		a.setRight(d);
		c.setLeft(e);
		c.setRight(f);
		
		return root;
	}
	
	public static void main(String[] args){
		TreeNode root = createSampleTree();
		serializeBFS(root);
	}
}
