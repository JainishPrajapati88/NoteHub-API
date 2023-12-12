package com.techiesbytes.NoteHub;

import java.util.List;
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
    public Iterable<NoteEntity> PrintNotes() {
        return NoteRepo.findAll();
    }

    @Override
    public String deleteNote(String heading) {
        List<NoteEntity> NoteToDelete = NoteRepo.findByHeading(heading);

        if(!NoteToDelete.isEmpty())
        {
            NoteRepo.deleteAll(NoteToDelete);
            return NoteToDelete+" deleted";
        }
        else{
            return "Can't able to find that note...";
        }
    }

    @Override
    public String UpdateNote(String heading, String headToUpdate, String descriptionToUpdate) {

        List<NoteEntity> NoteToUpdate = NoteRepo.findByHeading(heading);

        if(!NoteToUpdate.isEmpty())
        {
            for(NoteEntity note : NoteToUpdate)
            {
                note.setHeading(headToUpdate);
                note.setDescription(descriptionToUpdate);
                NoteRepo.save(note);
            }
            return "Note updated : "+NoteToUpdate.size()+" Note : "+NoteToUpdate;
        }
        else{
            return "can't find that note";
        }
    }
}