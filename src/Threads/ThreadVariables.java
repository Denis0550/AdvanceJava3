package Threads;

public class ThreadVariables {
    public static void main(String[] args) {
        WorkToDo workBaby = new WorkToDo("baby", 5);
        WorkToDo workMan = new WorkToDo("MAN", 10);
        workBaby.start();
        workMan.start();


        try {
            workBaby.join();
            workMan.join();
        } catch (InterruptedException e) { e.printStackTrace(); } //Join is blocking

        System.out.println("Baby FINAL position: " + workBaby.position);
        System.out.println("Man FINAL position: " + workMan.position);
    }
}

class WorkToDo extends Thread{
    String who;
    int jump;
    int position=0;

    public WorkToDo(String who, int jump) {
        this.who = who;
        this.jump = jump;
    }

    public void makeJump(){
        position = position + jump;
    }

    public void run() {
        while(position < 60) {
            makeJump();
            System.out.println(who + " is at " + position);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}