package com.itheilv.mall.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheilv.mall.admin.mapper.PmsProductCategoryAttributeRelationMapper;
import com.itheilv.mall.admin.model.PmsProductCategoryAttributeRelation;
import com.itheilv.mall.admin.service.PmsProductCategoryAttributeRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） 服务实现类
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@Service
public class PmsProductCategoryAttributeRelationServiceImpl extends ServiceImpl<PmsProductCategoryAttributeRelationMapper, PmsProductCategoryAttributeRelation> implements PmsProductCategoryAttributeRelationService {

}
