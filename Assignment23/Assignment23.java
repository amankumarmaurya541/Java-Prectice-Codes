package Assignment23;

public class Assignment23 {
    public static void main(String[] args) {
        GreetingApp greetingApp = new GreetingApp();
        greetingApp.greetUser("Aman Kumar Maurya");
        System.out.println("-------------------------------");
        greetingApp.greetInHindi("Priyanshu Vishwakarma");

    }
}
class GreetingApp{
    void greetUser(String userName){
        class Greeter{
            void morningGreet(){
                System.out.println("Good Morning " + userName);
            }
            void eveningGreet(){
                System.out.println("Good Evening " + userName);
            }
        }
        Greeter greeter = new Greeter();
        greeter.morningGreet();
        greeter.eveningGreet();
    }
    void greetInHindi(String userName){
        class HindiGreeter{
            void greet(){
                System.out.println("Namaste " + userName);
            }
        }
        HindiGreeter hindiGreeter = new HindiGreeter();
        hindiGreeter.greet();
    }
}
