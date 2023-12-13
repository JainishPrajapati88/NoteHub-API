package com.techiesbytes.NoteHub.exceptions;

public class NoteNotFound extends Exception{
    public NoteNotFound() {
        super();
    }

    public NoteNotFound(String message) {
        super(message);
    }

    public NoteNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public NoteNotFound(Throwable cause) {
        super(cause);
    }

    protected NoteNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
