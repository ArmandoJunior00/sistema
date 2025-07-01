package com.projeto.sistema.repositorys;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class ConfigDataBase {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // Driver MySQL
		dataSource.setUrl("jdbc:mysql://localhost:3306/loja"); // URL MySQL
		dataSource.setUsername("root"); // substitua conforme seu usuário
		dataSource.setPassword("@rmandojr2025"); // substitua conforme sua senha
		return dataSource;
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL); // Driver do banco
		adapter.setShowSql(true); // Mostrar SQL no console
		adapter.setGenerateDdl(true); // Gerar DDL automaticamente
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect"); // Dialeto MySQL
		adapter.setPrepareConnection(true);
		return adapter;
	}
}


