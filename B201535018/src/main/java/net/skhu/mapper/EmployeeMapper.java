package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Employee;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM Employee WHERE id = #{id}")
    Employee findOne(int id);

    @Select("SELECT e.*, d.title departmentName     " +
            "FROM employee e LEFT JOIN department d " +
            " ON e.departmentId = d.id              ")
    List<Employee> findAll();

    @Insert("INSERT Employee (employeeNo, name, departmentId, salary, sex)     " +
            "VALUES (#{employeeNo}, #{name}, #{departmentId}, #{salary}, #{sex}) ")
    @Options(useGeneratedKeys=true, keyProperty="id")
    void insert(Employee employee);
}
