package self.joy.framework.db;

import java.time.LocalDate;

/**
 * basic column in database
 */
public class BaseEntity {

    private Long id;

    private Long creator;

    private LocalDate createTime;

    private Long updater;

    private LocalDate updateTime;
}
