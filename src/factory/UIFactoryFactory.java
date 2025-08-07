package factory;

import factory.abstractfactory.UIFactory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(Platform platform) {
        switch (platform) {
            case ANDROID:
                return new factory.abstractfactory.AndroidUIFactory();
            case IOS:
                return new factory.abstractfactory.IOSUIFactory();
//            case WEB:
//                return new factory.web.WebUIFactory();
            case WINDOWS:
                return new factory.abstractfactory.WindowsUIFactory();
//            case MACOS:
//                return new factory.abstractfactory.MacOSUIFactory();
//            case LINUX:
//                return new factory.abstractfactory.LinuxUIFactory();
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }
}
