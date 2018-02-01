
public class thisTest {  
    int number;
    System.out.println("number="+number);    
    thisTest increment(){
         number++;
         return this;
    }  
    private void print(){
         System.out.println("number="+number);
    }
    public static void main(String[] args) {
        thisTest tt=new thisTest();
         tt.increment().increment().increment().print();
    }
}