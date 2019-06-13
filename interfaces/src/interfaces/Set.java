package interfaces;

public interface Set<E> {
	
	public static <E> Set<E> make() {
		return null;
	}
	
    public int size();

    public boolean contains(E e);
    
    public void add(E e);

    public void remove(E e);

}
