package nasr.com.khalidalseddiq_backend.doa;

import nasr.com.khalidalseddiq_backend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
