package self.joy.common.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import self.joy.framework.db.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class Classroom extends BaseEntity {

    private String name;

    private int size;

}
