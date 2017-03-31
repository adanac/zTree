package com.adanac.study.ztree.controller;

/**
 * Created by allen on 2017/3/16.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZtreeController {
    //    core
    @RequestMapping(value = "core/standardData")
    public String standardData() {
        return "core/standardData";
    }

    @RequestMapping(value = "core/simpleData")
    public String simpleData() {
        return "core/simpleData";
    }

    @RequestMapping(value = "core/noline")
    public String noline() {
        return "core/noline";
    }

    @RequestMapping(value = "core/noicon")
    public String noicon() {
        return "core/noicon";
    }

    @RequestMapping(value = "core/customIcon")
    public String customIcon() {
        return "core/custom_icon";
    }

    @RequestMapping(value = "core/customIconSkin")
    public String customIconSkin() {
        return "core/custom_iconSkin";
    }

    @RequestMapping(value = "core/customFont")
    public String customFont() {
        return "core/custom_font";
    }

    @RequestMapping(value = "core/async")
    public String async() {
        return "core/async";
    }

    @RequestMapping(value = "core/asyncDb")
    public String asyncDb() {
        return "core/async_db";
    }

    @RequestMapping(value = "core/asyncFun")
    public String asyncFun() {
        return "core/async_fun";
    }

    @RequestMapping(value = "core/updateFun")
    public String updateFun() {
        return "core/update_fun";
    }

    @RequestMapping(value = "core/click")
    public String click() {
        return "core/click";
    }

    @RequestMapping(value = "core/url")
    public String url() {
        return "core/url";
    }

    @RequestMapping(value = "core/expand")
    public String expand() {
        return "core/expand";
    }

    @RequestMapping(value = "core/searchNodes")
    public String searchNodes() {
        return "core/searchNodes";
    }

    @RequestMapping(value = "core/otherMouse")
    public String otherMouse() {
        return "core/otherMouse";
    }

    //    excheck
    @RequestMapping(value = "excheck/chk")
    public String chk() {//方法名以chk开头
        return "excheck/checkbox";//return 与 html的名字保持一致
    }

    @RequestMapping(value = "excheck/chkNoCheck")
    public String chkNoCheck() {
        return "excheck/checkbox_nocheck";
    }

    @RequestMapping(value = "excheck/chkDisabled")
    public String chkDisabled() {
        return "excheck/checkbox_chkDisabled";
    }

    @RequestMapping(value = "excheck/chkHalfCheck")
    public String chkHalfCheck() {
        return "excheck/checkbox_halfCheck";
    }

    @RequestMapping(value = "excheck/chkCount")
    public String chkCount() {
        return "excheck/checkbox_count";
    }

    @RequestMapping(value = "excheck/chkFun")
    public String chkFun() {
        return "excheck/checkbox_fun";
    }

    @RequestMapping(value = "excheck/radio")
    public String radio() {
        return "excheck/radio";
    }

    @RequestMapping(value = "excheck/radioNoCheck")
    public String radioNoCheck() {
        return "excheck/radio_nocheck";
    }

    @RequestMapping(value = "excheck/radioChkDisable")
    public String radioChkDisable() {
        return "excheck/radio_chkDisabled";
    }

    @RequestMapping(value = "excheck/radioHalfCheck")
    public String radioHalfCheck() {
        return "excheck/radio_halfCheck";
    }

    @RequestMapping(value = "excheck/radioFun")
    public String radioFun() {
        return "excheck/radio_fun";
    }

//    exedit
    @RequestMapping(value={"exedit/drag"})
    public String drag(){
        return "exedit/drag";
    }
}
