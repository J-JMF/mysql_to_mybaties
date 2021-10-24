package com.example.mysql_to_mybaties.mapper;
        import com.example.mysql_to_mybaties.entity.Web;
        import org.apache.ibatis.annotations.Mapper;
        import java.util.List;


@Mapper
public interface WebMapper {
    public List<Web> findAllWeb();

    List<Web> findWebByid(int id);
}
