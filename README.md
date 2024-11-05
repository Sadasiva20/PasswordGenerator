
JPass is a simple password manager created in Java, allowing users to generate and display passwords based on a customizable length. It includes a clean, user-friendly GUI built using `Swing` and offers features like clearing the password display and dynamically changing the password length via a slider.

Features
- Password Generation: Generate a random password of a specified length.
- Adjustable Password Length: Use a slider to choose the desired password length (between 5 to 20 characters).
- Clear Button: Clears the displayed password.
- Dynamic Password Size: The password length updates dynamically on the UI when the slider is adjusted.
- Text Display: Displays the generated password in a text area that automatically wraps long passwords.

 Prerequisites

To run the project, you need the following:

Java 8 or higher: Make sure you have Java installed on your machine. You can verify by running `java -version` in the terminal.
 Getting Started
To run JPass in your preferred development environment, follow the steps below.

### Option 1: Command Line (Terminal)

1. Clone or Download the repository containing the Java files.
2. Compile and Run:
   - Navigate to the directory where the `Password_UI.java` file is located.
   - Compile the file using the following command:
     ```bash
     javac Password_UI.java
     ```
   - After compilation, run the program with:
     ```bash
     java Password_UI
     ```

3. The UI will launch and display a window with the password manager interface.

 Option 2: Eclipse IDE

If you're using Eclipse, follow these steps to run the project:

1. Download Eclipse IDE:
   - If you don't have Eclipse installed, download and install it from the [Eclipse Downloads Page](https://www.eclipse.org/downloads/).

2. Create a New Java Project:
   - Open Eclipse and select File > New > Java Project.
   - Name your project (e.g., `JPass`) and click Finish.

3. Import Java Files:
   - Right-click on the `src` folder inside your newly created project.
   - Select New > Class and create a class named `Password_UI` (or paste the code into the existing `Password_UI.java`).
   - Alternatively, you can copy the `Password_UI.java` file into the `src` folder directly.

4. Run the Program:
   - Right-click on the `Password_UI.java` file in the `Package Explorer` panel.
   - Select Run As > Java Application.

5. The UI will launch within Eclipse, and you can start interacting with the password manager interface.

 How to Use

1. Adjust Password Length: Move the slider to adjust the desired password length. The current size is displayed next to the slider.
2. Generate Password: Click the "Create Password" button to generate a random password based on the selected length.
3. Clear Password: Click the "Clear" button to erase the generated password from the display area.




