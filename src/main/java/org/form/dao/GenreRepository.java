package org.form.dao;

import org.form.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
