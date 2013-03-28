package com.lirtistasya.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UnmodifyableList<T> {
	private List<T>	list	= null;

	public UnmodifyableList(List<T> list) {
		this.list = list;
	}

	public void get( int position ) {
		list.get(position);
	}

	public Iterator<T> iterator() {
		return list.iterator();
	}

	public ListIterator<T> listIterator() {
		return list.listIterator();
	}

	public int size() {
		return list.size();
	}

	public boolean contains( T element ) {
		return list.contains(element);
	}

	public boolean containsAll( Collection<?> collection ) {
		return list.containsAll(collection);
	}

	public int indexOf( T element ) {
		return list.indexOf(element);
	}

	public int lastIndexOf( T element ) {
		return list.lastIndexOf(element);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public Object[] toArray() {
		return list.toArray();
	}

	public Object[] toArray( T[] arg0 ) {
		return list.toArray(arg0);
	}

	@Override
	public String toString() {
		return list.toString();
	}

	public List<T> subList( int arg0, int arg1 ) {
		return list.subList(arg0, arg1);
	}
}
