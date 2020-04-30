package com.datastructure.tree;

/**
 * Check symmetricity of a binary tree.
 * 
 * @author mrityunjaykumar
 *
 */
public class CheckSymetricBinaryTree {

	TreeNode root;
	CheckSymetricBinaryTree() {
		root = null;
	}
	
//	private static TreeNode insertNode(TreeNode root, int key) {
//		if(root == null) {
//			return new TreeNode(key);
//		}
//		
//		Queue<TreeNode> q = new LinkedList<TreeNode>();
//		q.add(root);
//		
//		TreeNode node = null;
//		while(!q.isEmpty()) {
//			node = q.peek();
//			q.remove();
//			
//			if(node.left == null) {
//				node.left = new TreeNode(key);
//				break;
//			} else {
//				q.add(node.left);
//			}
//			
//			if(node.right == null) {
//				node.right = new TreeNode(key);
//				break;
//			} else {
//				q.add(node.right);
//			}
//		}
//		
//		return root;
//	}
	
	/**
	 * Checking left & right node for symmetricity.
	 * 
	 * @param root1
	 * @param root2
	 * @return
	 */
	private static boolean checkSymmetricity(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		
		if(root1 != null && root2 != null && root1.data == root2.data) {
			return checkSymmetricity(root1.left, root2.right) && checkSymmetricity(root1.right, root2.left);
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		CheckSymetricBinaryTree tree = new CheckSymetricBinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(2);
		tree.root.left.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(4);
		tree.root.right.left = new TreeNode(4);
		tree.root.right.right = new TreeNode(3);
		
		
		TreeImplementation.treeTraverse(tree.root);
		
		boolean isSymmetric = checkSymmetricity(tree.root, tree.root);
		if(isSymmetric) {
			System.out.println("\nTree is Symmetric..!!");
		} else {
			System.out.println("\nTree is NOT Symmetric..!!");
		}
		
	}

}
