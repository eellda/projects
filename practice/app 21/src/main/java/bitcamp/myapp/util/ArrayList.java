package bitcamp.myapp.util;

import java.util.Arrays;

public class ArrayList implements List {
	private static final int SIZE = 3;
	private int count;
	protected Object[] objects = new Object[SIZE];

	@Override
	public void add(Object object) {
		if (count == objects.length) {
			objects = Arrays.copyOf(objects, objects.length + (objects.length >> 1));
		}
		objects[count++] = object;
	}

	@Override
	public Object[] toArray() {
		return Arrays.copyOf(objects, count);
	}

	@Override
	public Object get(int index) {
		if (index < 0 || index >= count) {
			throw new IndexOutOfBoundsException("인덱스 무효");
		}
		return objects[index];
	}

	@Override
	public Object set(int index, Object object) {
		Object old = objects[index];
		objects[index] = object;
		return old;
	}

	@Override
	public boolean remove(Object object) {
		int index = indexOf(object);
		if (index == -1) {
			return false;
		}

		for (int i = index + 1; i < count; i++) {
			objects[i - 1] = objects[i];
		}
		objects[--count] = null;
		return true;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public int indexOf(Object object) {
		for (int i = 0; i < count; i++) {
			if (objects[i].equals(object)) {
				return i;
			}
		}
		return -1;
	}
}