package com.techiesbytes.NoteHub;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NoteController {

    @Autowired
    NoteRepository noteRepo;

    @PostMapping("/addNote")
    public @ResponseBody NoteEntity AddNote(@RequestParam String head, @RequestParam String desc)
    {
        NoteEntity note = new NoteEntity();
        note.setHeading(head);
        note.setDescription(desc);

        noteRepo.save(note);

        return note;
    }

    @GetMapping(path = "/Notes")
    public @ResponseBody Iterable<NoteEntity> GetAllNotes()
    {
        return noteRepo.findAll();
    }

    @DeleteMapping(path = "deleteNote")
    public String deleteNote(@RequestParam String heading)
    {
        List<NoteEntity> notesToDelete = noteRepo.findByHeading(heading);

        if(!notesToDelete.isEmpty())
        {
            noteRepo.deleteAll(notesToDelete);

            return "Deleted notes : "+notesToDelete.size()+" with heading : "+heading;
        }
        else{
            return "Notes with heading :"+heading+" not found";
        }
    }

    @PutMapping(path = "/updateNote")
    public String updateNote(@RequestParam String heading , @RequestParam String description)
    {
        List<NoteEntity> noteToUpdate = noteRepo.findByHeading(heading);

        if(!noteToUpdate.isEmpty())
        {
            for(NoteEntity note:noteToUpdate)
            {
                note.setHeading(heading);
                note.setDescription(description);
                noteRepo.save(note);
            }
            return "Note Updated : "+noteToUpdate.size()+" with heading : "+heading;
        }
        else{
            return "Can't found note with heading :"+heading;
        }
    }
}
