import java.util.*;
import java.io.*;
public class User{
    String _name="";
    int _IQ = 0;
    public User(String name){
        this._name=name;

    }

    public String getName(){
        System.out.print("Welcome ");
        return _name;
    }

    public void setIQ(int iq){
        this._IQ = iq;

    }

    public String getIQ(){
        String r="";
        if (_name.equals("Jacob")){
            r="You're not smart. Not now, not ever.";
        }else if(!(_name.equals("Jacob"))){
            System.out.print(_name);
            if (_IQ > 100){
                r=", you're kinda smart.";
            }else if(_IQ>70 && _IQ<100){
                r=", you're getting there. Keep it up!";
            }else{
                r=", I'm sorry but you should quit.";
            }
        }
        return r;
    }

    public static void main (String[] args)throws IOException
    {
        Scanner a=new Scanner(System.in);
        String[] q = {"What is your name?","What is your IQ?"};
        System.out.println(q[0]);
        String name=a.next();
        User user = new User(name);
        System.out.println(user.getName());
        System.out.println(q[1]);
        int iq = a.nextInt();
        user.setIQ(iq);
        System.out.println(user.getIQ());
    }
}