package TinaHW.MavenHW.entity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table (name ="Details")
@Getter @Setter

public class Details extends BaseEntity{
 private String allDetails;


}
