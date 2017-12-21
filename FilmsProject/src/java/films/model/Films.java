/*
Класс модели Новость
 */
package films.model;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Котее4ка
 */
public class Films {
    
    private int id;
    private String name;
    private String description;
    private byte[] image;
    private Date date;
    

    public Films() {
    }

    public Films(int id, String name, String description, byte[] image, Date date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

       public Date getDate() {
        return date;
    }

    public byte[] getImage() {
        return image;
    }
    
     

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Arrays.hashCode(this.image);
        hash = 23 * hash + Objects.hashCode(this.date);
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
        final Films other = (Films) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Arrays.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Films{" + "id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + '}';
    }
}
