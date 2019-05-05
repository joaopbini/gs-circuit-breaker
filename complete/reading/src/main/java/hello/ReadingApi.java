package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadingApi {

    private final BookService bookService;

    @Autowired
    public ReadingApi(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/to-read")
    public String toRead() {
        return bookService.readingList();
    }

}
