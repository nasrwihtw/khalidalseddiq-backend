package nasr.com.khalidalseddiq_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Sound {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String title;

    private String Category;

    private String description;
    private String imageUrl;

    private String soundUrl;

}
