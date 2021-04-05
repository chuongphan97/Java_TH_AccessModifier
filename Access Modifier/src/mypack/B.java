package mypack;

import pack.*;
class B{
    public static void main(String[] args) {
        A obj = new A ();
        obj.msg();
    }
}

class D extends C{
    public static void main(String[] args) {
        C obj = new C();
        obj.msg();
    }
}
