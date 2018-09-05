package my.com.medisys.prac.ormfun.service;

import java.util.List;

import my.com.medisys.prac.ormfun.entity.Patient;

public interface PatientService {
    List<Patient> findAll();
    List<Patient> selectAll();
    List<Patient> findAll(Patient patient);
    Patient findByPatientNo(int patientNo);
    Patient selectByPatientNo(int patientNo);
    Patient save(Patient patient);
    Patient update(int patientNo, Patient patient);
    Patient delete(int patientNo);
}
