package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.database.NotesDatabase;
import ru.geekbrains.lesson6.notes.application.ConcreteNoteEditor;
import ru.geekbrains.lesson6.notes.domain.Note;
import ru.geekbrains.lesson6.notes.infrastructure.persistance.DatabaseContext;
import ru.geekbrains.lesson6.notes.presentation.queries.controllers.NotesController;
import ru.geekbrains.lesson6.notes.presentation.queries.views.NotesConsolePresenter;

import java.util.Collection;
import java.util.Date;

public class Program {

    public static void main(String[] args) {
        NotesController notesController = new NotesController(new ConcreteNoteEditor(new NotesConsolePresenter(), new DatabaseContext(new NotesDatabase())));
        System.out.println("Вытащили данные из базы");
        notesController.routeGetAll();
        System.out.println("\nСоздали новую запись");
        notesController.routeAddNote(new Note(20002,43,"любой","текст",new Date()));
        notesController.routeGetAll();
        System.out.println("\nУдалили запись по id = 3");
        notesController.routeRemoveNote(new Note(3));
        notesController.routeGetAll();
        System.out.println("\nУдалили запись по title = title #5");
        notesController.routeRemoveNote(new Note("title #5"));
        notesController.routeGetAll();




    }
}
