//An example for passing by value
class Apple {
   public String color;
   public Apple(String color){ this.color = color; }
}

public class PassByValueApp {
    public static void main(String[] args){
        Apple myApple = new Apple("red");
        System.out.println("myApple: "+myApple); //display memory address
        System.out.println("Before the method: " + myApple.color);
        changeAppleColor(myApple);
        System.out.println("After the method: " + myApple.color);
    }

    //The method argument is a reference type (class)
    public static void changeAppleColor(Apple apple){
        System.out.println("apple: "+apple);//display memory address
        apple = new Apple("blue");
        System.out.println("apple: "+apple);//display memory address
        apple.color = "green";
    }
}