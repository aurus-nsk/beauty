package com.beauty.web;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beauty.domain.BeautyOrder;

@Transactional
@RequestMapping("/beautyorders")
@Controller
@RooWebScaffold(path = "beautyorders", formBackingObject = BeautyOrder.class)
public class BeautyOrderController {
}
