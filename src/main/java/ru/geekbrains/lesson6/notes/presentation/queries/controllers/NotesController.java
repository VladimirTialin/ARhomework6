package ru.geekbrains.lesson6.notes.presentation.queries.controllers;

import ru.geekbrains.lesson6.notes.application.interfaces.NoteEditor;
import ru.geekbrains.lesson6.notes.domain.Note;
import ru.geekbrains.lesson6.notes.infrastructure.persistance.DatabaseContext;
import ru.geekbrains.lesson6.notes.presentation.queries.controllers.Controller;

import java.util.Collection;
import java.util.Date;

public class NotesController extends Controller {


    private NoteEditor notesEditor;

    public NotesController(NoteEditor notesEditor){
        this.notesEditor = notesEditor;
    }

    public NotesController() {
    }

    public void routeAddNote(Note note) {
        this.notesEditor.add(note);
    }

        public void routeRemoveNote(Note note) {
        this.notesEditor.remove(note);
    }

    public void routeGetAll(){
        notesEditor.printAll();
    }
}
