# NoteHub

NoteHub is a self-hosted note-taking API powered by a Spring Boot (A Java Spring Framework). This API allows users to manage their notes in their individual environments, providing privacy and control over their data.

## Requirements

- **JDK:** JDK 17 or higher (Recommended: JDK 21)
- **Java IDE:** Intellij IDEA, Spring Tool Suite, Eclipse, or any preferred Java IDE.
- **Database:** MySQL with a database named "NoteHub" (ensure it's created before running the application).

## Setup Instructions

1. **Clone Repository:** Clone this repository to your local machine.
2. **IDE Configuration:** Open the project in your preferred Java IDE.
3. **Database Setup:** Create a MySQL database named "NoteHub" for data storage.
4. **Run Application:** Run the application using your IDE or the command line.

## Endpoints

1. **/addNote**
    - **Method:** POST
    - **Parameters:**
        - `noteHeading`: Note heading (String)
        - `noteDescription`: Note description (String)
    - **Description:** Adds a new note with provided heading and description to the database.

2. **/Notes**
    - **Method:** GET
    - **Description:** Retrieves all notes from the database in JSON format.

3. **/updateNote**
    - **Method:** PUT
    - **Parameters:**
        - `noteHeading`: Note heading (String)
        - `noteDescription`: New note description (String)
    - **Description:** Updates the description of the note specified by heading.

4. **/deleteNote**
    - **Method:** DELETE
    - **Parameters:**
        - `noteHeading`: Note heading (String)
    - **Description:** Deletes the note specified by heading from the database.

## Testing the API

You can test the NoteHub API using tools like Postman, Insomnia, or Visual Studio Code extensions. These tools provide comprehensive API testing capabilities to interact with the endpoints mentioned above.

## Implementing the NoteHub API

You can utilize this RESTful - API using any language like Java , Python , PHP , NodeJs etc.

## Purpose

NoteHub API is designed for individuals who value privacy and control over their note-taking applications. By enabling self-hosting on personal servers or home labs, NoteHub eliminates the need for user accounts, logins, or credential management, ensuring that important notes remain in the user's secure environment.

## Advantages of Spring Boot for APIs

Spring Boot offers several advantages for developing APIs, including:
- Rapid development and deployment.
- Convention over configuration approach for streamlined setup.
- Robust support for building RESTful APIs with minimal boilerplate code.
- Integration capabilities with various databases and tools, ensuring flexibility in development.
