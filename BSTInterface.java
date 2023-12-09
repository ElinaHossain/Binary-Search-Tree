public interface BSTInterface<Key, Value> {

	public  boolean isEmpty(); // is BST empty

	public  int     size(); // done

	public  boolean search(Key key); // search for specific key, return true if it exists, false otherwise

	public  void    insert(Key key, Value val); // done

	public  void    delete(Key key); // done

	public  int     levels(); // done

	public  void    display(); // display ALL levels

	public  void    displayLevel(int level); // display single level

}