package pri.growup.interceptor;


import pri.growup.constants.GrowUpConstants;
import pri.growup.persistence.BaseExample;
import pri.growup.util.ReflectUtils;

import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.util.Properties;

import com.fasterxml.jackson.databind.ser.Serializers;

/**
 * The Class SqlAddPageInterceptor
 * 为sql语句增加分页
 *
 * @author PLF
 */
@Component
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class SqlAddPageInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        if (invocation.getTarget() instanceof RoutingStatementHandler) {
            RoutingStatementHandler handler = (RoutingStatementHandler) invocation.getTarget();
            BoundSql boundSql = handler.getBoundSql();
            processSql(boundSql);
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        if (target instanceof StatementHandler) {
            return Plugin.wrap(target, this);
        } else {
            return target;
        }
    }


    @Override
    public void setProperties(Properties properties) {

    }

    /**
     * 加工sql语句（添加分页的语句）
     *
     * @param boundSql
     */
    private void processSql(BoundSql boundSql) {
        Object o = boundSql.getParameterObject();
        if (o instanceof BaseExample) {
            BaseExample baseExample = (BaseExample) o;
            Integer startRecord = baseExample.getStartRecord();
            Integer recordNumForOnePage = baseExample.getRecordNumForOnePage();
            if (startRecord != null && recordNumForOnePage != null) {
                StringBuilder sb = new StringBuilder(boundSql.getSql());
                sb.append(GrowUpConstants.BLANK).append(GrowUpConstants.LIMIT)
                        .append(GrowUpConstants.BLANK).append(startRecord)
                        .append(GrowUpConstants.COMMA).append(recordNumForOnePage);
                ReflectUtils.setFieldValue(boundSql, "sql", sb.toString());
            }

        }

    }

}
