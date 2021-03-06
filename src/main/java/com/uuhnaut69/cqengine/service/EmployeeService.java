package com.uuhnaut69.cqengine.service;

import com.uuhnaut69.cqengine.model.Employee;

import java.io.IOException;
import java.util.Set;

public interface EmployeeService {

    /**
     * Generate Data
     *
     * @param csvPath
     */
    void generateData(String csvPath) throws IOException;

    /**
     * Find employee by id using cq engine
     *
     * @param id
     * @return Set {@link Employee}
     */
    Set<Employee> findEmployeeById(int id);

    /**
     * FInd employee by name start with using cq engine
     *
     * @param param
     * @return Set {@link Employee}
     */
    Set<Employee> findEmployeeHasNameStartWith(String param);

    /**
     * Find employee by job title using cq engine
     *
     * @param param
     * @return Set {@link Employee}
     */
    Set<Employee> findEmployeeByJobTitle(String param);

    /**
     * Find employee by job title using normal
     *
     * @param param
     * @return Set {@link Employee}
     */
    Set<Employee> normalFindEmployeeJobTitle(String param);

}
