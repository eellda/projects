package bitcamp.myapp.dao;

import java.util.Arrays;

public abstract class ObjectDao {
	private final int SIZE = 100;
	private int count;
	protected Object[] objects = new Object[SIZE];

	public void insert(Object object) {
		this.objects[count++] = object;
	}

	public void update(Object object) {
		this.objects[this.indexOf(object)] = object;
	}

	public void delete(Object object) {
		for (int i = this.indexOf(object) + 1; i < this.count; i++) {
			this.objects[i - 1] = this.objects[i];
		}
		this.objects[--this.count] = null;
	}

	public Object[] findAll() {
		return Arrays.copyOf(objects, count);
	}

	protected abstract int indexOf(Object b);

	public int size() {
		return this.count;
	}

	public Object get(int i) {
		if (i < 0 || i >= this.count) {
			return null;
		}
		return objects[i];
	}
}
