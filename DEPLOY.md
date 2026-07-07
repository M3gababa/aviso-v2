# Deployment & Setup Guide

This guide details how to set up the development environment, import the project, compile, test, and run **Aviso V2**.

## 1. Dev Environment Setup

To start developing Aviso V2, ensure you have the following installed on your machine:
- **Java Development Kit (JDK)**: The project is compiled using **JDK 26**. Ensure JDK 26 is installed and set in your `JAVA_HOME` environment variable.
- **Target JRE**: Since the application targets Java 8 and uses JavaFX, any runtime environment running this app will need JRE 8 that bundles JavaFX (such as Azul ZuluFX 8, or Oracle JDK 8). OpenJFX 21 is automatically resolved during development via Gradle.
- **Gradle**: For version control.
- **Git**: For version control.

| Tool | Link | Installation actions |
|------|------|----------------------|
| **JDK (Java 26)** | [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) | Download and run the installer. Set `JAVA_HOME` environment variable. |
| **JRE (Java 8)** | [Oracle JRE](https://www.java.com/fr/download/) | Required to run the final app. Download and install. |
| **VS Code** | [VS Code Site](https://code.visualstudio.com/) | Download and run the installer. |
| **Java Extension** | [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) | Install directly from the VS Code Extensions Marketplace. |
| **Gradle** | [Gradle](https://gradle.org/releases/) | *No installation needed* (Project uses Gradle Wrapper `gradlew`). |
| **Git** | [Git SCM](https://git-scm.com/) | Download and install. Ensure Git is added to your system PATH. Create an account on GitHub. |

## 2. Importing the Project

You can import the project into your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code):
1. Open your IDE and select **Open** or **Import Project**.
2. Navigate to the root directory of the project (`Your\Path\to\Aviso V2`).
3. Select the `build.gradle` file (or the root folder) and open it as a **Gradle Project**.
4. The IDE will automatically sync the project and download all necessary dependencies, including OpenJFX 21.

## 3. Compiling the Project

The project uses the Gradle Wrapper, so you don't need a global Gradle installation.
Open a terminal in the project root and run:

```bash
# On Windows
gradlew.bat build
```
This command compiles the source code, processes resources, and packages the application.

## 4. Running the Application (Dev Mode)

To launch the application locally during development:

```bash
# On Windows
.\gradlew.bat run
```
This will compile the project and launch the JavaFX window.

## 5. Testing

To run the unit tests (if any are added to `src/test/java`):

```bash
# On Windows
gradlew.bat test
```
*Note: Currently, there are no tests configured in the project.*

## 6. Packaging & Deployment

Aviso V2 uses two plugins for packaging: the Gradle Shadow plugin (for creating a fat JAR) and Launch4j (for wrapping the JAR in a Windows `.exe`).

### Building the Fat JAR
To package the application and its dependencies into a single JAR file:
```bash
gradlew.bat shadowJar
```
This generates a fat JAR file inside `target/` or `build/libs/` named `aviso-v2-<version>-all.jar`. Note that JavaFX is intentionally excluded from this JAR, as the target JRE 8 is expected to provide it.

### Creating the Windows Executable (.exe)
To wrap the fat JAR into a native Windows executable (`AvisoV2.exe`):
```bash
gradlew.bat createExe
```
Once completed, the `.exe` file will be generated in the output directory, ready for distribution to end users.
