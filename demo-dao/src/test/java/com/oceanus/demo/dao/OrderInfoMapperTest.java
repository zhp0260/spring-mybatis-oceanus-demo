package com.oceanus.demo.dao;

import com.alibaba.fastjson.JSON;
import com.bj58.oceanus.client.Oceanus;
import com.oceanus.demo.model.OrderInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class OrderInfoMapperTest {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            URL url = OrderInfoMapperTest.class.getClassLoader().getResource("oceanus-config.xml");
            File file = new File(url.toURI());
            // 进程启动时要对 Oceanus 进行初始化
            Oceanus.init(file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   @Test
    public void insertTest() throws SQLException {
        for (long i = 1; i < 10; i++) {
            SqlSession session = sqlSessionFactory.openSession(false);
            int result = -1;
            try {
                OrderInfo orderInfo = new OrderInfo();
                orderInfo.setId(i);
                orderInfo.setTenant("baidu");
                orderInfo.setOrderNumber(String.valueOf(i));
                orderInfo.setGoodsNumber(String.valueOf(i));
                orderInfo.setManualNumber("1110");
                orderInfo.setSerialNumber(String.valueOf(i));
                orderInfo.setPlaceOfLoading("beijing");
                orderInfo.setSendCompany("beijing");
                orderInfo.setReceiveCompany("haerb");
                orderInfo.setUnloadPlace("haerb");
                orderInfo.setTotalNumber(100);
                orderInfo.setOrderCreateTime(new Date());
                orderInfo.setCreateTime(new Date());

				result = session.insert("com.oceanus.demo.dao.OrderInfoMapper.save",orderInfo);
                System.out.println(result);
                session.commit();
            } catch (Exception e) {
                e.printStackTrace();
                session.rollback();
            } finally {
                session.close();
            }
        }
    }



//	@Test
//	public void deleteTest() throws SQLException {
//		SqlSession session = sqlSessionFactory.openSession(true);
//		session.delete("com.fy56.platform.jttw.pigsy.dao.UserMapper.deleteUser");
//		session.close();
//	}
//@Test
    public void selectTest() throws SQLException {
        for (long id = 1; id <= 100; id++) {
            SqlSession session = sqlSessionFactory.openSession(true);
            try {

                OrderInfo orderInfo = new OrderInfo();
                orderInfo.setTenant("wuliu");
                orderInfo.setSerialNumber("221053");
//				select * from t_order where tenant =#{tenant} limit #{startIndex},#{pageSize}
                List<OrderInfo> user = session.selectList("com.oceanus.demo.dao.OrderInfoMapper.findByTenantAndSerialNumber", orderInfo);
                System.out.println(JSON.toJSONString(user));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                session.close();
            }
        }
    }
//
//	@Test
//	public void selectLimitTest() throws SQLException{
//		int pageSize = 10;
//		int pageNumber = 1;
//		for(;pageNumber<=10; pageNumber++){
//			int startIndex = (pageNumber-1) * pageSize;
//			Map<String, Integer> params = new HashMap<String, Integer>();
//			params.put("startIndex", startIndex);
//			params.put("pageSize", pageSize);
//
//			SqlSession session = sqlSessionFactory.openSession(true);
//			try {
//				List<User> users = session.selectList("com.oceanus.demo.dao.UserMapper.selectUserLimit", params);
//				System.out.println(users);
//			} catch(Exception e){
//				e.printStackTrace();
//			}finally {
//				session.close();
//			}
//		}
//	}

}
