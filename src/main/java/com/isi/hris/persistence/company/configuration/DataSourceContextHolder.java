package com.isi.hris.persistence.company.configuration;

import org.springframework.stereotype.Component;

@Component
public class DataSourceContextHolder {
	private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

	public void setBranchContext(String companyId) {
		String dbName = String.format("%010d_erpcompany", Integer.valueOf(companyId));
		threadLocal.set(dbName);
	}

	public String getBranchContext() {
		return threadLocal.get();
	}

	public static void clearBranchContext() {
		threadLocal.remove();
	}
}
