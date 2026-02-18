package package1;

import package2.AccessLevels;

public class Test1 extends AccessLevels{
    public static void main(String[] args) {
        AccessLevels obj = new AccessLevels();

        System.out.println(obj.publicInt);
    }
    public void testTest(){
        System.out.println(protectedInt);
    }
}
