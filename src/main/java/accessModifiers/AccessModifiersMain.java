package accessModifiers;

public class AccessModifiersMain {
    public static void main(String[] args) {
        sayHelloUsingDefault();
        sayHelloUsingPublic();
        sayHelloUsingPrivate();
    }

    /**
    * There are 4 access modifiers. PUBLIC, PRIVATE, PROTECTED and DEFAULT (NO KEYWORD)
    * */

    /**
     * DEFAULT
     *
     * When there is no added access modifiers Java automatically sets method or VARIABLE default access
     * Default == package-private modifier
     */

    static void sayHelloUsingDefault (){
        System.out.println("Greetings with DEFAULT access!");
    }

    /**
     * PUBLIC
     *
     * IF added modifier is PUBLIC - it is visible and accessible from anywhere
     * it is the least safe access modifier!
     */

    public static void sayHelloUsingPublic(){
        System.out.println("Greetings with PUBLIC access!");
    }

    /**
     * PRIVATE
     *
     * Any Method, field, constructor with PRIVATE keyword is accessible just from same Class
     */

    private static void sayHelloUsingPrivate() {
        System.out.println("Greeting with PRIVATE access!");
    }

    /**
     * PROTECTED
     *
     * "IN-BETWEEN" safety check option between PUBLIC and PRIVATE
     *
     * PROTECTED is accesible from same PACKAGE (LIKE PACKAGE-PRIVATE modifier) and ACCESSIBLE IN ALL CHILD CLASSES
     * which match Parent CLASS
     */

    protected static void sayHelloUsingProtected () {
        System.out.println("Greeting with PROTECTED access!");
    }

}
