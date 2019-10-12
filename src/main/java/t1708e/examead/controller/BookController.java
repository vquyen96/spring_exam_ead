package t1708e.examead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.examead.entity.Book;
import t1708e.examead.entity.Publisher;
import t1708e.examead.service.BookService;
import t1708e.examead.service.PublisherService;

import javax.validation.Valid;

@Controller
@RequestMapping(value = {"/books"})
public class BookController {
    @Autowired
    BookService bookService;

    @Autowired
    PublisherService publisherService;

    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String create(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("publishers", publisherService.getAll());
        return "book/form";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String store(Model model, @Valid Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("book", book);
            return "book/form";
        }
        bookService.create(book);
        return "redirect:/home";
    }
}
