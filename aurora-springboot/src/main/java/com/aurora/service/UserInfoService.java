package com.aurora.service;

import com.aurora.dto.UserInfoDTO;
import com.aurora.dto.UserOnlineDTO;
import com.aurora.entity.UserInfo;
import com.aurora.vo.*;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

public interface UserInfoService extends IService<UserInfo> {

    void updateUserInfo(UserInfoVO userInfoVO);

    String updateUserAvatar(MultipartFile file);

    void saveUserEmail(EmailVO emailVO);

    void updateUserSubscribe(SubscribeVO subscribeVO);

    void updateUserRole(UserRoleVO userRoleVO);

    void updateUserDisable(UserDisableVO userDisableVO);

    PageResult<UserOnlineDTO> listOnlineUsers(ConditionVO conditionVO);

    void removeOnlineUser(Integer userInfoId);

    UserInfoDTO getUserInfoById(Integer id);
}
