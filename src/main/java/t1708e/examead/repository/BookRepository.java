package t1708e.examead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import t1708e.examead.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}