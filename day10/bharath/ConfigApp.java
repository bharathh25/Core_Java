package com.day10.bharath;

/*
 * Mini Task – Real-world: App Config
Create a Config class:

With static final constants for APP_NAME, VERSION, PORT

A static block to print: "App config loaded"

Access and print all config info from main()

java
Copy code
class Config {
    static final String APP_NAME = "MyApp";
    static final String VERSION = "1.0";
    static final int PORT = 8080;

    static {
        System.out.println("App config loaded");
    }
}
 */

class Config {
    static final String APP_NAME = "MyApp";
    static final String VERSION = "1.0";
    static final int PORT = 8080;

    static {
        System.out.println("App config loaded");
    }
}

public class ConfigApp {
	public static void main(String[] args) {
		
		Config c = new Config();
		System.out.println(Config.APP_NAME);
		System.out.println(Config.VERSION);
		System.out.println(Config.PORT);
	}
}
