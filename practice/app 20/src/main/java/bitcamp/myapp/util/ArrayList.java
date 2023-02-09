package bitcamp.myapp.util;

import java.util.Arrays;

public class ArrayList {
	private static final int SIZE = 3;
	private int count;
	protected Object[] objects = new Object[SIZE];

	public void append(Object object) {
		if (count == objects.length) {
			objects = Arrays.copyOf(objects, objects.length + (objects.length >> 1));
		}
		objects[count++] = object;
	}

	public Object[] getList() {
		return Arrays.copyOf(objects, count);
	}

	public Object get(int index) {
		if (index < 0 || index >= count) {
			throw new IndexOutOfBoundsException("인덱스 무효");
		}
		return objects[index];
	}

	public void modify(int index, Object object) {
		objects[index] = object;
	}

	public boolean delete(Object object) {
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

	public int size() {
		return count;
	}

	public int indexOf(Object object) {
		for (int i = 0; i < count; i++) {
			if (objects[i].equals(object)) {
				return i;
			}
		}
		return -1;
	}
}