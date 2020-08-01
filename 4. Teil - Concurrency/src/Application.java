public class Application {

    public static void main(String[] args){

        Task t = new Task();
        Thread th0 = new Thread(t);
        th0.start();

        Thread th1 = new Thread(new Task());
        th1.start();

        System.out.println("Hallo");

        Task1 t2 = new Task1();
        t2.start();

        // Weiter Moeglichkeit mit anonymer Klasse
        Thread th2 = new Thread(new Runnable() { // mit Lambda Excpression ersetzbar
            @Override
            public void run() {
                for(int i=0; i < 1000; i++){
                    System.out.println(i + " " + Thread.currentThread().getName());
                }
            }
        });
        th2.start();

    }

    static class Task implements Runnable{

        public void run(){
            for(int i=0; i < 1000; i++){
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        }
    }

    static class Task1 extends Thread{

        public void run(){
            for(int i=0; i < 1000; i++){
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        }
    }
}
