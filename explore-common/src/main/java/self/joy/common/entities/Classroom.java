package self.joy.common.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class Classroom extends BaseEntity {

    private String name;

    private int size;

}
