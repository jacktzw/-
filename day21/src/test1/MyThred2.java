package test1;

public class MyThred2 extends  Thread {
    MyThred1 t1=new MyThred1();
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(this.getName()+"-----"+i);
        }
    }
}
