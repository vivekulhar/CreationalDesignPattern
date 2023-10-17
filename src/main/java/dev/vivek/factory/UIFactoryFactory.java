package dev.vivek.factory;

import dev.vivek.factory.android.AndroidUIFactory;
import dev.vivek.factory.interfaces.UIFactory;
import dev.vivek.factory.ios.IosUIFactory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms platform) {
        switch (platform) {
            case Android:
                return new AndroidUIFactory();
            case Ios:
                return new IosUIFactory();
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }
}
