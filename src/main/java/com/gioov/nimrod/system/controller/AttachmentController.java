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
@RequestMapping(Page.System.ATTACHMENT)
public class AttachmentController {

    @PreAuthorize("hasRole('" + SYSTEM_ADMIN + "') OR hasAuthority('/SYSTEM/ATTACHMENT/PAGE_ALL')")
    @RequestMapping("/page_all")
    public String pageAll() {
        return Common.filterStartSlash(Page.System.ATTACHMENT + "/page_all");
    }

    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/upload_one_dialog")
    public String uploadOneDialog() {
        return Common.filterStartSlash(Page.System.ATTACHMENT + "/upload_one_dialog");
    }

    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/upload_all_dialog")
    public String uploadAllDialog() {
        return Common.filterStartSlash(Page.System.ATTACHMENT + "/upload_all_dialog");
    }

    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/edit_dialog")
    public String editDialog() {
        return Common.filterStartSlash(Page.System.ATTACHMENT + "/edit_dialog");
    }

}
