package t1708e.examead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import t1708e.examead.entity.Book;
import t1708e.examead.service.BookService;

import java.util.List;

@Controller
@RequestMapping(value = {"/", "/home"})
public class HomeController {

    @Autowired
    BookService bookService;

    @GetMapping
    public String index(Model model){
        List<Book> bookList = bookService.getAll();
        model.addAttribute("books", bookList);
        return "index";
    }
}
