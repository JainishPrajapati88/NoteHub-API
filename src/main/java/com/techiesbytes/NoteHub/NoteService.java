package com.techiesbytes.NoteHub;

public interface NoteService {
    public NoteEntity AddNote(NoteEntity note);

    public Iterable<NoteEntity> PrintNotes();

    public String deleteNote(String heading);

    public String UpdateNote(String heading, String headToUpdate, String descriptionToUpdate);
}
