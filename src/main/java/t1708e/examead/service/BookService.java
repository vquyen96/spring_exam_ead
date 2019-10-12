package t1708e.examead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import t1708e.examead.entity.Book;
import t1708e.examead.repository.BookRepository;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public void create(Book book) {
        bookRepository.save(book);
    }
}
