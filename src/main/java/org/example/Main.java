public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Чайка на ім'я Джонатан Лівінгстон", "Річард Бах", "15646844666", "1970"));
        library.addBook(new Book("П'ятнадцятирічний капітан", "Жуль Верн", "32156541661523", "1878"));
        library.addBook(new Book("Пригоди Піноккіо", "Карло Коллоді", "335484866489565", "1883"));
        library.addBook(new Book("Книга джунглів", "Редьярд Кіплінг", "755241434546", "1894"));

        library.displayAllBooks();


        System.out.println("Test find at name: ");
        library.findBookAtName("Колобок");
        library.findBookAtName("Книга джунглів");

        System.out.println("Test remove at ISBN: ");
        library.removeBookAtISBN("253564");
        library.removeBookAtISBN("32156541661523");
        library.displayAllBooks();
    }
}
