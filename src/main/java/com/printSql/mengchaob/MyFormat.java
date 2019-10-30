package com.printSql.mengchaob;

import com.p6spy.engine.common.P6Util;
import com.p6spy.engine.spy.appender.MessageFormattingStrategy;

/**
 * @author ：mengchao
 * @date ：Created in 2019/10/29 19:18
 * @description：自己拼接sql
 */
public class MyFormat  implements MessageFormattingStrategy {
    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql, String url) {
        System.out.println(now + "|" + elapsed + "|" + category + "|connection " + connectionId + "|url " + url + "|" + P6Util.singleLine(prepared) + "|" + P6Util.singleLine(sql));
        return sql;
    }
}
