public class KotlinValue {

    public static KotlinValue VOID = new KotlinValue(new Object());

    final Object value;

    public KotlinValue(Object value) {
        this.value = value;
    }

    public Double asDouble() {
        return Double.parseDouble(asString());
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Integer asInt() {
        return Integer.parseInt(asString());

    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    public boolean isInt() {
        return value instanceof Integer;
    }

    public boolean isString() {
        return value instanceof String;
    }

    public String getType() {
        if (isInt()) {
            return "Int";
        } else if (isDouble()) {
            return "Double";
        } else if (isString()) {
            return "String";
        }
        return null;
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != this.getClass()) {
            return false;
        }

        KotlinValue that = (KotlinValue) o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
