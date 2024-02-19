class Thread1 extends Thread{
    public void run(){
        while(true){
            try{
                for(int i=0;i<5;i++){
                    System.out.println("BMSCE");
                    Thread.sleep(1000);
                }
            }catch(InterruptedException e){System.out.println("BMSCE IE");}
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        while(true){
            
            try{
                for(int i=0;i<5;i++){
                    System.out.println("CSE");
                    Thread.sleep(1500);
                }
                
            }catch(InterruptedException e){System.out.println("CSE IE");}
        }
    }
}


public class multi{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();t2.start();
    }
}
