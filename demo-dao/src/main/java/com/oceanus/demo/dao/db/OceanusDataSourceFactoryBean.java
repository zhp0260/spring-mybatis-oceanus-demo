package com.oceanus.demo.dao.db;

import java.io.File;
import java.net.URL;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;

import com.bj58.oceanus.client.Oceanus;
import com.bj58.oceanus.exchange.jdbc.datasource.DataSourceWrapper;


public class OceanusDataSourceFactoryBean implements FactoryBean<DataSource> {

	private Properties properties;
	
	static{
		try {
			URL url = OceanusDataSourceFactoryBean.class.getClassLoader().getResource("oceanus-config.xml");
			File file = new File(url.toURI());
			Oceanus.init(file.getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public void setProperties(Properties props) {
		this.properties = props;
	}

	@Override
	public DataSource getObject() throws Exception {
		return new DataSourceWrapper(this.properties);
	}

	@Override
	public Class<?> getObjectType() {
		return DataSource.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
