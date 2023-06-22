package self.joy.common.constants;

/**
 * int类型数据库枚举
 */
public enum DatabaseIntEnum {

    VALID(1), DELETE(0);

    private final int value;

    DatabaseIntEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
