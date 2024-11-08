package com.alexiwisteria.codepop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the CodePop application.
 * <p>
 * This is the entry point for the Spring Boot application. It bootstraps the application,
 * setting up the Spring application context and initializing all configured beans.
 * </p>
 *
 * <p>
 * The {@link SpringBootApplication} annotation enables Spring Boot's auto-configuration,
 * component scanning, and other setup features to streamline the application's startup process.
 * </p>
 *
 * @version 1.0
 */
@SpringBootApplication
public class CodePopApplication {

    /**
     * Main method to start the CodePop application.
     * <p>
     * This method invokes {@link SpringApplication#run(Class, String...)} to launch the
     * application using the specified arguments.
     * </p>
     *
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(CodePopApplication.class, args);
    }
}
