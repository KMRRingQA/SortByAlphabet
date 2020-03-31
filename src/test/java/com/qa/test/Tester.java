package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.main.AlphabeticSorter;

public class Tester {
	@Test
	public void amISearchTest() {
		assertEquals("alpha,asdfadsfa,awerudf,drama queen,hello world,omegalul,qiweut,qteuqg,zwefsx", AlphabeticSorter
				.sorter("alpha,omegalul,hello world,drama queen,asdfadsfa,awerudf,qteuqg,qiweut,zwefsx"));
		assertEquals("a,b,c,d,l,q,w,w,x,z", AlphabeticSorter.sorter("c,b,a,z,w,x,q,d,w,l"));

	}
}
