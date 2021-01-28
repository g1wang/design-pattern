package com.stars.template;


/**
 * 饮品制作模板
 */
public abstract class BeverageMaker {
    //final 把方法锁定，以防任何继承类修改它的含义
    final void make(){
         opt1();
         opt2();
         opt3();
         opt4();

    }

    abstract void opt1();
    abstract void opt2();
    void opt3(){
        System.out.println("------opt3----");
    }
    void opt4(){
        System.out.println("------opt4----");
    }

}
