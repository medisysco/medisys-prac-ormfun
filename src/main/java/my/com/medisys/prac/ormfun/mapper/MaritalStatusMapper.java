package my.com.medisys.prac.ormfun.mapper;

import java.util.List;

import my.com.medisys.prac.ormfun.entity.MaritalStatus;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
public interface MaritalStatusMapper {
    List<MaritalStatus> selectAll();
    MaritalStatus selectByMaritalStatusCode(String maritalStatusCode);
}
