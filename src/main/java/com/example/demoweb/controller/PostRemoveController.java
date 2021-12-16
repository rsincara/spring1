package com.example.demoweb.controller;

import com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PostRemoveController {
    @Autowired
    PostService postsService;

    @ResponseBody
    @RequestMapping(path = "/remove/{id}", method = RequestMethod.GET)
    public RedirectView doRemove(@PathVariable("id") Long id) {
        postsService.remove(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:8000");
        return redirectView;
    }
}
