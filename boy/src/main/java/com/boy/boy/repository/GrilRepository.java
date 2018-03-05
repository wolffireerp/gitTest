//package com.boy.boy.repository;
//
//import java.util.List;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.boy.boy.domin.Gril;
//
//
//
//public interface GrilRepository extends JpaRepository<Gril,Integer>{
//
//	//通过年龄来查询
//	public List<Gril> findByAgeAndCupSize(Integer age,String cupSize);
//
//	//通过罩杯来模糊查询
//	@Query("select u from Gril u where u.cupSize like %?1")
//	//List<Gril> findByCupSize(@Param("creditcardIdentity") String cupSize);
//	List<Gril> findByCupSize(@Param("creditcardIdentity") String cupSize);
//	
//	//通过年纪来模糊查询
//	//@Query("select u from Gril u where u.love like %?1")
//	//List<Gril> findByAge(@Param("age") Integer age);
//	//SELECT * FROM gril WHERE age LIKE "1%" AND cup_size LIKE "%B%" 
//	List<Gril> findByLoveContainingAndCupSizeContainingOrderByCupSizeDesc(String love,String cupSize);
//	
//	List<Gril> findByLoveContainingAndCupSizeContaining(String love,String cupSize,Sort sort);
//	
//	Page<Gril> findByLoveContainingAndCupSizeContaining(String love,String cupSize,Pageable pageable);
//	
//}              
