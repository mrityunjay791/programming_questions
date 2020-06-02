package com.datastructure.tree.binarysearchtree;

import java.util.Stack;

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
	 * 
	 * @return
	 */
	public static TreeNode constructBSTFromPreorder(int arr[], Index index, int low, int high, int size) {

		if (index.index >= size || low > high) {
			return null;
		}

		TreeNode root = new TreeNode(arr[index.index]);
		index.index = index.index + 1;

		if (low == high) {
			return root;
		}

		int i = 0;
		for (i = low; i <= high; i++) {
			if (arr[i] > root.data) {
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
	 * 
	 * @return
	 */
	public static TreeNode constructBSTFromPreorderUtil(int arr[], int size) {
		return constructBSTFromPreorder(arr, indexObj, 0, size - 1, size);
	}

	/**
	 * Constructing tree from preorder traversal with O(n) complexity.
	 * 
	 * @param arr
	 * @param index
	 * @param low
	 * @param high
	 * @param size
	 * 
	 * @return
	 */
	public static TreeNode constructBSTFromPreorderMethod2(int arr[], Index index, int key, int min, int max,
			int size) {

		if (index.index >= size) {
			return null;
		}

		TreeNode root = null;

		if (key > min && key < max) {
			root = new TreeNode(key);
			index.index = index.index + 1;
			if (index.index < size) {
				root.left = constructBSTFromPreorderMethod2(arr, index, arr[index.index], min, key, size);
				root.right = constructBSTFromPreorderMethod2(arr, index, arr[index.index], key, max, size);
			}

		}

		return root;
	}

	/**
	 * Utility method to construct BST from preorder with O(n) complexity.
	 * 
	 * @param arr
	 * @param size
	 * 
	 * @return
	 */
	public static TreeNode constructBSTFromPreorderUtilMethod2(int arr[], int size) {

		return constructBSTFromPreorderMethod2(arr, indexObj, arr[0], Integer.MIN_VALUE, Integer.MAX_VALUE, size);
	}

	/**
	 * Printing nodes.
	 * 
	 * @param root
	 */
	public static void printInorder(TreeNode root) {
		if (root == null) {
			return;
		}

		printInorder(root.left);
		System.out.print(root.data + " ");
		printInorder(root.right);
	}

	/**
	 * Constructing BST from preorder traversal using iterative method.
	 * 
	 * @param arr
	 * @param size
	 * @return
	 */
	public static TreeNode constructBSTFromPreorderUsingStack(int arr[], int size) {
		Stack<TreeNode> st = new Stack<>();
		TreeNode root = new TreeNode(arr[0]);
		st.push(root);

		for (int i = 1; i < size; i++) {
			TreeNode temp = null;

			while (!st.isEmpty() && arr[i] > st.peek().data) {
				temp = st.pop();
			}

			if (temp != null) {
				temp.right = new TreeNode(arr[i]);
				st.push(temp.right);
			} else {
				temp = st.peek();
				temp.left = new TreeNode(arr[i]);
				st.push(temp.left);
			}
		}

		return root;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 5, 1, 7, 40, 50 };

		TreeNode root = constructBSTFromPreorderUtil(arr, arr.length);

		indexObj.index = 0;
		TreeNode root2 = constructBSTFromPreorderUtilMethod2(arr, arr.length);

		System.out.println("Inorder Traversal");
		printInorder(root);

		System.out.println("\nInorder Traversal with O(n)");
		printInorder(root2);

		System.out.println("\nInorder Traversal with O(n) using Iterative method");
		TreeNode root3 = constructBSTFromPreorderUsingStack(arr, arr.length);
		printInorder(root3);
	}

}
