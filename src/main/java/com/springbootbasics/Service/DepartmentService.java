package com.springbootbasics.Service;

import com.springbootbasics.Entity.Department;
import com.springbootbasics.Errors.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId,Department department);

    public Department fetchDepartmentByName(String departmentName);
}
