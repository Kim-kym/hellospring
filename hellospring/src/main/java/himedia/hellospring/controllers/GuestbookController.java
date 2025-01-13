package himedia.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	/* Spring의 return type
	 * 1. ModelAndView : 모델과 함께 viewName을 반환 
	 * 2. Stirng : viewName 
	 * 3. @ResponseBody: 어노에티션을 명시 
	 * 		-> 메서드의 출력을 직접 아웃풋으로 내보낸 (MessageConverter)
	 */
	
	@ResponseBody
	@GetMapping("/list")	//	/guestboook/list url 처리
	public String list() {
		return "<h1>Guestbook: list</h1>";
	}
	
	@ResponseBody
	@RequestMapping(value="add", method=RequestMethod.GET) 
	public String add() {
		return "<h1>Guestbook: add</h1>";
	}
}
