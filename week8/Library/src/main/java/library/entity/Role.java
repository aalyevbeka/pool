package library.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roleid")
    private int id;

    private String roleName;

}
