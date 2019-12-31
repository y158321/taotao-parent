package com.taotao.service;

import com.taotao.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;

/**
 * Created by Administrator on 2018/4/26.
 */
public interface ItemService {

    public void say();

    TbItem getItemById(long itemId);

    EUDataGridResult getItemList(Integer page, Integer rows);

}