package com.itheilv.mall.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheilv.mall.admin.mapper.UmsAdminPermissionRelationMapper;
import com.itheilv.mall.admin.model.UmsAdminPermissionRelation;
import com.itheilv.mall.admin.service.UmsAdminPermissionRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@Service
public class UmsAdminPermissionRelationServiceImpl extends ServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation> implements UmsAdminPermissionRelationService {

}
