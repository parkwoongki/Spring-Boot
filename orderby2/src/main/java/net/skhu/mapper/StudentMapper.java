package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {

    List<Student> findAll(int order);
}