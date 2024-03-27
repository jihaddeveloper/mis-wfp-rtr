package com.jihad.rtr.wfp.model;

import lombok.*;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "users")

//        uniqueConstraints = {
//        @UniqueConstraint(columnNames = {"username"}),
//        @UniqueConstraint(columnNames = {"email"})
//}
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String role;

//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "user_roles",
//            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
//    private Set<Role> roles;
}
