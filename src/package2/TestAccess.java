package package2;

public class TestAccess {
    public static void main(String[] args) {
        AccessLevels obj = new AccessLevels();

        System.out.println(obj.defaultInt);
        System.out.println(obj.protectedInt);
        System.out.println(obj.publicInt);
    }
}
