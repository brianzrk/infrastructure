package com.origin.infrastructure.service.impl;

import com.origin.infrastructure.entity.Category;
import com.origin.infrastructure.mapper.CategoryMapper;
import com.origin.infrastructure.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author brian
 * @since 2021-11-29
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
