package library.repository;

import library.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books,Long> {
}
