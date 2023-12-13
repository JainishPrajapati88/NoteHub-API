package com.techiesbytes.NoteHub;

import java.util.List;
import java.util.Optional;

import com.techiesbytes.NoteHub.exceptions.NoteNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    NoteRepository NoteRepo;


    @Override
    public NoteEntity AddNote(NoteEntity note) {
        return NoteRepo.save(note);
    }

    @Override
    public List<NoteEntity> PrintNotes() {
        return NoteRepo.findAll();
    }

    @Override
    public String deleteNote(String heading) {
        NoteEntity NoteToDelete = NoteRepo.findByHeading(heading);

        if(NoteToDelete != null)
        {
            NoteRepo.delete(NoteToDelete);
            return NoteToDelete+" deleted";
        }
        else{
            return "Can't able to find that note...";
        }
    }

    @Override
    public String UpdateNote(String heading, String headToUpdate, String descriptionToUpdate) {

        NoteEntity NoteToUpdate = NoteRepo.findByHeading(heading);

        if(NoteToUpdate != null)
        {
                NoteEntity note = NoteToUpdate;
                note.setHeading(headToUpdate);
                note.setDescription(descriptionToUpdate);
                NoteRepo.save(note);

            return "Note updated : "+note;
        }
        else{
            return "can't find that note";
        }
    }

    @Override
    public NoteEntity GetNoteByHead(String head) throws NoteNotFound {
        NoteEntity note = NoteRepo.findByHeading(head);
        if(note == null)
        {
            throw new NoteNotFound("Note not found");
        }else{
            return note;
        }
    }


}
