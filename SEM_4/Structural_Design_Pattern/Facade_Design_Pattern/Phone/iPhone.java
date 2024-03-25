package SEM_4.Structural_Design_Pattern.Facade_Design_Pattern.Phone;

public class iPhone implements Phone {
    public String finalPhone;
    @Override
    public void builtPhone(String componentsRequired) {
        finalPhone = "iPhone with Components: " + componentsRequired;       
    }

    @Override
    public String deliverPhone() {
        return finalPhone;
    }
}
