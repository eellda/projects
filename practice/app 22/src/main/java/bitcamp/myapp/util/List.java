package bitcamp.myapp.util;

public interface List extends Iterable {
	void add(Object value);
	Object get(int index);
	Object set(int index, Object value);
	Object[] toArray();
	boolean remove(Object value);
	int indexOf(Object b);
	int size();
}
