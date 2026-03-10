package com.mycompany.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public String getMessage() {
        return "Hello World!";
    }

    public static void main(String[] args) throws InterruptedException {

        // ANSI Colors
        String RESET = "\u001B[0m";
        String BOLD = "\u001B[1m";
        String CYAN = "\u001B[36m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String PURPLE = "\u001B[35m";
        String BLUE = "\u001B[34m";
        String GRAY = "\u001B[90m";

        String time = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String appName = "Java CI/CD DevOps App";
        String version = "3.0.0";
        String env = "Production";

        String javaVersion = System.getProperty("java.version");
        String os = System.getProperty("os.name");
        String user = System.getProperty("user.name");

        System.out.println(PURPLE + BOLD);
        System.out.println("   ██╗ █████╗ ██╗   ██╗ █████╗ ");
        System.out.println("   ██║██╔══██╗██║   ██║██╔══██╗");
        System.out.println("   ██║███████║██║   ██║███████║");
        System.out.println("██   ██║██╔══██║╚██╗ ██╔╝██╔══██║");
        System.out.println("╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║");
        System.out.println(" ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝");
        System.out.println(RESET);

        System.out.println(CYAN + BOLD + "        DEVOPS CI/CD TERMINAL DASHBOARD");
        System.out.println(GRAY + "==================================================" + RESET);

        System.out.println(BLUE + BOLD + "\n📦 APPLICATION INFO" + RESET);
        System.out.println("App Name     : " + appName);
        System.out.println("Version      : " + version);
        System.out.println("Environment  : " + env);
        System.out.println("Run Time     : " + time);

        System.out.println(GREEN + "\nHello World! Application successfully deployed." + RESET);
    }
}
