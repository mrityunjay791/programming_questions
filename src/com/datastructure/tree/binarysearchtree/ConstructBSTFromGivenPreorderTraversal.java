package com.datastructure.tree.binarysearchtree;

import com.nodes.TreeNode;

class Index {
	int index;
}

/**
 * Given preorder traversal of a binary search tree, construct the BST.
 * 
 * @author mrityunjaykumar
 *
 */
public class ConstructBSTFromGivenPreorderTraversal {

	static Index indexObj = new Index();
	
	public ConstructBSTFromGivenPreorderTraversal() {
		indexObj.index = 0;
	}
	
	/**
	 * Constructing tree from preorder traversal.
	 * 
	 * @param arr
	 * @param index
	 * @param low
	 * @param high
	 * @param size
	 * @return
	 */
	public static TreeNode constructBSTFromPreorder(int arr[], Index index, int low, int high, int size) {
		
		if(index.index >= size || low > high) {
			return null;
		}
		
		TreeNode root = new TreeNode(arr[index.index]);
		index.index = index.index + 1;;
		
		if(low == high) {
			return root;
		}
		
		int i = 0;
		for(i = low; i <= high; i++) {
			if(arr[i] > root.data) {
				break;
			}
		}
		
		root.left = constructBSTFromPreorder(arr, index, index.index, i - 1, size);
		root.right = constructBSTFromPreorder(arr, index, i, high, size);
		
		return root;
	}
	
	/**
	 * Utility method to construct BST from preorder.
	 * 
	 * @param arr
	 * @param size
	 * @return
	 */
	public static TreeNode constructBSTFromPreorderUtil(int arr[], int size) {
		return constructBSTFromPreorder(arr, indexObj ,0, size - 1, size);
	}
	
	/**
	 * Printing nodes.
	 * 
	 * @param root
	 */
	public static void printInorder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = new int[]{10, 5, 1, 7, 40, 50};
		TreeNode root = constructBSTFromPreorderUtil(arr, arr.length);
		System.out.println("Inorder Traversal");
		printInorder(root);
	}

}
