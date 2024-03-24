package kodlama.o.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="plate", unique = true)
	private String plate;//arabanın plakası
	
	@Column(name="dailyPrice")
	private double dailyPrice;//liste fiyatı
	
	@Column(name="modelYear")
	private int modelYear;//araba kaç model
	
	@Column(name="state")
	private String state;//bu araba şuan ne durumda 1-available(kiralamaya müsait)
	//2-rented(kiralanmış)3-maintenance(bakımda)
	
    //burda sadece modeli geçmemiz yeterli içinde brand_id var çünkü
	@ManyToOne
	@JoinColumn(name="model_id")
	private Model model;
	
	
	
}