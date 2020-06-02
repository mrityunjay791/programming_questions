package com.datastructure.tree.binarysearchtree;

import com.nodes.TreeNode;

/**
 * Binary search tree implementation.
 *
 * Let us create following BST 
 *            50 
 *         /     \ 
 *         30      70 
 *       /  \    /  \ 
 *     20   40  60   80
 *
 * @author mrityunjaykumar
 *
 */
public class BinarySearchTreeImplementation {
	static TreeNode root;
	
	 BinarySearchTreeImplementation() {
		root = null;
	}
	
	/**
	 * Insert utility method.
	 * 
	 * @param data
	 */
	public void insert(int data) {
		root = insertRec(root, data);
	}
	
	/**
	 * Inserting record.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public static TreeNode insertRec(TreeNode root, int data) {
		if(root == null) {
			root = new TreeNode(data);
			return root;
		}
		
		if(data < root.data) {
			root.left = insertRec(root.left, data);
		} else {
			root.right = insertRec(root.right, data);
		}
		
		return root;
	}
	
	/**
	 * Method to search node in binary search tree.
	 * 
	 * @param root
	 * @param key
	 * @return
	 */
	public static TreeNode searchNode(TreeNode root, int key) {
		if(root == null || root.data == key) {
			return root;
		}
		
		if(key < root.data) {
			return searchNode(root.left, key);
		}
		
		return searchNode(root.right, key);
		
	}

	/**
	 * Printing data.
	 * 
	 * @param root
	 */
	public void printData(TreeNode root) {
		if(root == null) {
			return;
		}
		
		printData(root.left);
		System.out.print(root.data+" ");
		printData(root.right);
		
	}
	
	
	public static void main(String[] args) {
		BinarySearchTreeImplementation tree = new BinarySearchTreeImplementation();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);
        
        tree.printData(root);
        
        TreeNode node = searchNode(root, 60);
        if(node != null) {
        	System.out.println("\nFound......");
        } else {
        	System.out.println("\nNot found");
        }
	}

}