package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("active: " + active);
        System.out.println("status:  " + status);
        System.out.println("message: " + message);
    }

    public static void main(String[] args) {
        Error error404 = new Error(true, 404, "Not Found");
        error404.printError();
        Error error409 = new Error(true, 409, "Conflict");
        error409.printError();
        Error error = new Error();
        error.printError();
    }
}
