package kodlama.o.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.o.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{
	boolean existsByName(String name);//jpa repository exist gördümü true false sorgusu olusturur isime göre
	

}
