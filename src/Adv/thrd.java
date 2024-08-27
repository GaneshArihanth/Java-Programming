package Adv;

public class thrd extends Thread {
    public static void main(String[] args) {
      for (int i = 0; i < 4; i++) {
        Thread thread = new Thread(new thrd());
        thread.start();
      }
    }
    /* 
    public void run() {
      System.out.println("java " + Thread.currentThread().getId());
      System.out.println("cpp " + Thread.currentThread().getId());
      System.out.println("python " + Thread.currentThread().getId());
      System.out.println("kotlin " + Thread.currentThread().getId());
    }
    */  
  }
  
  