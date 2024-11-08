package com.nit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Projetest
{
public static void main(String[] args) {
Projec  pc =  new Projec();
	 int a =10;
	 int b=20;
	 int excepted =30;
	 int actual = pc.kan(a, b);
	assertEquals(excepted, actual);
}
	

}
