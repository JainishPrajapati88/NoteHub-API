package com.techiesbytes.NoteHub;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity,Long> {


    public NoteEntity findByHeading(String heading);
}
