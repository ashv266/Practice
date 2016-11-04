package com.practice.dataStructures;

public class TreeNode {

	private Integer val;
	private Boolean visitedNode=false;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(Integer val){
		this.setVal(val);
		this.setLeft(null);
		this.setRight(null);
	}

	public Integer Val() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

	public Boolean visitedNode() {
		return visitedNode;
	}

	public void setVisitedNode(Boolean visitedNode) {
		this.visitedNode = visitedNode;
	}

	public TreeNode left() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode right() {
		return right;
	}

	public TreeNode setRight(TreeNode right) {
		this.right = right;
		return right;
	}
}
