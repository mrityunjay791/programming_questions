package com.datastructure.tree;

/**
 * This class is used for printing nodes by using various methods.
 * 
 * @author mrityunjaykumar
 *
 */
public class TreeTraversal {
	public static int maxL = 0;
	public static int nthCount = 0;
	TreeNode root;
	
	public TreeTraversal() {
		root = null;
	}

	/**
	 * Printing nodes using pr-eorder technique.
	 * 
	 * @param root
	 */
	public static void preOrderTravsersal(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrderTravsersal(root.left);
		preOrderTravsersal(root.right);
	}
	
	/**
	 * Printing nodes using in-order technique.
	 * 
	 * @param root
	 */
	public static void inOderTravsersal(TreeNode root) {
		if(root == null) {
			return;
		}
		inOderTravsersal(root.left);
		System.out.print(root.data + " ");
		inOderTravsersal(root.right);
	}
	
	/**
	 * Printing nodes using post-order technique.
	 * 
	 * @param root
	 */
	public static void postOrderTravsersal(TreeNode root) {
		if(root == null) {
			return;
		}
		postOrderTravsersal(root.left);
		postOrderTravsersal(root.right);
		System.out.print(root.data + " ");
	}
	
	/**
	 * Printing leaf nodes.
	 * 
	 * @param root
	 */
	public static void printLeafNodes(TreeNode root) {
		if(root == null) {
			return;
		} 
		printLeafNodes(root.left);
		if(root.left == null && root.right == null) {
			System.out.print(root.data + " ");
		}
		printLeafNodes(root.right);
	}
	
	/**
	 * Displaying left boundary nodes.
	 * 
	 * @param root
	 */
	public static void printLeftBoudaryNodes(TreeNode root) {
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			System.out.print(root.data+" ");
			printLeftBoudaryNodes(root.left);
		} else if(root.right != null) {
			System.out.print(root.data+" ");
			printLeftBoudaryNodes(root.right);
		}
	}
	
	/**
	 * Displaying right boundary nodes.
	 * 
	 * @param root
	 */
	public static void printOnlyRightBoundary(TreeNode root) {
		if(root == null) {
			return;
		}
		if(root.right != null) {
			System.out.print(root.data + " ");
			printOnlyRightBoundary(root.right);
		} else if(root.left != null) {
			System.out.print(root.data + " ");
			printOnlyRightBoundary(root.left);
		}
		
	}
	
	/**
	 * Printing only boundary nodes.
	 * 
	 * @param root
	 */
	public static void printOnlyBoundaryNodes(TreeNode root) {
		if(root == null) {
			return;
		}
		
		printLeftBoudaryNodes(root);
		printLeafNodes(root);
//		printLeafNodes(root.left);
//		printLeafNodes(root.right);
		printOnlyRightBoundary(root.right);
		
	}
	
	/**
	 * Used for printing left view nodes.
	 * 
	 * @param root
	 * @param level
	 */
	public static void printLeftView(TreeNode root, int level) {
		
		if(root == null) {
			return;
		}
		
		if(maxL < level) {
			System.out.print( root.data +" ");
			maxL = level;
		}
		
		printLeftView(root.left, level + 1);
		printLeftView(root.right, level + 1);
		
	}
	
	/**
	 * Print Nth node of in-order traversal.
	 * 
	 * @param root
	 * @param n
	 */
	public static void findNthNodeInInorderTraversal(TreeNode root, int n) {
		if(root == null) {
			return;
		}
		findNthNodeInInorderTraversal(root.left, n);
		nthCount++;
		if(nthCount == n) {
			System.out.println("\nresult: "+root.data);
		}
		findNthNodeInInorderTraversal(root.right, n);
		
	}

	
	
	/**
	 * Main stating point.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TreeTraversal tree = new TreeTraversal();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.left.left = new TreeNode(10);
		tree.root.right.right = new TreeNode(7);
	
		printLeftBoudaryNodes(tree.root);
		System.out.println();
		printLeftView(tree.root, 1);
		System.out.println();
		inOderTravsersal(tree.root);
		findNthNodeInInorderTraversal(tree.root, 7);
		
	}

}
