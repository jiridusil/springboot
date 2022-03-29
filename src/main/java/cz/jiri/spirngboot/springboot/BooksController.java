package cz.jiri.spirngboot.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author jdusil
 * @date 2021-10-18 11:24 AM
 */

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book(1l, "My first book", "Jiri"));
    }

}
