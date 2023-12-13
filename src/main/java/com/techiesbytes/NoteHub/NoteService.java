package com.techiesbytes.NoteHub;

import java.util.List;

public interface NoteService {

    public NoteEntity AddNote(NoteEntity note);

    public List<NoteEntity> PrintNotes();

    public String deleteNote(String heading);

    public String UpdateNote(String heading, String headToUpdate, String descriptionToUpdate);


    public NoteEntity GetNoteByHead(String head);
}
