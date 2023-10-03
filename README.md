# Що робить програма?
Програма може додавати нову книгу або видаляти з бібліотеки. Показувати всі книги в бібліотеці. Шукайти книгу за її назвою, номер ISBN, роком видавництвом. 
#Опис роботи:
Створив 2 класи: Book і Library (кожен з яких має атрибути та методи), а також до них тести LibraryTests і BookTests.
# Клас Book
Клас `Book` - об'єкт, що представляє собою книгу в бібліотеці. Він має такі атрибути:
- `name`: Назва книги.
- `author`: Автор книги.
- `ISBN`: Міжнародний стандартний номер книги.
- `yearPublication`: Рік публікації книги.
## Конструктор

Клас `Book` має наступний конструктор:
```java

 public Book(String name, String author, String ISBN, String yearPublication) {
    this.name = name;
    this.author = author;
    this.ISBN = ISBN;
    this.yearPublication = yearPublication;
}
```
## Методи
### В Класі Book є наступні методи:
* getName(): Повертає назву книги.
* getAuthor(): Повертає автора книги.
* getISBN(): Повертає ISBN книги.
* getYearPublication(): Повертає рік публікації книги.

# Клас Library

Клас `Library` представляє бібліотеку, яка має список книг та може виконувати різні операції з книгами. Клас має наступні атрибути:

- `_nameLibrary`: Назва бібліотеки.
- `_allBooks`: Список усіх книг у бібліотеці.

## Конструктори

Клас `Library` має наступні конструктори:

1. Конструктор без параметрів, який ініціалізує назву бібліотеки за замовчуванням ("School Library"):

```java
public Library() {
    _nameLibrary = "School Library";
}
```
## Методи
## `addBook()`

Метод `addBook(Book book)` додає нову книгу до бібліотеки.

## `displayAllBooks()`

Метод `displayAllBooks()` виводить список усіх книг у бібліотеці.

## `displayBook()`

Метод `displayBook(Book book)` виводить інформацію про окрему книгу.

## `findBookAtName()`

Метод `findBookAtName(String name)` знаходить книгу за назвою та виводить інформацію про неї.

## `removeBookAtISBN()`

Метод `removeBookAtISBN(String ISBN)` видаляє книгу за її ISBN та повертає відповідне повідомлення.
# BookTest
Клас `BookTests` містить юніт-тести для перевірки функціональності класу `Book`. Кожен тест перевіряє певний аспект роботи об'єктів класу `Book`.

##  `testGetName()`

Метод `testGetName()` перевіряє, чи коректно повертається назва книги за допомогою методу `getName()` класу `Book`.

## `testGetAuthor()`

Метод `testGetAuthor()` перевіряє, чи коректно повертається автор книги за допомогою методу `getAuthor()` класу `Book`.

##  `testGetISBN()`

Метод `testGetISBN()` перевіряє, чи коректно повертається ISBN книги за допомогою методу `getISBN()` класу `Book`.

##  `testGetYearPublication()`

Метод `testGetYearPublication()` перевіряє, чи коректно повертається рік публікації книги за допомогою методу `getYearPublication()` класу `Book`.

# Клас LibraryTests
Клас `LibraryTests` містить юніт-тести для перевірки функціональності класу `Library`. Кожен тест перевіряє певний аспект роботи бібліотеки.

##   `testAddBook()`

Метод `testAddBook()` перевіряє, чи коректно додається нова книга до бібліотеки за допомогою методу `addBook()` класу `Library`.

##   `testDisplayAllBooks()`

Метод `testDisplayAllBooks()` перевіряє, чи коректно виводиться список усіх книг у бібліотеці за допомогою методу `displayAllBooks()` класу `Library`.

##   `testFindBookAtName()`

Метод `testFindBookAtName()` перевіряє, чи коректно знаходиться книга за назвою та виводиться інформація про неї за допомогою методу `findBookAtName()` класу `Library`.

##   `testRemoveBookAtISBN()`

Метод `testRemoveBookAtISBN()` перевіряє, чи коректно видаляється книга за її ISBN та повертається відповідне повідомлення за допомогою методу `removeBookAtISBN()` класу `Library`.
