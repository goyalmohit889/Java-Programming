package class_prevent_inherited_without_final;

public class SecureClass {
    private SecureClass(){
        System.out.println("Secureclass object created");
    }

    public static SecureClass getInstance(){
        return new SecureClass();
    }

    public void show(){
        System.out.println("this class can not be inherited");
    }
}

