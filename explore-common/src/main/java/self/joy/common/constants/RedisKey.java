package self.joy.common.constants;

public enum RedisKey {
    UPDATE_SIZE("classroom:update:size"), UPDATE_SIZE_SUB("classroom:id");

    private final String key;

    RedisKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
