package accessModifiers2;

import accessModifiers.AccessModifiersMain;

public class AccessModifiersMainDifferentPackage  {

    public static void main(String[] args) {
        //   AccessModifiersMain.sayHelloUsingDefault();
        // can not get access to different package

        AccessModifiersMain.sayHelloUsingPublic(); // accessible from different package


        // AccessModifiersMain.sayHelloUsingPrivate(); // no access to other Class method


    }
}
