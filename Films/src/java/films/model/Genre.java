/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Котеечка
 */
public class Genre {
    private int id;
    private String name;
    private List<Films> films;

    public Genre() {
    }

    public Genre(int id, String name, List<Films> films) {
        this.id = id;
        this.name = name;
        this.films = films;
    }

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
        films = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Films> getFilms() {
        return films;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFilms(List<Films> films) {
        this.films = films;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.films);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Genre other = (Genre) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        // todo error equals
        if (!Objects.equals(this.films, other.films)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Genre{" + "id=" + id + ", name=" + name + ", films=" + films + '}';
    }    
}

