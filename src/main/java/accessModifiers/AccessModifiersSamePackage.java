package accessModifiers;

public class AccessModifiersSamePackage {

    public static void main(String[] args) {
        AccessModifiersMain.sayHelloUsingDefault(); // accessible per package-private modifier. not same package
        AccessModifiersMain.sayHelloUsingPublic();  // accessible per public modifier
      //  AccessModifiersMain.sayHelloUsingPrivate();   // no access to other Class method
        AccessModifiersMain.sayHelloUsingProtected(); // accessible in same package
    }
}
