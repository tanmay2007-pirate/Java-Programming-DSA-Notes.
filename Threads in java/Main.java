
// 1. What is a thread?

// A thread is a small unit of execution within a program.
// Instead of doing everything one after another, multiple tasks can execute concurrently.






// java Automatically creates main thread.

// public class Main {
//     public static void main (String args[]){

//         System.out.println("Task 1");
//         System.out.println("Task 2");
//         System.out.println("Task 3");

//     }
// }










// Creating a thread using Thread class 
// One way is to extend the thread class.



// class Mythread extends Thread{

//     public void run (){
//         System.out.println("Thread is Running");
//     }
// }

// public class Main{
//     public static void main(String args[]){

//         Mythread t1 = new Mythread();

//         t1.start();


//     }
// }














// Another comman approach using Runnable interface

// class MyTask implements Runnable {

//     public void run() {
//         System.out.println("Task is running");
//     }
// }
// public class Main {

//     public static void main(String[] args) {

//         MyTask task = new MyTask();

//         Thread t1 = new Thread(task);

//         t1.start();
//     }
// }












// multiple Threads.

// class MyThread extends Thread {

//     public void run() {

//         for (int i = 1; i <= 5; i++) {
//             System.out.println(Thread.currentThread().getName()
//                     + " : " + i);
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         MyThread t1 = new MyThread();
//         MyThread t2 = new MyThread();

//         t1.start();
//         t2.start();
//     }
// }









// You can make a thread pause using:Thread.sleep()
// So the thread waits approximately one second between iterations.
// 1000 means:
// 1000 milliseconds = 1 second


// class MyThread extends Thread {

//     public void run() {

//         for (int i = 1; i <= 5; i++) {

//             System.out.println(i);

//             try {
//                 Thread.sleep(1000);
//             }
//             catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }







