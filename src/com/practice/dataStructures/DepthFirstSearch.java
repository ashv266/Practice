package com.practice.dataStructures;

import java.util.Stack;

public class DepthFirstSearch {

	public static TreeNode getUnvisitedChild(TreeNode node){
		if(node.left()!=null){
			if(!node.left().visitedNode())
				return node.left();
		}
		if(node.right()!=null){
			if(!node.right().visitedNode())
				return node.right();
		}
		return null;
	}
	
	public static void serializeDFS(TreeNode node){
		Stack<TreeNode> dfsStack = new Stack<>();
		dfsStack.add(node);
		System.out.println(node.Val());
		while(!dfsStack.isEmpty()){
			TreeNode topNode = dfsStack.peek();
			TreeNode child = getUnvisitedChild(topNode);
			if(child!=null){
				child.setVisitedNode(true);
				dfsStack.add(child);
				System.out.println(child.Val());
			}
			else{
				dfsStack.pop();
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
		serializeDFS(root);
	}
}
