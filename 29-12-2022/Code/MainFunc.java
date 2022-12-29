interface Func{
    static void display()
    {
        System.out.println("We can take wickets like this");
    }
    void arrays(String[] cricket);
    
}
class MainFunc{
    public static void main(String...args)
    {
         String wickets[]={"Bowled","LBW","Run-out","Stumping","Hit-out"};
         Func.display();
         Func f=(String[] cricket)->{
             for(String c:cricket)
             {
                 System.out.println(c);
             }
         };
         f.arrays(wickets);
    }
}