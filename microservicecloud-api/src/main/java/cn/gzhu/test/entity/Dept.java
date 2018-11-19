package cn.gzhu.test.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true) //可以进行链式调用get,set
public class Dept implements Serializable //必须序列化
{
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//记录插入或者查询到的数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }
}
