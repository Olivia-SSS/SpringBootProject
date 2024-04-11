package org.example.service;

import org.example.model.Press;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class PressService implements IPressService {
    private List<Press> pressList;

    public PressService() {
        pressList = Arrays.asList(
                new Press(1, "Title One", "Content for Title One", LocalDate.now()),
                new Press(2, "Title Two", "Content for Title Two", LocalDate.now().minusDays(1))
                // ... more articles
        );
    }

    @Override
    public List<Press> findAll() {
        return pressList;
    }

    @Override
    public Press findById(int id) {
        for (Press press : pressList) {
            if (press.getId() == id) {
                return press;
            }
        }
        return null;
    }
}


