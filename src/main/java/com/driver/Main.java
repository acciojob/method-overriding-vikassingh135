package com.driver;

class A {
  String meth() {
    return "Invoking method from class A";
  }
}

class B extends A {
  String meth() {
    return "Method is overridden in Extendend class B";
}

public static class Main {
   B b = new B();
   b.meth();
}
