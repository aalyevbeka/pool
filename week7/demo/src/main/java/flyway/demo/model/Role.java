package flyway.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;
    private String roles;

    @OneToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private Set<User> users;

}
