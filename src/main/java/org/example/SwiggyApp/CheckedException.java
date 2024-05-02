package org.example.SwiggyApp;

public class CheckedException extends Throwable {
    String code;
    public CheckedException(String message, String code) {
        super(message);
        this.code = code;
    }
}
