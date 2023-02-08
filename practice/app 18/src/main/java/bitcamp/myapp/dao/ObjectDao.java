package bitcamp.myapp.dao;

public abstract class ObjectDao {
	private Node head;
	private Node tail;
	private int size;

	public void insert(Object value) {
		Node node = new Node(value);

		if (this.tail == null) {
			this.head = this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	public void update(Object value) {
		int index = this.indexOf(value);

		if (index == -1) {
			throw new DaoException("변경할 값이 없노");
		}

		Node cursor = head;
		int i = 0;

		while ( i < index) {
			cursor  = cursor.next;
			i++;
		}
		cursor.value = value;
	}

	public void delete(Object value) {
		int index = this.indexOf(value);

		if (index == -1) {
			throw new DaoException("삭제할 데이터가 없농..");
		}

		Node prevNode = null;
		Node cursor = head;
		int i = 0;

		while (i < index) {
			prevNode = cursor;
			cursor = cursor.next;
			i++;
		}

		if (prevNode == null) {
			head = head.next;
			cursor.next = null;

			if (head == null) {
				tail = null;
			}
		} else {
			prevNode.next = cursor.next;
			cursor.next = null;

			if (prevNode.next == null) {
				tail = prevNode;
			}
		}
		size--;
	}

	public Object[] findAll() {
		Object[] values = new Object[this.size];
		int index = 0;
		Node cursor = this.head;

		while (cursor != null) {
			values[index++] = cursor.value;
			cursor = cursor.next;
		}
		return values;
	}

	protected abstract int indexOf(Object b);

	public int size() {
		return this.size;
	}

	public Object get(int index) {
		if (index < 0 || index >= this.size) {
			throw new DaoException("인덱스가 무효~");
		}

		Node cursor = head;
		int i = 0;

		while (i < index) {
			cursor = cursor.next;
			i++;
		}
		return cursor.value;
	}
}
