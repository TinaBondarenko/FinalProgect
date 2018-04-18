package TinaHW.MavenHW.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@Table (name ="car")
@NoArgsConstructor
 
public class Car extends BaseEntity {
 private String marka;
private String model;

@ManyToMany
@JoinTable(name = "car_servise", 
	joinColumns = @JoinColumn(name = "car_id"), 
	inverseJoinColumns = @JoinColumn(name = "servises_id"))
private List<Servises> servises = new ArrayList<>();
 
}
