package Class_Codes;
/*
WAP to create a user defined checked exception 
invalidAgeException will be thrown when applying for 
Vehiclelisence if age is less than 18. Demonstrate in main.


 * Write a program to create a user defined InvalidboxException as an 
 * CHECKED Exception. Exception must be thrown from the constructor of 
 * the Box class if either of the dimension from length, width or height is zero or less than zero.
 * Demonstrate in main.
 */

// if the question is to write a checked exception, the class should extend Exception and not RuntimException 
class InvalidBoxException extends Exception{
    InvalidBoxException(String title){
        super(title);
    }
}
class Box{
    int l,b,h;

    Box(int l, int b, int h) throws InvalidBoxException{
        if(l <= 0 || b <= 0 || h <= 0)
            throw new InvalidBoxException("Box can not be created!!");
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public static void main(String[] args) {
        try{
            Box b = new Box(2,0,5); // Box is not created as b is equal to zero
            System.out.println("Box Created!!");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}

public class UserDefinedCheckedExceptionHandlingTest {
    
}
