package com.gioov.nimrod.system.controller;

import com.gioov.nimrod.common.Common;
import com.gioov.nimrod.common.constant.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.gioov.nimrod.user.service.UserService.SYSTEM_ADMIN;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2018-02-22
 */
@Controller
@RequestMapping(Page.System.VIEW_PAGE)
public class ViewPageController {

    @PreAuthorize("hasRole('" + SYSTEM_ADMIN + "') OR hasAuthority('/SYSTEM/VIEW_PAGE/PAGE_ALL')")
    @RequestMapping("/page_all")
    public String pageAll() {
        return Common.filterStartSlash(Page.System.VIEW_PAGE + "/page_all");
    }

    @RequestMapping("/add_dialog")
    public String addDialog() {
        return Common.filterStartSlash(Page.System.VIEW_PAGE + "/add_dialog");
    }

    @RequestMapping("/edit_dialog")
    public String editDialog() {
        return Common.filterStartSlash(Page.System.VIEW_PAGE + "/edit_dialog");
    }

}
