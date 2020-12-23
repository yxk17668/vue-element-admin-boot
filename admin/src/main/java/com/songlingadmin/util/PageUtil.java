package com.songlingadmin.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.utils.ServletUtils;

import static com.ruoyi.framework.web.page.TableSupport.PAGE_NUM;
import static com.ruoyi.framework.web.page.TableSupport.PAGE_SIZE;


public class PageUtil {

    public static Page getPage()
    {
        Page page = new Page();
        page.setSize(ServletUtils.getParameterToInt(PAGE_SIZE));
        page.setCurrent(ServletUtils.getParameterToInt(PAGE_NUM));
        return page;
    }

    public static void setCondition()
    {

    }
}
