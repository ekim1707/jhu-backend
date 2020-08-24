package practice.JHUBackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import practice.JHUBackend.entities.Journal;
import practice.JHUBackend.repositories.UserRepository;

import java.util.List;

@Service
public class JournalService {

    private final UserRepository userDao;

    @Autowired
    public JournalService(@Qualifier("postgres") UserRepository userDao) { this.userDao = userDao; }

    public List<Journal> getAllEntries() {
        return userDao.getAllEntries();
    }
}
