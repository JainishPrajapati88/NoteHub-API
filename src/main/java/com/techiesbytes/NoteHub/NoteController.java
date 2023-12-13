package com.techiesbytes.NoteHub;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {


    @Autowired
    private NoteService NoteServ;

    private final Logger LOGGER = LoggerFactory.getLogger(NoteEntity.class);

    @PostMapping("/addNote")
    public NoteEntity AddNote(@Valid @RequestBody NoteEntity note)
    {
        LOGGER.info("In Add Note router");
        return NoteServ.AddNote(note);
    }

    @GetMapping(path = "/Notes")
    public List<NoteEntity> GetAllNotes()
    {
        LOGGER.info("In Get all notes route");
        return NoteServ.PrintNotes();
    }

    @GetMapping(path = "/GetByHead/{head}")
    public NoteEntity GetNoteByHead(@PathVariable("head") String head)
    {
        LOGGER.info("In get not by heading route");
        return NoteServ.GetNoteByHead(head);
    }

    @DeleteMapping(path = "/deleteNote/{head}")
    public String deleteNote(@PathVariable("head") String heading)
    {
        LOGGER.info("In delete note by head route");
        return NoteServ.deleteNote(heading);
    }

    @PutMapping(path = "/updateNote")
    public String updateNote(@RequestParam String heading ,@RequestParam String headToUpdate ,@RequestParam String descriptionToUpdate)
    {
        LOGGER.info("In update note route");
        return NoteServ.UpdateNote(heading,headToUpdate,descriptionToUpdate);
    }
}
