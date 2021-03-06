package my.com.medisys.prac.ormfun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.com.medisys.prac.ormfun.entity.MaritalStatus;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
@Repository
public interface MaritalStatusRepository extends JpaRepository<MaritalStatus, String>, MaritalStatusRepositoryCustom {

}
