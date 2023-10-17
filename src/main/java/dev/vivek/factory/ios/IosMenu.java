package dev.vivek.factory.ios;

import dev.vivek.factory.interfaces.Menu;

public class IosMenu implements Menu {
    @Override
    public void showMenu() {
        System.out.println("Ios Menu");
    }
}
