package com.ingin.seata.service.impl;

import com.ingin.seata.dao.SendDao;
import com.ingin.seata.feign.ReceiveFeign;
import com.ingin.seata.pojo.Account;
import com.ingin.seata.service.SendService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-14 15:00
 */
@Service
public class SendServiceImpl implements SendService {

    @Autowired
    private SendDao sendDao;

    @Autowired
    private ReceiveFeign receiveFeign;

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public void send(Long id, Double money) {

        Account account = new Account();
        account.setId(id);
        account = sendDao.selectOne(account);
        account.setMoney(account.getMoney()-money);
        // 扣钱
        sendDao.updateByPrimaryKeySelective(account);

        // 加钱
        String receive = receiveFeign.receive(2L, money);
        if ("出错了".equals(receive)) {
            throw new RuntimeException("occurred errors");
        }
        System.out.println("=======");
        System.out.println(receive);

    }
}
