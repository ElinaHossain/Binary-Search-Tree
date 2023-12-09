class Book implements Comparable<Book> {

	private String name;
	
	public Book(String name) {
		this.name = name;
	}
	
	// for Comparable interface
	@Override
	public int compareTo(Book aBook) {		
		return name.compareTo(aBook.name);
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "(" + name + ")";
	}

}