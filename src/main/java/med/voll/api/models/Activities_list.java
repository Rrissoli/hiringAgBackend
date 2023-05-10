package med.voll.api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import med.voll.api.dtos.ActivitiesListDTOS.CreateActivityListDTO;

import java.util.Date;

@Data
@Entity(name = "Activities_list")
@Table(name = "activities_list")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Activities_list {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int show_order;

    private boolean backlog ;
    private Date createdAt;

    private Date updatedAt;

    @ManyToOne
    @JsonIgnore
    private Project project;

    public Activities_list(CreateActivityListDTO createActivityListDTO, Project project) {
        this.name = createActivityListDTO.getName();
        this.show_order = createActivityListDTO.getShow_order();
        this.backlog = createActivityListDTO.isBacklog();
        this.createdAt = new Date();
        this.project = project;
    }

}
