package ENDSEM_Practice;

class InvalidAgeException extends Exception{
    InvalidAgeException(String title){
        super(title);
    }
}
 
public class CheckedExceptionHandling {
    public void ApplyforLisence(int a) throws InvalidAgeException{
        if (a<18){
            throw new InvalidAgeException("You are too young to apply!");
        }
        else{
            System.out.println("Lisecnce Application successfull!");
        }
    }

    public static void main(String[] args) {
        CheckedExceptionHandling Excep = new CheckedExceptionHandling();
        try{
            Excep.ApplyforLisence(15);   
        }catch( InvalidAgeException IAE){
            System.out.println(IAE.getMessage());
        }
    }
}
