package ENDSEM_Practice;

class InvalidBoxException extends Exception{
    InvalidBoxException(String title){
        super(title);
    }
}
class Box{
    int length, breadth, height;
    Box(int l, int b, int h) throws InvalidBoxException{
        if (l<=0 || b<=0 || h<=0 ){
            throw new InvalidBoxException("Invalid Box Dimesions!");
        }
        this.length = l;
        this.breadth = b;
        this.height = h;
    }
}
class UncheckedExceptionHandling{
    public static void main(String[] args) {
        try {
            Box b = new Box(2,0,5);
        }catch (InvalidBoxException e) {
            System.out.println("Invalid Box Dimensions catch statement");
        }
        System.out.println("Box Created");
    }
}


