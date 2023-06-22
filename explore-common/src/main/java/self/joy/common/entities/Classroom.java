package self.joy.common.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Classroom extends BaseEntity {

    private String name;

    private int size;

}
