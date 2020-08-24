package practice.JHUBackend.repositories;

import org.springframework.stereotype.Repository;
import practice.JHUBackend.entities.Journal;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository("postgres")
public class UserDataAccessService implements UserRepository {

    @Override
    public List<Journal> getAllEntries() {
        return Arrays.asList(new Journal("FROM POSTGRES", "FROM POSTGRES", "FROM POSTGRES", "FROM POSTGRES", "FROM POSTGRES", "FROM POSTGRES"));
    }
}
