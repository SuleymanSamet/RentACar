package kodlama.o.rentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	//buraya yazıcamız ilişkilendirme ismi olunan toblo ile referans alınan nesne arasında olur
	//nesne ilk yazılı 
	
	@OneToMany(mappedBy = "brand") //burda tek diğer tarafta çok brand ile ilişkilendirdik
	private List<Model> models;
	
	
	
	


}