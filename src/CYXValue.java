import java.util.List;

public class CYXValue implements Comparable<CYXValue> {

    public enum SourceType {RETURN, COMMON} // 用于return语句跳出

    public static final CYXValue NULL = new CYXValue(null);
    public static final CYXValue VOID = new CYXValue();

    private Object value;

    private SourceType sourceType = SourceType.COMMON;

    private CYXValue() {
        value = new Object();
    }

    public CYXValue(Object val) {
        value = val;
    }

    //=========================toType

    public Boolean toBoolean() {
        if (value == null)
            return false;
        else if (value instanceof Number)
            return ((Number) value).doubleValue() != 0;
        else if (value instanceof String)
            return true;
        else if (value instanceof Boolean)
            return (Boolean) value;
        return false;
    }

    public Number toNumber() {
        return (Number) value;
    }

    public Integer toInt() {
        return ((Number) value).intValue();
    }

    public Double toDouble() {
        return ((Number) value).doubleValue();
    }

    public List<CYXValue> toList() {
        return (List<CYXValue>) value;
    }

    public String toStr() {
        return String.valueOf(value);
    }

    //=========================isType

    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    public boolean isNumber() {
        return value instanceof Number;
    }

    public boolean isInt() {
        return value instanceof Integer;
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    public boolean isList() {
        return value instanceof List<?>;
    }

    public boolean isVoid() {
        return this == VOID;
    }

    public boolean isNull() {
        return this == NULL || this == null;
    }

    public boolean isString() {
        return value instanceof String;
    }

    @Override
    public int compareTo(CYXValue cyxValue) {
        if (this.isNumber() && cyxValue.isNumber()) {
            if (this.equals(cyxValue)) return 0;
            else return this.toDouble().compareTo(cyxValue.toDouble());
        } else if (this.isString() && cyxValue.isString()) {
            return this.toStr().compareTo(cyxValue.toString());
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        CYXValue that = (CYXValue) obj;
        if (this.isNumber() && that.isNumber()) {
            double diff = Math.abs(this.toDouble() - that.toDouble());
            return diff < 0.000000000001;
        } else {
            return this.value.equals(that.value);
        }
    }

    public Class<?> getType() {
        if (value == null) return null;
        return value.getClass();
    }

    @Override
    public String toString() {
        StringBuilder retval;
        if (this == NULL)
            retval = new StringBuilder("cyxNULL");
        else if (this == VOID)
            retval = new StringBuilder("cyxVOID");
        else if (this.isList()) {
            retval = new StringBuilder("[");
            for (CYXValue item : this.toList()) {
                retval.append(item.toString()).append(",");
            }
            retval.append("]");
        } else
            retval = new StringBuilder(String.valueOf(value));
        return retval.toString();
    }

    public boolean checkTrue() {
        if (this.isBoolean())
            return this.toBoolean();
        if (this.isNull())
            return false;
        if (this.isNumber())
            return this.toDouble() != 0;
        if (this.isString())
            return this.toString().length() > 0;
        if (this.isList())
            return this.toList().size() > 0;
        return false;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }
}
