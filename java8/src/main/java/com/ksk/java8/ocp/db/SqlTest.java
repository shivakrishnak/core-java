package com.ksk.java8.ocp.db;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;


public class SqlTest {

    public static void main(String[] args) throws  SQLException {
        Connection con = null;
        PreparedStatement pstmt = con.prepareStatement("");
        pstmt.setBigDecimal(1, BigDecimal.valueOf(153833.00));
        pstmt.setInt(2, 110592);
        pstmt.setNull(1, Types.VARCHAR);

        Long nullLong = null;

        pstmt.setLong(1, nullLong );
    }
}
