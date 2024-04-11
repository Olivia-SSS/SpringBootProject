package org.example.service;

import org.example.model.Press;
import java.util.List;

public interface IPressService {
    List<Press> findAll();
    Press findById(int id);
}

