# Times Tables Practice Game

## Description
This project is a simple Times Tables Practice Game implemented in Java using Swing for the graphical user interface. The game is designed to help users practice their multiplication skills by providing random multiplication questions. Users can start the game by entering their name, and the game will generate questions for them to answer.

## Images
### Start
<img width="400" alt="image" src="https://github.com/user-attachments/assets/8b4c30bd-91af-41f2-bc2d-2a2df4de0bdd">

### Answer Questions
<img width="400" alt="image" src="https://github.com/user-attachments/assets/b0c998a8-5381-433b-baac-875f6d11e63a">

### Get 100% Correct
<img width="398" alt="image" src="https://github.com/user-attachments/assets/8db291a8-ec3a-46a8-a2a5-7e7969e12456">

### Get Feedback When Answering Incorrectly
<img width="478" alt="image" src="https://github.com/user-attachments/assets/751b8ec3-a205-484f-a97e-4a3019612a94">


## Features
- User-friendly graphical interface using Java Swing.
- Allows users to practice multiplication with random questions.
- Provides feedback on the number of correct and incorrect answers.
- Option to reset the game and start over.

## File Structure
The project consists of the following files:

- `Main.java`: The entry point of the application that initializes the GUI.
- `TimesTablesGUI.java`: Contains the main GUI logic for displaying the game interface.
- `StartButton.java`: Handles the action for the Start button.
- `SubmitButton.java`: Handles the action for the Submit button.
- `ResetButton.java`: Handles the action for the Reset button.
- `License.txt`: MIT License for the project.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed on your machine.
- An IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse, VS Code).

### Installation
1. Clone the repository to your local machine:
    ```sh
    git clone https://github.com/jdrome/TimesTablesGUI.git
    ```

2. Navigate to the project directory:
    ```sh
    cd TimesTablesGUI
    ```

3. Open the project in your preferred Java IDE.

### Running the Game
1. Compile the Java files:
    ```sh
    javac Main.java TimesTablesGUI.java StartButton.java SubmitButton.java ResetButton.java
    ```

2. Run the compiled `Main` class:
    ```sh
    java Main
    ```

## Usage
- Enter your name in the text field and click "Start" to begin the game.
- Answer the multiplication questions by entering your answer in the provided field and clicking "Submit."
- After completing all questions, the game will display your results.
- Click "Reset" to clear the current game and start again.

### Example
1. Enter your name and click "Start."
2. Answer the questions displayed in the GUI.
3. The game will show how many questions you answered correctly out of five.
4. You can reset the game anytime by clicking "Reset."

## License
This project is licensed under the MIT License - see the LICENSE file for details.
