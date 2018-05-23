package res.mybatis.simple.mapper;
import java.util.List;

import com.example.connectrftest.ConnetcRftest;
public interface StudentMapper {
	ConnetcRftest selectById(long id);
	void deleteById(long id);
	void insertById(ConnetcRftest con);
	List<ConnetcRftest> selectAll();
}
