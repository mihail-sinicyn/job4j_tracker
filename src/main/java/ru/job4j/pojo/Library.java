package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book abc = new Book("Букварь", 50 );
        Book necronomicon = new Book("Некрономикон", 666 );
        Book constitution = new Book("Конституция РФ", 96 );
        Book cleanCode = new Book("Clean code", 464 );
        Book[] books= new Book[4];
        books[0] = abc;
        books[1] = necronomicon;
        books[2] = constitution;
        books[3] = cleanCode;
        for (Book book : books) {
            System.out.println(book.getName() + ". Количество страниц: " + book.getPageCount());
        }
        System.out.println(System.lineSeparator() + "Переставим местами книги с индексом 0 и 3.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println(book.getName() + ". Количество страниц: " + book.getPageCount());
        }
        System.out.println(System.lineSeparator() + "Выводом книг с именем \"Clean code\"");
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + ". Количество страниц: " + book.getPageCount());
            }
        }
    }
}
