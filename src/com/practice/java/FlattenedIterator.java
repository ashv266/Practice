package com.practice.java;

import java.util.Iterator;
import java.util.List;

//The FlattenedIterator<T> implements the Iterator interface: boolean hasNext() and T next().
//The class contains a private List<Iterator<T>> iteratorList;
//
//Example:
//iteratorList = [ [1,2,3,4], [5,6,7,8] ]
//[ [1], [5,6,7,8] ]
//next() -> 1  5  2  6  3  7  4  8

public class FlattenedIterator<T>{
	
	private static int index=0;
private List<Iterator<T>> iteratorList1;
	

	public FlattenedIterator<T>(List<Iteratot<T> iteratorList){
		this.iteratorList1 = iteratorList1;

}

public List<Iterator<T>> getIteratorList(){
	return iteratorList1;
}

public List<Iterator<T>> setIteratorList(List<iteratorList<T>> iteratorList ){
	this.iteratorList1 = iteratorList;
}

public Boolean hasNext(){
	for(Iterator it : iteratorList1){
		if(it.hasNext())
			return true;
}
return false;
}

public T next(){

if(iteratorList1.get(index).hasNext())
index+=1;
if(index > iteratorList1.size())
		index=0;
return it.next();
}

return null;
}

}

public class IteratorExample{

	public static void main(String[] args){

FlattenedIterator flatennedIterator = new FlattenedIterator(//IteratorList);	
	
}

}
