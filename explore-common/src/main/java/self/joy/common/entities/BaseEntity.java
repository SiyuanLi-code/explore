package self.joy.common.entities;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDate;

/**
 * basic column in database
 */
@Data
public class BaseEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Long creator;

    @TableField(fill = FieldFill.INSERT)
    private LocalDate createTime;

    private Long updater;


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDate updateTime;

    @TableLogic(value = "1", delval = "0")
    private Integer isValid;
}
