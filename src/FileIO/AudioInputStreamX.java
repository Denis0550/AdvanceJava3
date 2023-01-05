package FileIO;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class AudioInputStreamX {
    public static void main(String[] args) throws Exception {
        File fileIn = new File("C:\\Users\\dsoro\\Music\\epic.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(fileIn);
        Clip clip = AudioSystem.getClip();
        clip.open(ais);
        //clip.start();//WHy wont this run??


        /*String ans = "";
        while (!ans.equals("exit")) {
            Scanner in = new Scanner(System.in);
            ans = in.next();
            if (ans.equals("play")) {
                clip.start();
            }
        }
        clip.stop();
        clip.close();*/




        String ans = "play";
        while (!ans.equals("exit")) {
            Scanner in = new Scanner(System.in);
            ans = in.next();
            if (ans.equals("play")) {
                clip.start();
            } else if (ans.equals("pause")) {
                clip.stop();
            }
            else if(ans.equals("ff")){
                long currentPos = clip.getMicrosecondPosition();
                System.out.println(currentPos);
                clip.setMicrosecondPosition(currentPos + 5000000);//add 5sec ???
                clip.start();
            }

        }
        clip.stop();
        clip.close();

    }
}