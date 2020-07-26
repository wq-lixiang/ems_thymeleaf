package world.lixiang.entity;

import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Emp {
    private String id;
    private String name;
    private double salary;
    private Integer age;
    private Date bir;
}
