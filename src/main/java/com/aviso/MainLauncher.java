/*
 * Copyright (c) 2026. All rights reserved.
 * 
 * This code is proprietary and confidential.
 * It is not to be used, distributed, or shared without express permission.
 */
package com.aviso;

/**
 * Non-JavaFX entry point for the application.
 *
 * <p>Launching a class that extends {@code javafx.application.Application}
 * directly from a fat jar can fail when JavaFX is not on the module path,
 * because the JavaFX launcher expects to find modules it can't resolve.
 * Using a plain POJO as the main class and delegating to
 * {@link javafx.application.Application#launch(Class, String...)} avoids
 * this problem entirely.</p>
 *
 * <p>This is the class referenced as {@code mainClass} in
 * {@code build.gradle} and in the Launch4j configuration.</p>
 */
public class MainLauncher {

    public static void main(String[] args) {
        App.launch(App.class, args);
    }
}
