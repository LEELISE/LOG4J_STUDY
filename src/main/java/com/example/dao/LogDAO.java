package com.example.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class LogDAO {
    private static final Logger logger = Logger.getLogger(LogDAO.class);

    public void saveLog(String message) {
        // DB에 로그 저장 로직 (실제 JDBC/ORM 활용 가능)
        logger.error("ERROR: Simulated log save to DB - " + message);
    }
}
