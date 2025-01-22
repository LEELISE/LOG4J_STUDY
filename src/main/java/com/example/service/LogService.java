package com.example.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.example.dao.LogDAO;

@Service
public class LogService {
    private static final Logger logger = Logger.getLogger(LogService.class);

    private final LogDAO logDAO;

    public LogService(LogDAO logDAO) {
        this.logDAO = logDAO;
    }

    public void logActions() {
        logger.info("INFO: Service layer - Action logged");
        logger.warn("WARN: Potential issue identified");

        // DB 저장 호출
        logDAO.saveLog("This is a DB log example.");
    }
}
