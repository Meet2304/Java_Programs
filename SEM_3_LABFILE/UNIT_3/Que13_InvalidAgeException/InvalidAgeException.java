package SEM_3_LABFILE.UNIT_3.Que13_InvalidAgeException;
/*
WAP to create a user defined checked exception 
invalidAgeException will be thrown when applying for 
Vehiclelisence if age is less than 18. Demonstrate in main.
 */

// if the question is to write a checked exception, the class should extend Exception and not RuntimException 
class invalidAgeException extends Exception{
    invalidAgeException(String title){
        super(title);
    }
}
class VehicleLicence{
    public void applyforlicence(int age) throws invalidAgeException{
        if(age<18){
            throw new invalidAgeException("Age must be more than 18 to Apply!");
        }
        else{
            System.out.println("Vehicle Licence Generated!");
        }
    }

    public static void main(String[] args) {
        try{
            VehicleLicence v = new VehicleLicence();
            v.applyforlicence(15);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }
}

