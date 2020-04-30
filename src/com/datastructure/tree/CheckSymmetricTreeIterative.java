package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Check Symmetricity of the tree using iterative method.
 * 
 * @author mrityunjaykumar
 *
 */
public class CheckSymmetricTreeIterative {
	TreeNode root;
	
	public CheckSymmetricTreeIterative() {
		root = null;
	}
	
	/**
	 * Check tree symmetricity using iterative method.
	 * 
	 * @param root
	 * @return
	 */
	private static boolean checkSymmetricity(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root.left);
		q.add(root.right);
		
		while(!q.isEmpty()) {
//			TreeNode node1 = q.peek();
			TreeNode node1 = q.remove();
//			TreeNode node2 = q.peek();
			TreeNode node2 = q.remove();
			
			if(node1 == null && node2 == null) {
				continue;
			}
			if((node1 != null && node2 == null) || (node1 == null && node2 != null)) {
				return false;
			}
			
			if(node1.data != node2.data) {
				return false;
			}
			
			q.add(node1.left);
			q.add(node2.right);
			q.add(node1.right);
			q.add(node2.left);
			
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		CheckSymmetricTreeIterative tree = new CheckSymmetricTreeIterative();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(2);
		tree.root.left.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(4);
		tree.root.right.left = new TreeNode(4);
		tree.root.right.right = new TreeNode(3);
		
		
		TreeImplementation.treeTraverse(tree.root);
		
		boolean isSymmetric = checkSymmetricity(tree.root);
		if(isSymmetric) {
			System.out.println("\nTree is Symmetric..!!");
		} else {
			System.out.println("\nTree is NOT Symmetric..!!");
		}
	}

}
