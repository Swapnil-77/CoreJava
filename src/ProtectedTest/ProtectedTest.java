package ProtectedTest;

import Modifiers.ModifierProtected;
import Modifiers.ModifierPublic;

public class ProtectedTest extends ModifierProtected {

    public static void main(String[] args) {

        ProtectedTest protectedTest = new ProtectedTest();
        System.out.println(protectedTest.name);
        protectedTest.display();

        ModifierPublic modifierPublic = new ModifierPublic();
        System.out.println(modifierPublic.name);
        modifierPublic.display();
    }
}
