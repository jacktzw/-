public class BreadCon {

    private Bread[] breads=new Bread[100];//最多只能存储6个面包
    private int index=0;

    //生产面包
    public synchronized void put(Bread bread){
        if(index>=100){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breads[index]=bread;
        System.out.println(Thread.currentThread().getName()+"生产了面包,编号为"+bread.getId());
        index++;//数组索引+1 方便下次存面包
        this.notify();//唤醒消费者
    }
    //消费面包
    public synchronized void consume(){
        if(index<=0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        index--;
        Bread bread=breads[index];//要消费的面包
        System.out.println(Thread.currentThread().getName()+"消费了面包,编号为"+bread.getId());
        breads[index]=null;//当前存储面包置空
        this.notify();//唤醒生产者
    }
}
