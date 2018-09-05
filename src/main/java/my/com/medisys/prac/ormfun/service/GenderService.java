package my.com.medisys.prac.ormfun.service;

import java.util.List;

import my.com.medisys.prac.ormfun.entity.Gender;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
public interface GenderService {
    List<Gender> findAll();
    List<Gender> selectAll();
    Gender findByGenderCode(String genderCode);
    Gender selectByGenderCode(String genderCode);
}
