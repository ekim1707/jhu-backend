package practice.JHUBackend.repositories;

import practice.JHUBackend.entities.Journal;

import java.util.List;

public interface UserRepository {

    List<Journal> getAllEntries();
}
