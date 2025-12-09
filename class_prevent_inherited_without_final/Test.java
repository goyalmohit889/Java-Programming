package class_prevent_inherited_without_final;

public class Test {
    public static void main(String[] args) {
        SecureClass s = SecureClass.getInstance();
        s.show();
    }
}
