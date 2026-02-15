package com.java_dsa.balanstree;

public class TreeUsingPreIn {

	public static void main(String[] args) {

//		int[] pre = {1,2,4,7,5,8,3,6};
//		int[] in = {7, 4, 2, 5, 8, 1, 3, 6};

		int[] pre = { 1, 2, 4, 8, 11, 10, 7, 9, 12, 3, 5, 6 };
		int[] in = { 11, 8, 10, 4, 2, 7, 9, 12, 1, 5, 3, 6 };

		NodeBST<Integer> head = builtTreeUsingPreIn(pre, in);
		printBST(head);
		rootToLeafPathSumToK(head, 13);
		System.out.println("==============");
		nodesAtDistanceK(head, 2, 3);
	}

	private static void nodesAtDistanceK(NodeBST<Integer> root, int node, int k) {

		if (root == null)
			return;
		helperMethodNodesAtDistK(root, node, k);
	}

	private static int helperMethodNodesAtDistK(NodeBST<Integer> root, int node, int k) {
		if (root == null)
			return -1;

		if (root.data == node) {
			printNodesAtDistK(root, k);
			return 0;
		}

		int leftSubtreeDist = helperMethodNodesAtDistK(root.left, node, k);
		if (leftSubtreeDist != -1) {
			if (leftSubtreeDist + 1 == k) {
				System.out.print(root.data + " ");
			} else {
				int rightSubtreeDist = k - (leftSubtreeDist + 1) - 1;
				printNodesAtDistK(root.right, rightSubtreeDist);
			}
			return leftSubtreeDist + 1;
		}

		int rightSubtreeDist = helperMethodNodesAtDistK(root.right, node, k);
		if (rightSubtreeDist != -1) {
			if (rightSubtreeDist + 1 == k) {
				System.out.print(root.data + " ");
			} else {
				leftSubtreeDist = k - (rightSubtreeDist + 1) - 1;
				printNodesAtDistK(root.left, leftSubtreeDist);
			}
			return rightSubtreeDist + 1;
		}
		return -1;
	}

	private static void printNodesAtDistK(NodeBST<Integer> root, int k) {
		if (root == null || k < 0)
			return;

		if (k == 0) {
			System.out.print(root.data + " ");
			return;
		}

		printNodesAtDistK(root.left, k - 1);
		printNodesAtDistK(root.right, k - 1);
	}

	private static void rootToLeafPathSumToK(NodeBST<Integer> root, int k) {

		if (root == null)
			return;

		helperMethodRootPathSum(root, k, "");
	}

	private static void helperMethodRootPathSum(NodeBST<Integer> root, int k, String path) {

		if (root == null)
			return;
		if (root.left == null && root.right == null && root.data == k) {
			System.out.print(path + root.data);
			return;
		}
		path = path + root.data + " ";
		helperMethodRootPathSum(root.left, k - root.data, path);
		helperMethodRootPathSum(root.right, k - root.data, path);
	}

	private static void printBST(NodeBST<Integer> head) {

		if (head == null)
			return;
		System.out.print(head.data + ": ");
		if (head.left != null) {
			System.out.print("L: " + head.left.data);
		}
		if (head.right != null) {
			System.out.print("R: " + head.right.data);
		}

		System.out.println();
		printBST(head.left);
		printBST(head.right);
	}

	private static NodeBST<Integer> builtTreeUsingPreIn(int[] pre, int[] in) {

		return builtTreeUsingPreInHelper(pre, in, 0, pre.length - 1, 0, in.length - 1);
	}

	private static NodeBST<Integer> builtTreeUsingPreInHelper(int[] pre, int[] in, int siPre, int eiPre, int siIn,
			int eiIn) {

		if (siPre > eiPre)
			return null;

		int rootData = pre[siPre];
		NodeBST<Integer> root = new NodeBST<Integer>(rootData);
		int rootIndex = -1;
		for (int i = siIn; i <= eiIn; i++) {
			if (rootData == in[i]) {
				rootIndex = i;
				break;
			}
		}
		int siPreLeft = siPre + 1;
		int siInLeft = siIn;
		int eiPreRight = eiPre;
		int siInRight = rootIndex + 1;
		int eiInLeft = rootIndex - 1;
		int eiInRight = eiIn;

		int leftSubtreeLen = eiInLeft - siInLeft + 1;
		int eiPreLeft = siPre + leftSubtreeLen;
		int siPreRight = eiPreLeft + 1;

		root.left = builtTreeUsingPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
		root.right = builtTreeUsingPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);

		return root;
	}

}
