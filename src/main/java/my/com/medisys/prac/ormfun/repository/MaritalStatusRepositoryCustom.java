package my.com.medisys.prac.ormfun.repository;

import my.com.medisys.prac.ormfun.entity.MaritalStatus;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
public interface MaritalStatusRepositoryCustom {
    MaritalStatus findByMaritalStatusCode(String maritalStatusCode);
}
