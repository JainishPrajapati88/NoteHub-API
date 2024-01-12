
# NoteHub

NoteHub is a note-taking API powered by a Spring Boot (A Java Spring Framework). This API allows users to manage their notes in their individual environments, 

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
    - **Parameters:** In JSON
        - `head`: Note heading (String)
        - `desc`: Note description (String)
    - **Description:** Adds a new note with provided heading and description to the database.

2. **/Notes**
    - **Method:** GET
    - **Description:** Retrieves all notes from the database in JSON format.

3. **/GetByHead**
    - **Method:** GET
    - **Parameters:** It will need below parameter in URL like /GetByHead/heading
        - `heading`: Note heading (String)
    - **Description:** Retrieves a particular note heading and description based on passed heading of note in URL.

4. **/updateNote**
    - **Method:** PUT
    - **Parameters:** It will require below attributes as Query Parameter
        - `heading`: Note heading (String)
        - `headToUpdate`: New heading to be updated (String)
        - `descriptionToUpdate`: New description to be updated (String)
    - **Description:** Updates the description and heading of the note specified by old  heading.

5. **/deleteNote**
    - **Method:** DELETE
    - **Parameters:** It will need below parameter in URL like /deleteNote/heading
        - `heading`: Note heading (String)
    - **Description:** Deletes the note specified by heading from the database.

## Testing the API

You can test the NoteHub API using tools like Postman, Insomnia, or Visual Studio Code extensions. These tools provide comprehensive API testing capabilities to interact with the endpoints mentioned above.

## Implementing the NoteHub API

You can utilize this RESTful - API using any language like Java , Python , PHP , NodeJs etc.

