package com.demo.test.test.generics;
class Grain {
public String toString() { 
    
    Test1 t = new Test1();
    test(t);
    return "Grain"; }
//static void com.demo.test.test(Test1< ? extends Mill> t) {}
static void test(Test1<?> t) {}
}

class Wheat extends Grain {
    public String toString() { return "Wheat"; }
}

class Mill {
Grain process() { return new Grain(); }
}

class WheatMill extends Mill {
    Wheat process() { return new Wheat(); }
}
class Test1<T>{}