class A {

}

class B {

}

class C extends A {

}

class D extends B {

}

class E extends C { //相当于E继承了C，间接继承了A

}
/*
	java支持简单的继承
	A，B其实都是继承了Object

	Object是所有类型的超类
*/
