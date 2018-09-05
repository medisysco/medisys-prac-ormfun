package my.com.medisys.prac.ormfun.mapper;

import java.util.List;

import my.com.medisys.prac.ormfun.entity.Gender;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
public interface GenderMapper {
    List<Gender> selectAll();
    Gender selectByGenderCode(String genderCode);
}
