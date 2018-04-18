package TinaHW.MavenHW.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name ="Servises")
@Getter @Setter

public class Servises extends BaseEntity{
	@Column (name ="Servises_name")
 private String servisname;
	
	@ManyToOne
	@JoinColumn(name = "Specialist_id")
	private Specialist specialist;
	

@ManyToMany
@JoinTable(name = "car_servise", 
	joinColumns = @JoinColumn(name = "servises_id"), 
	inverseJoinColumns = @JoinColumn(name = "car_id"))
private List<Car> car = new ArrayList<>();


@OneToOne
@JoinColumn(name = "servises_details_id")
private Details Details;
}
