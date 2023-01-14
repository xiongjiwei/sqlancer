package sqlancer.tidb.ast;

public class TiDBCastOperation implements TiDBExpression {

    private final TiDBExpression expr;
    private final String type;
    private final boolean array;

    public TiDBCastOperation(TiDBExpression expr, String type) {
        this(expr, type, false);
    }

    public TiDBCastOperation(TiDBExpression expr, String type, boolean array) {
        this.expr = expr;
        this.type = type;
        this.array = array;
    }

    public TiDBExpression getExpr() {
        return expr;
    }

    public String getType() {
        return type;
    }

    public boolean isArray() {
        return array;
    }
}
