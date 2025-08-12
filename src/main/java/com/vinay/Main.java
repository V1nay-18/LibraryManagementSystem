package com.vinay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService service = new BookService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("📚 Welcome to Library Management System 📚");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Book");
            System.out.println("2. View Book by ID");
            System.out.println("3. Update Book Author");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    service.addBook(title, author);
                    System.out.println("✅ Book added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    Book book = service.getBook(id);
                    System.out.println(book != null ? "📖 " + book : "❌ Book not found.");
                }
                case 3 -> {
                    System.out.print("Enter Book ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Author: ");
                    String newAuthor = scanner.nextLine();
                    service.updateBook(id, newAuthor);
                    System.out.println("🔧 Book updated.");
                }
                case 4 -> {
                    System.out.print("Enter Book ID to delete: ");
                    int id = scanner.nextInt();
                    service.deleteBook(id);
                    System.out.println("🗑️ Book deleted.");
                }
                case 5 -> {
                    System.out.println("👋 Exiting... Goodbye!");
                    HibernateUtil.shutdown();
                    scanner.close();
                    return;
                }
                default -> System.out.println("⚠️ Invalid choice. Try again.");
            }
        }
    }
}
