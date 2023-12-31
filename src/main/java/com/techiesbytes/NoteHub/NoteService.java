package com.techiesbytes.NoteHub;

import com.techiesbytes.NoteHub.exceptions.NoteNotFound;

import java.util.List;

public interface NoteService {

    public NoteEntity AddNote(NoteEntity note);

    public List<NoteEntity> PrintNotes();

    public String deleteNote(String heading);

    public String UpdateNote(String heading, String headToUpdate, String descriptionToUpdate);


    public NoteEntity GetNoteByHead(String head) throws NoteNotFound;
}
