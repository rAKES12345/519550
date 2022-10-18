class HelloWorld{
    public static void staticMethod(){
        System.out.println("Static example");

    }
    public void nonStaticMethod(){
        System.out.println("nonStatic example");
    }
    public void takeinput(){
        int Scanner sc = new Scanner();
        system.in.println(sc);
    }
   
   
    public static void main(String[] args){
        HelloWorld.staticMethod();//method call 1 by using class name.method name
      
        HelloWorld ref;
        ref =new HelloWorld();//method call 2 by using class name ref ,ref = new(keyword) and class name then ref.method name
        ref.nonStaticMethod();
        ref HelloWorld;
        ref =new HelloWorld;
        ref.takeinput();

    }
    
}
