package com.chap6;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
public class HelloDAO {
	private DataSource dataSource;
	
	//private PlatformTransactionManager transactionManager;
	private DataSourceTransactionManager transactionManager;
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
	}
	public void setTransactionManager(DataSourceTransactionManager transactionManager) {
		this.transactionManager=transactionManager;
	}
	
	public Object create(String msg) {
		DefaultTransactionDefinition def=new DefaultTransactionDefinition();
		TransactionStatus status=transactionManager.getTransaction(def);
		try {
			JdbcTemplate jdbc=new JdbcTemplate(dataSource);
			jdbc.execute("insert into test values('tcx5','forever5',3)");
			
		}catch (Exception e) {
			transactionManager.rollback(status);
			throw e;
		}finally {
			transactionManager.commit(status);
			System.out.println("over");
		}
		return 1;
	}
}
