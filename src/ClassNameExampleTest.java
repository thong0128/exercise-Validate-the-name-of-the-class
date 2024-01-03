public class ClassNameExampleTest {
    private static ClassNameExample classNameExample;
    public static final String[] classname = {"C0223G", "A0323K", "M0318G", "P0323A"};

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        for(String className : classname) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Class name: " + className + " is " + (isValid?"valid":"invalid"));
        }
    }
}
