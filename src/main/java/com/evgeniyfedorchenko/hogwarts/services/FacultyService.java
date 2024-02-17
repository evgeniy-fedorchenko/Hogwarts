package com.evgeniyfedorchenko.hogwarts.services;

import com.evgeniyfedorchenko.hogwarts.models.Color;
import com.evgeniyfedorchenko.hogwarts.models.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyService {

    Faculty createFaculty(Faculty faculty);

    Optional<Faculty> findFaculty(Long id);

    Optional<Faculty> updateFaculty(Faculty faculty);

    Optional<Faculty> deleteFaculty(Long id);

    Optional<List<Faculty>> findFacultyByColorOrPartName(Color color, String name);
}
