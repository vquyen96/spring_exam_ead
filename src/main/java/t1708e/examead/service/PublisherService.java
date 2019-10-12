package t1708e.examead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import t1708e.examead.entity.Publisher;
import t1708e.examead.repository.PublisherRepository;

import java.util.List;

@Service
public class PublisherService {
    @Autowired
    PublisherRepository publisherRepository;

    public List<Publisher> getAll() {
        return publisherRepository.findAll();
    }
}
