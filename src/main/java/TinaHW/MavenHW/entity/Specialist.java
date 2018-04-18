package TinaHW.MavenHW.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table (name="Specialist")
@Getter @Setter

public class Specialist extends BaseEntity{

	private String fullname;
	private String specialization;
	
	@OneToMany(mappedBy = "specialist")
	private List<Servises> servises = new ArrayList<>();


}
