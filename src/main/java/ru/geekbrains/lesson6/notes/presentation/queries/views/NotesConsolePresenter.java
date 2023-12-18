package ru.geekbrains.lesson6.notes.presentation.queries.views;

import ru.geekbrains.lesson6.notes.application.interfaces.NotesPresenter;
import ru.geekbrains.lesson6.notes.domain.Note;
import ru.geekbrains.lesson6.notes.infrastructure.persistance.Database;
import ru.geekbrains.lesson6.notes.infrastructure.persistance.DatabaseContext;

import java.util.Collection;

public class NotesConsolePresenter implements NotesPresenter {

    protected Database database;
    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note: notes) {
            System.out.println(note);
        }
    }

}
