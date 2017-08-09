package com.situ.day6;

import com.situ.day6.Outer.Inner;

public class OuterInnerTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
		//(e.g. x.new A() where x is an instance of Outer).
		Inner inner = outer.new Inner();
		inner.show();
	}
}
