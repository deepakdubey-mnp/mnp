package mnp.securities.user.management.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "mnp_authority")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthority {
   @Column(nullable = false)
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;

   @Column(unique = true)
    private String authority;

   @ManyToMany(mappedBy = "authorities")
   private List<User> users;

}