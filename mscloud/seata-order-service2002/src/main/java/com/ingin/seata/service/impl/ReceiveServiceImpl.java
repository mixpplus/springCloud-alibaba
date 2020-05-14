package com.ingin.seata.service.impl;

import com.ingin.seata.dao.ReceiveDao;
import com.ingin.seata.pojo.Account;
import com.ingin.seata.service.ReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-14 15:14
 */
@Service
public class ReceiveServiceImpl implements ReceiveService {
    @Autowired
    private ReceiveDao receiveDao;
    @Override
    public void receive(Long id, Double money) {

        receiveDao.receive(id, money);

        Account account = new Account();
        account.setId(id);
        account = receiveDao.selectOne(account);
        account.setMoney(account.getMoney() + money);
        receiveDao.updateByPrimaryKeySelective(account);

    }
}
