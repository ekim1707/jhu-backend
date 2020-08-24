package practice.JHUBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.JHUBackend.entities.Journal;
import practice.JHUBackend.service.JournalService;

import java.util.List;

@RequestMapping("api/v1/users")
@RestController
public class UsersController {

    private final JournalService journalService;

    @Autowired
    public UsersController(JournalService journalService) {
        this.journalService = journalService;
    }

    @GetMapping
    public List<Journal> getAllEntries() {
        return journalService.getAllEntries();
    }
}
