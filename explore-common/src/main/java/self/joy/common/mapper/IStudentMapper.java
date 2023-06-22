package self.joy.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import self.joy.common.entities.Student;

@Repository
public interface IStudentMapper extends BaseMapper<Student> {
}
