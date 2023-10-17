package dev.vivek.factory;

import dev.vivek.factory.interfaces.Button;
import dev.vivek.factory.interfaces.Menu;
import dev.vivek.factory.interfaces.UIFactory;

public class Client {
    public static void main(String[] args) {
        UIFactoryFactory factory = new UIFactoryFactory();
        UIFactory uiFactory = factory.getUIFactory(SupportedPlatforms.Android);

        Button button = uiFactory.createButton();
        button.showBUtton();
        Menu menu = uiFactory.createMenu();
        menu.showMenu();

        UIFactory uiFactory2 = factory.getUIFactory(SupportedPlatforms.Ios);
        Button button2 = uiFactory2.createButton();
        button2.showBUtton();
        Menu menu2 = uiFactory2.createMenu();
        menu2.showMenu();
    }
}
