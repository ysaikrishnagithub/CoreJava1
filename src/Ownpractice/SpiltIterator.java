package Ownpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpiltIterator {

	public static void main(String[] args) {
	List<String> wordlist= Arrays.asList("apple","ball","mango");
	Spliterator<String>sp1= wordlist.spliterator();
	Spliterator<String>sp2= sp1.trySplit();
	sp1.forEach(System.out.println());
	}

}
