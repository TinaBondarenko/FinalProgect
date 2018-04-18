package TinaHW.MavenHW.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table  (name = "Price")
@Getter @Setter

public class Price extends BaseEntity {
	@Column(columnDefinition = "DECIMAL(5,2)")
	private BigDecimal price;

}
