package Lambda;

public class Lambda2 {
    public static void main(String[] args) {

        //Screen obj = new Screen();//error
        //Screen scr = new Plancheta();
        //scr.Display();


       /*Screen scr = new Screen() {
           @Override
           public void Display() {
               System.out.println("Cool new Lambda trick!");
           }
       };
       scr.Display();*/

        //Screen scr = () -> {System.out.println("Display Home Screen1");};
        //Screen scr = () ->  System.out.println("Display Home Screen2");
        //scr.Display();

        //creation
        //ScreenX scr = (str) -> System.out.println("Display Home Screen" + str);
        //Parameter as regular text
        //scr.Display(" in 1080 x 1920 FULL HD!!");
        //Parameter passed as a variable str
        //String str = " in 720 x 1080";
        //scr.Display(str);
    }
}

interface Screen{
    void Display();
}

class Plancheta implements Screen{
    @Override
    public void Display() {
        System.out.println("Displaying Home Screen");
    }
}




interface ScreenX{
    void Display(String str);
}
