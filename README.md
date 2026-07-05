# Aviso V2

Aviso V2 is a modern JavaFX Desktop Application targeted for Windows. It provides a reliable graphical interface wrapped as a native Windows executable.

## Features
- **Modern UI**: Built using JavaFX 21 (OpenJFX) with FXML for declarative view definitions.
- **Internationalization (i18n)**: Fully localized application interface out-of-the-box (configured for French language).
- **Native Execution**: Leverages Launch4j to wrap the application into a standalone Windows `.exe` file.
- **Fat Jar Packaging**: Utilizes the Gradle Shadow plugin to bundle all runtime dependencies into a single, easily deployable fat jar.

## Architecture & Tech Stack
- **Language**: Java. The project is built using JDK 26 but produces Java 8 bytecode (`targetCompatibility = 1.8`) to ensure broad compatibility with legacy JRE 8 environments.
- **UI Framework**: JavaFX 21 (via OpenJFX).
- **Build System**: Gradle with the Gradle Wrapper.
- **Packaging Tools**: 
  - `com.gradleup.shadow` for merging dependencies into a fat jar.
  - `edu.sc.seis.launch4j` for generating the Windows executable wrapper.
- **Design Pattern**: MVC-inspired architecture using JavaFX controllers (e.g., `MainController`) and FXML views (`main.fxml`).
- **I18n**: Standard Java `ResourceBundle` approach using properties files for UX translation.

## Project Structure
```text
├── build.gradle          # Gradle build configuration
├── gradle/               # Gradle Wrapper files
├── src/
│   └── main/
│       ├── java/         # Java source code (Controllers, App entry point)
│       └── resources/    # FXML views, CSS styles, images, and i18n properties
└── README.md             # Project documentation
```

## Getting Started
Please refer to [DEPLOY.md](DEPLOY.md) for detailed instructions on setting up the development environment, compiling, and running the project.

## License
**Copyright (c) 2026. All rights reserved.**

This software and associated documentation files are PROPRIETARY and CONFIDENTIAL. The code is not to be used, distributed, or shared without express permission from the proprietary owner.
