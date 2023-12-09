import java.util.NoSuchElementException;

public class BST<Key extends Comparable<Key>, Value> implements BSTInterface<Key, Value> {
	
	private Node root;

	private class Node {
		private final Key key;       // sorted by key
		private Value val;           // associated data
		private Node left;           // left subtree
		private Node right;          // right subtrees
		private int size;            // number of nodes in subtree

		public Node(Key key, Value val, int size) {
			this.key = key;
			this.val = val;
			this.size = size;
		}
	}	
	
	public void insert(Key key, Value val) {
		if(key == null || val == null) {
			System.out.println("key or val is null!");
			return;
		}
	
		root = insert(root, key, val);
	}
	
	private Node insert(Node n, Key key, Value val) {
	
		if(n == null) {
			return new Node(key, val, 1);
		}
		
		int cmp = key.compareTo(n.key);
		if(cmp < 0) {
			n.left = insert(n.left, key, val);
		}
		else if(cmp > 0) {
			n.right = insert(n.right, key, val);
		}
		else {
			n.val = val; // found identical keys, overwrite the val!
		}
		
		n.size = 1 + size(n.left) + size(n.right);
		return n;
	
	}
	
	public int size() {
		return size(root);
	}
	
	private int size(Node n) {
		if(n == null) {
			return 0;
		}
		return n.size;
	}
	
	public void delete(Key key) {
		if(key == null) {
			System.out.println("Key is null, unable to delete!");
			return;
		}
		
		root = delete(root, key);		
	}
	
	private Node delete(Node n, Key key) {
	
		if(n == null) {
			return null;
		}
		
		int cmp = key.compareTo(n.key);
		if(cmp < 0) {
			n.left = delete(n.left, key);
		}
		else if(cmp > 0) {
			n.right = delete(n.right, key);
		}
		else {			
			// found matching key, delete this node!
			if(n.right == null) {
				return n.left;
			}
			if(n.left == null) {
				return n.right;
			}
			
			Node tmp = n;
			n = min(tmp.right);
			n.right = deleteMin(tmp.right);
			n.left = tmp.left;			
		}
		
		n.size = 1 + size(n.left) + size(n.right);
		return n;
	
	}
	
	// return "smallest" key in this sub-tree
	private Node min(Node n) {
		if(n.left == null) {
			return n;
		}
		
		return min(n.left); // recursive call
	}
	
	// return a new sub-tree after deleting the "smallest" node
	private Node deleteMin(Node n) {
		if(n.left == null) {
			return n.right;
		}
		
		n.left = deleteMin(n.left); // recursive call
		
		n.size = 1 + size(n.left) + size(n.right);
		return n;
	}
	
	public  boolean isEmpty() {
		return (size(root) == 0); 
	}

	public boolean search(Key key) {
   if (key == null) {
      System.out.println("Unable to print, key is null");
   }
      return search(root, key);
   }

   private boolean search(Node n, Key key) {
   if (n == null) {
      return false;
    }

    int cmp = key.compareTo(n.key);
    if (cmp < 0) {
        return search(n.left, key);
    } else if (cmp > 0) {
        return search(n.right, key);
    } else {
        return true;
    }
   }

	public int levels() {
		return levels(root);
	}
	
	private int levels(Node n) {
		if(n == null) {
			return 0;
		}
		
		int left = levels(n.left);
		int right = levels(n.right);
		
		if(left < right) {
			return right + 1;
		}
		
		return left + 1;	
	}

   	public void display() {
      int numOfLevels = levels();
      int level = 0;
      while(level < numOfLevels) {
      displayLevel(root, level++);
      System.out.println();
    }
   }

      public void displayLevel(int level) {
      displayLevel(root, level);
   }

      // added private displayLevel method
      private void displayLevel(Node n, int level) {
      if(n != null) {
      if(level == 0) {
      System.out.print("(." + n.val + ".)" + "  ");
      }
      displayLevel(n.left, level-1);
      displayLevel(n.right, level-1);
      }
   }

}