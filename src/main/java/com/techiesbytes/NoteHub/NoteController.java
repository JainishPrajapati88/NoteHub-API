package com.techiesbytes.NoteHub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NoteController {


    @Autowired
    private NoteService NoteServ;

    @PostMapping("/addNote")
    public @ResponseBody NoteEntity AddNote(@RequestParam String head, @RequestParam String desc)
    {
        NoteEntity note = new NoteEntity();
        note.setHeading(head);
        note.setDescription(desc);

        return NoteServ.AddNote(note);
    }

    @GetMapping(path = "/Notes")
    public @ResponseBody Iterable<NoteEntity> GetAllNotes()
    {
        return NoteServ.PrintNotes();
    }

    @DeleteMapping(path = "/deleteNote")
    public String deleteNote(@RequestParam String heading)
    {
        return NoteServ.deleteNote(heading);
    }

    @PutMapping(path = "/updateNote")
    public String updateNote(@RequestParam String heading ,@RequestParam String headToUpdate ,@RequestParam String descriptionToUpdate)
    {
        return NoteServ.UpdateNote(heading,headToUpdate,descriptionToUpdate);
    }
}
