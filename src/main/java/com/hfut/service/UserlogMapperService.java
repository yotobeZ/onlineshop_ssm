package com.hfut.service;

import com.hfut.pojo.Userlog;

import java.util.List;

public interface UserlogMapperService {
    boolean login(Userlog userlog);
    List<Userlog> selectByExample(Userlog userlog);
    String insert(Userlog userlog);

}
