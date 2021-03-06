package my.com.medisys.prac.ormfun.service;

import java.util.List;

import my.com.medisys.prac.ormfun.entity.Nationality;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
public interface NationalityService {
    List<Nationality> findAll();
    List<Nationality> selectAll();
    Nationality findByNationalityCode(String nationalityCode);
    Nationality selectByNationalityCode(String nationalityCode);
}
