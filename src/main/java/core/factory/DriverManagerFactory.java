package core.factory;


import core.constants.DriverType;

public class DriverManagerFactory {

    public static DriverManager getDriver(DriverType driverType){
        switch (driverType){
            case CHROME : {
                return new ChromeDriverManager();
            }
            case FIREFOX: {
                return new FirefoxDriverManager();
            }
            default: {
                throw new IllegalArgumentException("Unexpected driverType: " + driverType);
            }
        }
    }
}
