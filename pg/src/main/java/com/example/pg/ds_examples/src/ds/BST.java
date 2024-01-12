package ds;

public class BST {
	Node root;

	public BST() {
		root = null;
	}

	Node insert(Node node, int key) {
		if (node == null) {
			node = new Node(key);
			return node;
		} else if (key > node.key) {
			insert(node.right, key);

		} else {
			insert(node.left, key);
		}

		return node;

	}

	Node search(Node root, int key) {
		if (root == null || key == root.key)
			return root;
		else if (key < root.key) {
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}

	}

	public static void main(String[] args) {
		BST tree = new BST();
		tree.root = tree.insert(tree.root, 10);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 5);
		int key = 10;
		Node ne = tree.search(tree.root, key);
		if (ne == null) {
			System.out.println(key + " not found");

		} else
			System.out.println(key + " found");
	}

}

class Node {
	int key;
	Node left, right;

	Node(int item) {
		key = item;
		left = right = null;
	}

}
