package dev.vivek.factory.ios;

import dev.vivek.factory.interfaces.Button;
import dev.vivek.factory.interfaces.Menu;
import dev.vivek.factory.interfaces.UIFactory;

public class IosUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IosButton();
    }
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
