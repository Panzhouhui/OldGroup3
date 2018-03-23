package com.itsv.controller;

import com.github.pagehelper.PageInfo;
import com.itsv.domain.JiGou;
import com.itsv.service.JiGouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("jigou.html")
public class JiGouController {
	@Autowired
	private JiGouService jiGouService;

	//新增
    @RequestMapping(params = "act=add")
    public String addJiGou(JiGou jiGou){
	    jiGouService.addJiGou(jiGou);
	    return "redirect:jigou.html?act=getall";//查询呢所有
    }

    //查询所有
    @RequestMapping(params = "act=getall")
    public ModelAndView getAll(JiGou jiGou, @RequestParam(defaultValue = "1") int pageNum){
        PageInfo<JiGou> pageInfo = jiGouService.getJiGouAll(jiGou, pageNum,5);
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getPages());
        System.out.println(pageInfo.getPageSize());
        return new ModelAndView("jigou_list","pageInfo",pageInfo);
    }

    //条件查询
    @RequestMapping(params = "act=get")
    public ModelAndView getList(JiGou jiGou, @RequestParam(defaultValue = "1") int pageNum){
    	PageInfo<JiGou> pageInfo = jiGouService.getJiGouList(jiGou, pageNum,5);
    	return new ModelAndView("jigou_list", "pageInfo", pageInfo);
    }

    //修改查询
    @RequestMapping(params = "act=getJiGouById")
    public String getJiGouById(Integer id,Model model){
        JiGou jiGou = jiGouService.getJiGouById(id);
        model.addAttribute("jigou",jiGou);
        return "jigou_edit";//返回修改页面
    }

    //修改
    @RequestMapping(params = "act=update")
    public String updateJiGouById(JiGou jiGou){
        System.out.println(jiGou.getId());
        jiGouService.updateJiGouById(jiGou);
        return "redirect:jigou.html?act=getall";//查询所有
    }

    //删除
    @RequestMapping(params = "act=delete")
    public String  delete(Integer id){
    	jiGouService.deleteJiGouById(id);
        return "redirect:jigou.html?act=getall";//查询所有
    }

    @InitBinder
    public void InitBinder(HttpServletRequest request,ServletRequestDataBinder binder) {
        // 不要删除下行注释!!! 将来"yyyy-MM-dd"将配置到properties文件中
        // SimpleDateFormat dateFormat = new
        // SimpleDateFormat(getText("date.format", request.getLocale()));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, null, new CustomDateEditor(dateFormat, true));
    }

}
