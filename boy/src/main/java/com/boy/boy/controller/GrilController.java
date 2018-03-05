//package com.boy.boy.controller;
//
//import java.util.List;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.alibaba.fastjson.JSONObject;
//import com.boy.boy.domin.Gril;
//import com.boy.boy.repository.GrilRepository;
//import com.boy.boy.service.GrilService;
//
//@Controller
//@RequestMapping("/gril")
//public class GrilController {
//
//	@Autowired
//	private GrilRepository grilRepository;
//	
//	@Autowired
//	private GrilService grilService;
//	
//	/**
//	 * 查询女生列表
//	 * @return
//	 */
//	@GetMapping(value = "/grils")
//	@ResponseBody
//	public List<Gril> grilList(){
//		List<Gril> g = grilRepository.findAll();
//		return g ;		
//		
//	}
//	//json格式传参数，取值
//	@PostMapping(value = "/getgrils")
//	@ResponseBody
//	public List<Gril> getGrilList(@RequestBody String json){
//		//String love = gril.getLove();
//		//String cupSize = gril.getCupSize();
//		
//		JSONObject jsStr = JSONObject.parseObject(json);
//		String love = jsStr.getString("love");
//		String cupSize = jsStr.getString("cupSize");
//		System.out.println("json:"+json);
//		List<Gril> grilList = grilRepository.findByLoveContainingAndCupSizeContainingOrderByCupSizeDesc(love,cupSize);
//		
//		return grilList;
//	}
//	
//	@PostMapping(value = "/addgril")
//	@ResponseBody
//    public Gril addGril(Gril gril){
//    	return grilRepository.save(gril);
//    }
//	
//}
