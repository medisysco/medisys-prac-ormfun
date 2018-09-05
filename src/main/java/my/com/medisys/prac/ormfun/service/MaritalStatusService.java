package my.com.medisys.prac.ormfun.service;

import java.util.List;

import my.com.medisys.prac.ormfun.entity.MaritalStatus;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
public interface MaritalStatusService {
    List<MaritalStatus> findAll();
    List<MaritalStatus> selectAll();
    MaritalStatus findByMaritalStatusCode(String maritalStatusCode);
    MaritalStatus selectByMaritalStatusCode(String maritalStatusCode);
}
