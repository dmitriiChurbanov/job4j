package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("first book", 1);
        Book book2 = new Book("Clean code", 0);
        Book book3 = new Book("third book", 3);
        Book book4 = new Book("fourth book", 4);
        Book[] books = {book1, book2, book3, book4};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + ", number of pages " + books[i].getNumberOfPages());
        }
        System.out.println("Переставили местами книги с индексом 0 и 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println(book.getName() + ", numbers of pages " + book.getNumberOfPages());
        }
        System.out.println("Вывод книг с именем \"Clean code\"");
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + ", numbers of pages " + book.getNumberOfPages());
            }
        }
    }
}