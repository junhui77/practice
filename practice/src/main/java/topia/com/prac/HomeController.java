package topia.com.prac;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import topia.com.prac.entity.UserInfoList;
import topia.com.prac.personalHistory.serv.PersonalHistoryServImpl;
import topia.com.util.Criteria;
import topia.com.util.Paging;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	PersonalHistoryServImpl personalHistoryServ;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
//	
	
	
	@RequestMapping(value="/")
	public String list(Locale locale, Model model, HttpServletRequest request, HttpSession session , Criteria criteria ) {
		
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.info("list controller start~~~~~~~~~~~!");
		
		HashMap<String,Object> listReqMap = new HashMap<String,Object>();
		
		//검색 조건
		String userListSearchPeriod = request.getParameter("userListSearchPeriod");
		
		//검색어
		String userListSearchWord = request.getParameter("userListSearchWord");
		
		
		
		 if(request.getParameter("userListSearchPeriod")!=null && request.getParameter("userListSearchWord")!=null){
	          session.removeAttribute("userListSearchPeriod");
	          session.removeAttribute("userListSearchWord");
	          session.setAttribute("userListSearchPeriod",request.getParameter("userListSearchPeriod"));
	          session.setAttribute("userListSearchWord",request.getParameter("userListSearchWord"));
	       }
		 userListSearchPeriod = (String)session.getAttribute("userListSearchPeriod");
		 userListSearchWord = (String)session.getAttribute("userListSearchWord");

		 listReqMap.put("userListSearchPeriod",userListSearchPeriod);
		 listReqMap.put("userListSearchWord",userListSearchWord);
		
	
		listReqMap.put("userListSearchPeriod", userListSearchPeriod);
		listReqMap.put("userListSearchWord", userListSearchWord);
		
		//리스트 카운트
		int userListCnt = (int) personalHistoryServ.userInfoAllCnt(listReqMap);
		
		listReqMap.put("criteria", criteria);
		
		logger.info("list controller start~~~~~~~~~~~!");
		
		//리스트 조회
		List<UserInfoList> list= personalHistoryServ.userInfoList(listReqMap);
		
		
		
	     
		
		
		
		Paging paging = new Paging();
		paging.setCriteria(criteria);
		paging.setTotalCount(userListCnt);
		
		model.addAttribute("userList",list);
		model.addAttribute("userListSearchWord", userListSearchWord);
		model.addAttribute("userListSearchPeriod", userListSearchPeriod);
		

		
		
		
		
		logger.info("list end~~~~~~~~~~~!");
		logger.info("list" + list);
		//model.addAttribute("list", personalHistoryServ.userInfoList(listReqMap));
		//model.addAttribute("list",personalHistoryServ.userInfoList(cri));
		
		model.addAttribute("paging", paging);
		model.addAttribute("criteria", criteria);
		
		
		
		
		
		return "list";
		
		
	}
	
	private int parseInt(String parameter) {
		
		return 0;
	}
	
	
	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	public String getDetail(Model model, HttpServletRequest request) {
		String userIdx = request.getParameter("userIdx");
		model.addAttribute("userIdx", userIdx);
		logger.info("userIdx" + userIdx);
		return "home";
	}
	
	
	

	
	
}
